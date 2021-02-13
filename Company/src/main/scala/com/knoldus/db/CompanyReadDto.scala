package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")
  val FlytBaseCompany: Company = Company("FlytBase", "FlytBase@gmail.com", "Pune")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Philips" -> philipsCompany, "FlytBase" -> FlytBaseCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
