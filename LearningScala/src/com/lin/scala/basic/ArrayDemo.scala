package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object ArrayDemo {
  def main(args: Array[String]): Unit ={
    //Array is mutable
    val strArr:Array[String] = new Array[String](3)
    val strArr2 = new Array[String](3)
    strArr(0) = "a"
    strArr(1) = "b"
    strArr(2) = "c"

    //More concise way to declare an array
    //Same to val arr = Array.apply(1, 2, 3)
    val arr = Array(1, 2, 3)

    /**
      * When a variable followed by (), it will implicitly call apply method on it
      */
    println("Explicitly call apply method - Array: " + arr.apply(1))
    println("Implicitly call apply method - Array: " + arr(1))
    println("*************************")

    val str = "Hello"
    println("Explicitly call apply method - String: " + str.apply(1))
    println("Implicitly call apply method - String: " + str(1))
    println("*************************")

    val list = List(1, 2, 3);
    println("Explicitly call apply method - List: " + list.apply(1))
    println("Implicitly call apply method - List: " + list(1))
    println("*************************")

    /**
      * when an assignment is made to a variable to which parentheses and one or more
      * arguments havebeen applied, the compiler will transform that into an invocation
      * of an update method that takes thearguments in parentheses as well as the object
      * to the right of the equals sign
      */
    arr(0) = 10
    println("arr(0) is changed to: " + arr(0))
    arr.update(0, 20)
    println("arr(0) is changed to: " + arr(0))
    println("*************************")


  }
}
