package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object SetDemo {
  def main(args: Array[String]): Unit ={
    /**
      * scala.collection.immutable.HashSet -> scala.collection.immutable.Set(<<trait>>) -> scala.collection.Set(<<trait>>)
      * scala.collection.mutable.HashSet -> scala.collection.mutable.Set(<<trait>>) -> scala.collection.Set(<<trait>>)
      */

    //By default Set is immutable
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println("Immutable jetSet: " + jetSet)
    println(jetSet.contains("Cessna"))

    import scala.collection.mutable
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println("Mutable movieSet: " + movieSet)

    //This is still immutable Set
    var testSet = Set("1", "2")
    testSet += "3"
    println("TestSet: " + testSet)
  }
}
