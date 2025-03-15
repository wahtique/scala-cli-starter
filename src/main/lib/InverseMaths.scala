package starter.lib

import scala.collection.mutable.Stack

// sealed trait Token:
//   def eval(ctx: Stack[Int]): Int

// object Token:
//   case class Value(value: Int):
//     override def eval

object InverseMaths:
  // c (a b op) op
  def parse(s: String): Int =
    val tokens = s.split(" ") // 2 , 3 , +
    val empty  = Stack.empty[Int]
    val result = tokens.foldLeft(empty)((s, c) =>
      c match
        case "+" =>
          val a = s.pop()
          val b = s.pop()
          s.push(a + b)
        case "-" =>
          val a = s.pop()
          val b = s.pop()
          s.push(b - a)
        case i =>
          s.push(i.toInt)
    )
    result.pop()
