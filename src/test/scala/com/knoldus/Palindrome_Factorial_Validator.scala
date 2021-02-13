package com.knoldus

import com.knoldus.Numbers.get_palindrome_factorial
import org.scalatest.FunSuite

class Palindrome_Factorial_Validator extends FunSuite {
   val getpalindromefactorial  = new get_palindrome_factorial

  test("Should return True, 121 is Palindrome"){
    assert(getpalindromefactorial.getPalindrome(121))
  }
  test("Should return False, 10 is not Palindrome"){
    assert(!getpalindromefactorial.getPalindrome(10))
  }

  test("Factorial of 'Zero' 0 and 'One' should be 'One' 1"){
    assert(getpalindromefactorial.Factorial(0)===1)
    assert(getpalindromefactorial.Factorial(1)===1)
  }
  test ("Factorial Of 5 is 120"){
    assert(getpalindromefactorial.Factorial(5)==120)
  }

}
