package com.knoldus.Numbers

class get_palindrome_factorial extends Factorial_palindrome{

 override  def getPalindrome(palindrome_number: Int): Boolean = {
    var reverse = 0
    var temp = palindrome_number
    while (temp != 0) {
      val rem = temp % 10
      reverse = (reverse * 10) + rem
      temp = temp / 10
    }
    if (reverse.equals(palindrome_number) ) {
      return true
    }
     else {
      return false
    }
  }
   override def Factorial(factorial_number: Int): Int = {
    if (factorial_number == 0) {
      return 1
    } else
      return factorial_number * Factorial(factorial_number-1)
  }

}
