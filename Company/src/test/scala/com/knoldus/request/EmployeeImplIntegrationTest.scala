package com.knoldus.request
import com.knoldus.db.EmployeeReadDto
import com.knoldus.models.Employee
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeImplIntegrationTest extends AnyFlatSpec {
  val employeeReadDto = new EmployeeReadDto
  val emailValidator = new EmailValidator
  val employeeValidator = new EmployeeValidator(employeeReadDto, emailValidator)
  val employeeImpl = new EmployeeImpl(employeeValidator)



  "Employee" should "exist" in {
    val arunEmployee: Employee = Employee("Arun","Singh", 22,20000, "Software Trainee","Knoldus","arun.singh@knoldus.com")
    val result =  employeeImpl.createEmployee(arunEmployee)
    assert(result=="Knoldus")
  }

  it should "be invalid as company does not exist" in {
    val akshEmployee: Employee = Employee("Aksh","Mishra",30,40000,"Software Trainee","Wipro","akki@wipro.com")
    val result =  employeeImpl.createEmployee(akshEmployee)
    assert(result.isEmpty)
  }

  it should "be invalid as email id is invalid" in {
    val arunEmployee: Employee = Employee("Arun","Singh", 22,20000, "Software Trainee","Knoldus","arun.singhknoldus.com")
    val result = employeeImpl.createEmployee(arunEmployee)
    assert(result.isEmpty)
  }

  it should "be invalid as email id is invalid and company does not exists" in {
    val akshEmployee: Employee = Employee("aksh","Mishra",30,40000,"Software Trainee","Wipro","niklauswiprocom")
    val result =  employeeImpl.createEmployee(akshEmployee)
    assert(result.isEmpty)
  }
}
