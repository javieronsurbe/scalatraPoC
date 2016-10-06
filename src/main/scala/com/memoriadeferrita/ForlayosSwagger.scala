
package com.memoriadeferrita

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, JacksonSwaggerBase, Swagger}

class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with JacksonSwaggerBase{
  override protected implicit val jsonFormats: Formats = DefaultFormats
}

object ForlayosApiInfo extends ApiInfo(
  "Forlayos API",
  "Docs for Forlayos API",
  "http://memoriadeferrita.com",
  "jog@memoriadeferrita.com",
  "MIT",
  "http://opensource.org/licenses/MIT"
)
class ForlayosSwagger extends Swagger(Swagger.SpecVersion, "0.0.1", ForlayosApiInfo)