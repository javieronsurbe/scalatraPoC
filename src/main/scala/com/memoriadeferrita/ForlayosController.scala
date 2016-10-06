package com.memoriadeferrita

import com.memoriadeferrita.Data.Forlayo
import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.JacksonJsonSupport
import org.scalatra.swagger._

class ForlayosController(implicit val swagger: Swagger) extends ScalatraServlet with JacksonJsonSupport with SwaggerSupport{

  override protected val applicationDescription: String = "The forlayos API, use at your own risk"
  protected implicit lazy val jsonFormats:Formats=DefaultFormats.withBigDecimal

  val getForlayos=
    (
      apiOperation[List[Forlayo]]("getForlayos")
      summary "Show all forlayos"
      notes "Shows all the forlayos in system"
    )

  before() {
    contentType = formats("json")
  }

  get("/", operation(apiOperation[List[Forlayo]]("getForlayos"))) {
    Data.all
  }
  post("/",operation(apiOperation[Forlayo]("createForlayo"))){
    Data.all += (Data.nexId -> parsedBody.extract[Forlayo])
  }
  put("/:id", operation(apiOperation[Forlayo]("updateForlayo") parameters pathParam[String]("id"))){
    assert(params.get("id").isDefined)
    params.get("id") match {
      case Some(id) =>
        Data.all.update(id.toInt, parsedBody.extract[Forlayo])
      case None=>
        halt(404)
    }
  }
  delete("/:id", operation(apiOperation[Forlayo]("deleteForlayo") parameters pathParam[String]("id"))){
    assert(params.get("id").isDefined)
    params.get("id") match {
      case Some(id) =>
        Data.all -= id.toInt
      case None=>
        halt(404)
    }
  }


}
