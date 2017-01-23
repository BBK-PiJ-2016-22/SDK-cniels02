/**
  * Created by Casper on 21/01/2017.
  */
trait Sensor {

  def isTriggered(): Boolean

  def getLocation(location : Enumeration): Enumeration

  def getSensorType(): String

  def getBatteryPercentage(): Int




}
