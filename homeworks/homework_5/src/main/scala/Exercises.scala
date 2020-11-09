object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](residents: List[T]) {
    def +[A >: T <: Animal](resident: A) = Shelter(residents :+ resident)
    def ++[A >: T <: Animal](otherShelter: Shelter[A]) = Shelter(residents ++ otherShelter.residents)
    def getNames = residents.map(_.name)
    def feed(food: Food[T]) = residents.map(food.feed)
  }


  trait Food[-T <: Animal]{
    val foodName = ""

    def feed(animal: T) = s"${animal.name} eats ${this.foodName}"
  }

  case object Meat extends Food[Animal]{
    override val foodName = "meat"
  }

  case object Milk extends Food[Cat]{
    override val foodName = "milk"
  }

  case object Bread extends Food[Dog]{
    override val foodName = "bread"
  }
}
