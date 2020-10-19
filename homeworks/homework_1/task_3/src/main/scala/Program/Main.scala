object Main extends App {
  val greetings = List("Hello", "Hola", "Guten Tag")
  val myName = "Gleb Emelyanov"

  for {i <- 0 to 1
       greeting <- greetings}
    if (i == 0) writeLine(greeting, myName)
    else writeLine(greeting, myName.reverse)

  def writeLine(greeting: String, name: String) = {
    println(s"$greeting scala! This is $name")
  }
}

