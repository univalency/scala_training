object objects_scala  extends App{
  //object can have vals, vars and methods
  //we use objects in scala to resemble class level functionality from Java
  object Person { //TYPE + INSTANCE
    //*static level functionality*
    val N_EYES = 2

    def canFly: Boolean = false
    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  //we often write classes and objects with the same name. this is called COMPANIONS

  class Person {
    //offers instance level functionality
  }

  println(Person.N_EYES)

  //Scala object = SINGLETON INSTANCE by definiton
  val mary = Person
  val john = Person
  println(mary == john)

  val mary1 = new Person("Mary")
  val john1 = new Person("John")

  //ways to call a factory method
  val bobbie = Person(mary1, john1)

  //Scala applications
  //it is just a scala object with a particular method
  //def main(args: Array[String]): Unit - this is the exact syntax needed


}
