package com.knoldus.validator
import com.knoldus.db.{CompanyReadDto, UserReadDto}
import com.knoldus.models.User

class UserValidator {
  val userReadDtoOb =new UserReadDto()
  val emailValOb =new EmailValidator()

  def userIsValid(user: User): Boolean= {
    if (userReadDtoOb.getUserByName(user.companyName).isDefined && emailValOb.emailIdIsValid(user.emailId))
      return true
    else
      return false
  }

}









