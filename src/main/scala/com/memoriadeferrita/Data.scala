
package com.memoriadeferrita

import scala.collection.mutable

object Data {

  case class Forlayo (name:String, number:Int, filostros:Seq[String], price: Double)

  val all= mutable.Map(1 -> Forlayo("Forlayo uno", 100, Seq("filostro1", "filostro2"), 1000f))

  val nexId=all.maxBy(_._1)._1 + 1

}
