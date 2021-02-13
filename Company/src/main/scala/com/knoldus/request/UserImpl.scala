package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator


class UserImpl (uservalidator: UserValidator) {

  def createUser(user: User): Option[String] = {
    if (uservalidator.userIsValid(user)) {
      println("=>User '"+user.firstName+"' created successfully!")
      Option(user.emailId)
    }
    else {
      println("=>User '"+user.firstName+"' is not created due to above reasons!")
      None
    }
  }

}
