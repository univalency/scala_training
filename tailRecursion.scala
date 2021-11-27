package lectures.part1basics
import scala.annotation.tailrec

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameeterlessFunction(): Int = 42

  println(aFunction("hello", 32))
  println(aParameeterlessFunction())

  @tailrec
  def concatString(a: String,accumulator: String, b: Int): String = {
    if (b <= 1) accumulator
    else concatString(a,a + accumulator, b-1)
  }
  println(concatString("yes","yes",10))

  @tailrec
  def isPrime(a: Float, divisor: Int, accum: Int): Boolean = {
    if (a % divisor == 0 & divisor < a ) false
    else if ( divisor - accum == 1) true
    else isPrime(a, divisor - accum, accum +1)
  }

  println(isPrime(18,16,1))
  println(17 % 17)
  


}
