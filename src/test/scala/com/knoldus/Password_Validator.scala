package com.knoldus

import com.knoldus.Password.Validpassword
import org.scalatest.FunSuite

class Password_Validator extends FunSuite{
  test("Should return true if password is valid") {
    assert(Validpassword.passwordValidator("MOVEbox@123") === true)
  }

}
