import scala.io.StdIn.readLine

@main def helloInteractive() =
  println("Welcome Formulaire")
  println("Please enter your name and name Familly :")
  val name = readLine()
  println("Age :")
  val age = readLine()

  println("Hello " + name + "!")
  println("your age is :" + age + " Great")