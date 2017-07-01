package com.lin.scala.basic

/**
  * Created by congl on 7/1/2017.
  */
object ListDemo {
  def main(args: Array[String]): Unit ={
    //List is immutable

    /**
      * Contenation two lists
      * :::
      */
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val combinedList = list1 ::: list2

    println(list1 + " and " + list2 + " are not mutated.")
    println("Thus, " + combinedList + " is a new list.")

    /**
      * Prepend an element to the beginning of a list
      * ::
      */
    val list3 = List(6, 7, 8)
    //Same to list3.::(10)
    //O(1)
    val prependedList = 10 :: list3
    println("Prepended list: " + prependedList)

    //O(n)
    val postpendList = list3 :+ 100
    println("Postpend list: " + postpendList)

    /**
      * Associativity
      * If a method is used in operator notation, such as a * b, the method is invoked on the left operand
      * If a method name ends with :, then the method is invoked on the right operand
      * For example, 10::list3 is same to list3.::(10)
      */

    //Empty list is Nil
    val emptyList = Nil
    println("The length of empty list: " + emptyList.size)

    //another way to declare a list
    val list4 = 1 :: 2 :: 3 :: Nil

    //The following is not working
    //var list4 = Nil
    //list4 = 1 :: 2 :: 3 :: Nil

    /**
      * List methods
      */

    val thrill = List("Will", "fill", "until")
    thrill.count(s => s.length == 4) //2
    thrill.drop(2) // drop the first 2 elements, return List("until")
    thrill.dropRight(2) // Return the thrill list without its rightmost 2 element, List("Will")
    thrill.exists(s => s =="until") //Return true
    thrill.filter(s => s.length == 4)
    thrill.forall(s => s.endsWith("l")) //Indicates whether all elements in the thrill list end with the letter "l", return true
    thrill.foreach(s => println(s)) // Same to thrill.foreach(println)
    thrill.head //Return the first element in the thrill
    thrill.init //Return a list of all but the last element in the thrill list
    thrill.isEmpty
    thrill.last //Return the last element in the thrill list
    thrill.length
    thrill.map(s => s + "y")
    thrill.mkString(", ") //Makes a string with the element of the list, return "Will, fill, until"
    thrill.filterNot(s => s.length == 4)
    thrill.reverse
    thrill.sortWith(_.charAt(0).toLower < _.charAt(0).toLower)
    thrill.tail // Return the thrill list minus its first elemernt
  }
}
