
@main def main: Unit =

  val john = ("John", "Smith", 35)
  val jane = ("Jane", "Jones", 32)

  assert(john(0) == "John")
  assert(john(2) == 35)
  assert(john(0) == john._1)
  assert(john(2) == john._3)

  assert(john.size == 3)
  assert(john.head == "John")
  assert(john.tail == ("Smith", 35))

  assert(john == "John" *: "Smith" *: 35 *: EmptyTuple)
  val name *: surname *: age *: EmptyTuple = john
  assert(john == (name,surname,age))

  assert(john.take(2) == ("John", "Smith"))
  assert(john.drop(1) == ("Smith", 35))

  assert(john.splitAt(2) == (("John", "Smith"), Tuple(35)))
  assert(john ++ jane == ("John", "Smith", 35, "Jane", "Jones", 32) )
  assert((john zip jane) == (("John", "Jane"), ("Smith", "Jones"), (35,32)))

  val toChars = [T] => (t: T) => t.toString.toList
  assert(john.map[[T] =>> List[Char]](toChars)  == (List('J','o','h','n'), List('S','m','i','t','h'), List('3','5')))

  assert(john.toList == List("John", "Smith", 35))