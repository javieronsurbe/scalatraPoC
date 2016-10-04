
package com.memoriadeferrita

import scala.collection.mutable

object Data {
  case class Forlayo (id:String, name:String, number:Int, filostros:Seq[String], price: Double)

  val all= mutable.Map(1 -> Forlayo("1", "Forlayo uno", 100, Seq("filostro1", "filostro2"), 1000f))

}
