package exercise4

/**
  * Created by Casper on 21/01/2017.
  */


trait Sensor {

  def isTriggered(): Boolean

  def getLocation() : String

  def getSensorType(): String

  def getBatteryPercentage(): Int


}
