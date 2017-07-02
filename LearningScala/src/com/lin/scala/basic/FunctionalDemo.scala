package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object FunctionalDemo {
  def main(args: Array[String]): Unit ={
    /**
      * If code contains any varS, it is probably in an imperative style.
      * If code contains no varS at all, contains only valS, it is probably in a functional style.
      * One way to move towards a functional style, is to try to program without varS
      */

    /**
      * print args with varS
      * imperative
      */

    var i = 0
    while(i < args.length){
      println(args(i))
      i += 1
    }

    /**
      * print args without varS - I
      * functional
      */
    for(arg <- args){
      println(arg)
    }

    /**
      * print args without varS - II
      * functional
      */
    args.foreach(println)
  }

  /**
    * Sign of a function with side effects is that its result type is Unit.
    * A more functional approach would be to define a method that formats the passed args for printing, but just returns the formatted string
    */
  def formatArgs(args: Array[String]) = args.mkString("\n")
}
