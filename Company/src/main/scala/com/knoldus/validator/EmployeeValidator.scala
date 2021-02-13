package com.knoldus.validator
import com.knoldus.db.{CompanyReadDto, EmployeeReadDto}
import com.knoldus.models.Employee

class EmployeeValidator {
  val employeeReadDtoOb =new EmployeeReadDto()
  val emailValOb = new  EmailValidator()

  def employeeIsValid(employee: Employee): Boolean = {
    if(  employeeReadDtoOb.getEmployeeByName(employee.companyName).isDefined && emailValOb.emailIdIsValid(employee.emailId))
      return true
    else
      return false

  }
}


