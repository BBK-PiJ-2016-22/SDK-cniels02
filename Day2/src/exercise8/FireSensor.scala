package exercise8

/**
  * Created by Casper on 21/01/2017.
  */

import scala.util.Random

class FireSensor extends HazardSensor {

  private var Battery: Int = 0

  override def isTriggered(): Boolean = {

    if(Battery > 100){
      Battery = 100
      Battery = Battery - (Battery/10)
    } else if(Battery < 0){
      Battery = 0
    }else{
      Battery = Battery - (Battery/10)
    }

    if(Random.nextInt(100) <= 5 ){
      true
    }else{
      false
    }
  }

  override def getLocation(): String ={
    "Library"
  }

  override def getSensorType(): String ={
      this.getClass.getSimpleName
  }

  override def getBatteryPercentage(): Int ={
    if(Battery > 100){
       100
    } else if(Battery < 0){
       0
    }else{
      Battery
    }
  }

}
