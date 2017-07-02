package com.lin.scala.basic

import scala.io.Source

/**
  * Created by congl on 7/1/2017.
  */
object ReadFile {
  def main(args: Array[String]): Unit ={
    if(args.length > 0){
      for(line <- Source.fromFile(args(0)).getLines()){
        println(line.length + " " + line)
      }
    } else{
      Console.err.println("Please enter filename")
    }
  }
}
