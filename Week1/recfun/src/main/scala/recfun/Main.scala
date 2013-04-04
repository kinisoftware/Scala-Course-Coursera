package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == 0 || (c == r)) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance_iter(parentheses_opened: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        parentheses_opened == 0
      } else {
        if (chars.head.equals('('))
          balance_iter(parentheses_opened + 1, chars.tail)
        else if (chars.head.equals(')') && parentheses_opened == 0)
          false
        else if (chars.head.equals(')'))
          balance_iter(parentheses_opened - 1, chars.tail)
        else
          balance_iter(parentheses_opened, chars.tail)
      }
    }

    balance_iter(0, chars);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins.isEmpty || money < 0) 0
    else if (money > 0) countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else 1
  }
}
