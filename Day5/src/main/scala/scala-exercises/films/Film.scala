
import scala.math.max
/**
  * Created by Casper on 13/02/2017.
  */

object Film{

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

case class Film(name: String, yearOfRelease: Int, imbtRating: Double, director: Director) {
  def directorsAge: Int ={
    director.getYearOfBirth + yearOfRelease
  }

  def isDirectedBy(directorToCompare: Director ): Boolean ={
    if(directorToCompare == director)
      true
    else
      false
  }

  def copy(name: String = name, yearOfRelease: Int = yearOfRelease
           ,imbtRating: Double = imbtRating, director: Director = director): Film ={

        Film(name, yearOfRelease, imbtRating, director)

  }

  def getImbtRating: Double = imbtRating

  def getDirector: Director = director

}
