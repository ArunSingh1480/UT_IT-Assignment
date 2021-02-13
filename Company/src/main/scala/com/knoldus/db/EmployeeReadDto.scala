package com.knoldus.db
import com.knoldus.models.Employee

import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val Employee1: Employee = Employee("Arun","Singh", 22,20000, "Software Trainee","Knoldus","arun.singh@knoldus.com")
  val Employee2: Employee = Employee("kapil","singh", 24,32000, "Assistant Manager","Philips","kapiljeetsingh@gmail.com")
  val Employee3: Employee = Employee("Vinayak","Singh",25,80000,"System Engineer","FlytBase","vinayak.singh@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("Arun" ->Employee1, "Kapil" -> Employee2, "Vinayak" -> Employee3)


  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
