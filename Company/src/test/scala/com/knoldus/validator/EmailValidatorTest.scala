package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  val emailValidator = new EmailValidator
  "email" should "be valid" in {
    val result: Boolean = emailValidator.emailIdIsValid("arun.singh@knoldus.com")
    assert(result)
  }

  it should "be invalid: missing @" in {
    val result: Boolean = emailValidator.emailIdIsValid("xyknoldus.com")
    assert(!result)
  }

  it should "be invalid due to 'Starting with special character not allowed'" in {
    val result: Boolean = emailValidator.emailIdIsValid("%abknoldus.com")
    assert(!result)
  }

  it should "be invalid due to space" in {
    val result: Boolean = emailValidator.emailIdIsValid("abc @knoldus.com")
    assert(!result)
  }

  it should "be invalid due to 'missing proper domain'" in {
    val result: Boolean = emailValidator.emailIdIsValid("abc@knoldus.xyz")
    assert(!result)
  }
}

