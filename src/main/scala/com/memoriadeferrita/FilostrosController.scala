package com.memoriadeferrita

import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.JacksonJsonSupport

class FilostrosController extends ScalatraServlet with JacksonJsonSupport{

  protected implicit lazy val jsonFormats:Formats=DefaultFormats.withBigDecimal

  before() {
    contentType = formats("json")
  }

  get("/") {
    Data.all
  }
  post("/"){

  }
  put("/"){

  }
  delete("/"){

  }

}
