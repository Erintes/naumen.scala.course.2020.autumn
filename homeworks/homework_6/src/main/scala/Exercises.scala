object Exercises {
  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  def fibonacci4Index(idx: Int): Int =
    idx match {
      case 0 => 0
      case 1 | 2 => 1
      case _ =>
        var x = 1
        var y = 1
        var res = 0
        for (i <- 2 until idx){
          res = x + y
          x = y
          y = res
        }
        res
    }

  def fibonacci(idx: Int): Seq[Int] =
    idx match {
      case 0 => Seq(0)
      case 1 => Seq(0, 1)
      case _ =>
        var res = Seq(0, 1)
        for (i <- 1 until idx)
          res :+= res.last + res.dropRight(1).last
        res
    }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text
      .map(sym => MORSE.getOrElse(sym.toString.toUpperCase, sym))
      .mkString(" ")
  }

  def wordReverse(text: String): String = {
    text.split("(?=[?!., ])|(?<=[?!., ])")
      .map(word =>
        if(word.charAt(0).isUpper)
          word.toLowerCase.reverse.capitalize
        else
          word.reverse)
      .mkString("")
  }
}
