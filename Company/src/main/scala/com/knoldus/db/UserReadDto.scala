package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto {

  val User1: User = User("Arun","Singh", 22,20000, "Software Trainee","Knoldus","arun.singh@knoludc.com")
  val User2: User = User("kapil","jeet singh", 24,32000, "Assistant Manager","Philips","kapiljeetsingh@gmail.com")
  val User3: User = User("Vinayak","Singh",25,80000,"System Engineer","Fyltbase","vinayak.singh@gmail.com")

  val users: HashMap[String, User] = HashMap("Arun" -> User1, "kapil" -> User2, "Vinayak" -> User3)


  def getUserByName(name: String): Option[User] = users.get(name)
  //def getUserByName(name: String): Option[User] = User.

}

