import scala.io.StdIn

object Example extends App {

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else factorial(n - 1) * n
  }
  val lst = List(6, 5, 4, 7, 4, 2, 1)
  val palindromeCheck1 = List(1, 2, 3, 4, 5, 4, 3, 2, 1)
  val palindromeCheck2 = List("abc", "def", "ghi")

  println(lastRecursive(lst))
  println(lst.last)
  println(isPalindrome(palindromeCheck1))
  println(isPalindrome(palindromeCheck2))

  println("number ?")
  val num = StdIn.readInt
  println(factorial(num))

}
