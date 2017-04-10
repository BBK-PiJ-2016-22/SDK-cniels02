package exercise8

import scala.util.Random

/**
  * Created by Casper on 23/01/2017.
  */
class MotionSensor extends SecuritySensor{

  override def isTriggered(): Boolean = {
    if(Random.nextInt(100) <= 20 ){
      true
    }else{
      false
    }
  }

  override def getLocation(): String = {
    "Library"
  }

  override def getSensorType(): String ={
    this.getClass.getSimpleName
  }
}
