package com.knoldus.Password


 object Validpassword{
  val pattern ="^.*(?=.{8,15})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"
  def passwordValidator(password:String): Boolean= password.matches(pattern)

}