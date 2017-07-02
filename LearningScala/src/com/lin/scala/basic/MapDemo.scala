package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object MapDemo {
  def main(args: Array[String]): Unit ={
    //Similar to Set, Map can be either mutable or immutable
    /**
      * scala.collection.immutable.HashMap -> scala.collection.immutable.Map(<<trait>>) -> scala.collection.Map(<<trait>>)
      * scala.collection.mutable.HashMap -> scala.collection.mutable.Map(<<trait>>) -> scala.collection.Map(<<trait>>)
      */
    var immutableMap = Map[Int, String]()
    immutableMap += (1 -> "Monday")
    immutableMap += (2 -> "Tuesday")
    immutableMap += (3 -> "Wednesday")
    println("immutableMap(2): " + immutableMap(2))

    //immutable Map can be declared directly
    val immutableMap2 = Map(1 -> "Monday", 2 -> "Tuesday", 3 -> "Wednesday")

    import scala.collection.mutable
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig.")
    println("treasureMap(2): " + treasureMap(2))
  }
}
