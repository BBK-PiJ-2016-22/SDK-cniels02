package exercise7

/**
  * Created by Casper on 23/01/2017.
  */
trait SecuritySensor{

  def isTriggered(): Boolean

  def getLocation() : String

  def getSensorType(): String

}
