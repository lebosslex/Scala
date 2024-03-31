@main def condition () =
  val x = 1
  if  x < 0 then
    println("negative")
  else if x == 0 then
    println("zero")
  else
    println("positive")
