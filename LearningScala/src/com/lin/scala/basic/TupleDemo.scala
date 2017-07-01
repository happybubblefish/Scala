package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object TupleDemo {
  def main(args: Array[String]): Unit ={
    //Tuple is immutable
    //Tuple can contain different types of elements
    //Tuple can be used to return multiple objects from a method

    val pair = (99, "Hey, tuple")
    println(pair._1)
    println(pair._2)
  }
}
