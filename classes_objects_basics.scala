package lectures.part2oop

object OOBasics extends App{

  val person = new Person("John",26)
  println(person.x)
  person.greet("Daniel")

  val writer = new Writer("Stephen","King",1968)
  val imposter = new Writer("Stephen","King",1968)
  println(writer.fullName())

  val novel = new Novel("It",1988,writer)
  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.inc.inc.print

  //val novel = new Novel("It", 1998, writer)
  //println(novel.authorAge())

}
// Constructor
class Person(name: String, age: Int) {
  //body
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: HI, $name")
}

/* Novel and writer class*/

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName(): String ={
    this.firstName + " " + this.surname
  }
}

// return auhor age, check for auhorship
//notice how a compiler can infer return types
class Novel(Name: String, releaseYear: Int, author: Writer ) {
  def authorAge = releaseYear - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = {
    new Novel (Name,newYear,author)
  }
}


//incorrect way of doing things (you are modifying an instance)
class newCounter(val count: Int) {
  def inc(): Int= {
    count + 1
  }
}

//correct way
class Counter(val count: Int = 0) {
  def inc = {
    new Counter(count + 1)
  } // Immutability
  def dec = new Counter(count - 1)

  def print = println(count)
}
