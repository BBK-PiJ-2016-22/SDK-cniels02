
/**
  * Created by Casper on 13/02/2017.
  */



case class Director(firstName: String, lastName: String, yearOfBirth: Int) {

  def name: String = firstName + " " + lastName

  def getYearOfBirth: Int = yearOfBirth

}
