package com.memoriadeferrita

import org.json4s.{DefaultFormats, Formats}
import org.scalatra._

class FilostrosController extends ScalatraServlet {
  protected implicit lazy val jsonFormats:Formats=DefaultFormats

  get("/") {
    Data.all
  }

}
