
package com.memoriadeferrita

object Data {
  case class Forlayo (id:String, name:String, filostros:Seq[String])

  val all= List(Forlayo("1", "Forlayo uno", Seq("filostro1", "filostro2")))

}
