
/**
  * Created by Casper on 13/02/2017.
  */

object Director{
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director ={
    new Director(firstName, lastName, yearOfBirth)
  }

}

class Director(firstName: String, lastName: String, yearOfBirth: Int) {

  def name: String = firstName + " " + lastName

  def getYearOfBirth: Int = yearOfBirth

}
