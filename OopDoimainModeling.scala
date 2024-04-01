trait Speaker:
  def speak(): String  // has no body, so it’s abstract

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

trait Runner:
  def startRunning(): Unit = println("I’m running")
  def stopRunning(): Unit = println("Stopped running")
trait Name:
    def name(): Unit = println("FDP")


class Dog(name: String) extends Speaker, TailWagger, Runner, Name:
    def speak(): String="woof !"

@main def oopDomain()= {
    val dog = new Dog(name = "fdp")
    println(dog.speak())
    dog.name()
    dog.startTail()
    dog.stopTail()
    dog.startRunning()
    dog.stopRunning()

}

