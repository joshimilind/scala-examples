object Example extends App {

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def nthElement[A](elem: Int, ls: List[A]): A = (elem, ls) match {
    case (0, h :: Nil)     => h
    case (elem, _ :: tail) => nthElement(elem - 1, tail)
    case (_, Nil)          => throw new NoSuchElementException
  }

  val lst = List(6, 5, 4, 7, 4, 2, 1)
  println(lastRecursive(lst))
  println(lst.last)
  println("nth element")
  println(nthElement(2, lst))

}
