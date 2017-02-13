
import scala.math.max
/**
  * Created by Casper on 13/02/2017.
  */

object Film{
  def apply(name: String, yearOfRelease: Int, imbtRating: Double, director: Director): Film ={
    new Film(name, yearOfRelease, imbtRating, director)
  }

  def highestRating(filmOne: Film, filmTwo: Film): Double ={
        max(filmOne.getImbtRating, filmOne.getImbtRating)
  }

  def oldestDirectorAtTheTime(filmOne: Film, filmTwo: Film): Director ={
    if(filmOne.directorsAge > filmTwo.directorsAge)
      filmOne.getDirector
    else
      filmTwo.getDirector
  }
}

class Film(name: String, yearOfRelease: Int, imbtRating: Double, director: Director) {
  def directorsAge: Int ={
    this.director.getYearOfBirth + this.yearOfRelease
  }

  def isDirectedBy(directorToCompare: Director ): Boolean ={
    if(directorToCompare.equals(this.director))
      true
    else
      false
  }

  def copy(name: String = this.name, yearOfRelease: Int = this.yearOfRelease
           ,imbtRating: Double = this.imbtRating, director: Director = this.director): Film ={

      new Film(name, yearOfRelease, imbtRating, director)

  }

  def getImbtRating: Double = imbtRating

  def getDirector: Director = director

}
