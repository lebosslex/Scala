@main def condition () =
  val a = 2
  val b = 2
  val x = if a < b then a else b
  if  x < 0 then
    println("negative")
  else if x == 0 then
    println("zero")
  else
    println("positive")

  println(x)