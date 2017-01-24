package exercise1To3

import scala.util.Random

/**
  * Created by Casper on 23/01/2017.
  */
class SmokeSensor extends Sensor {

  private var Battery: Int = 0

  override def isTriggered(): Boolean ={

    if(Battery > 100){
      Battery = 100
      Battery = Battery - (Battery/5)
    } else if(Battery < 0){
      Battery = 0
    }else{
      Battery = Battery - (Battery/5)
    }

    if(Random.nextInt(100) <= 10 ){
      true
    }else{
      false
    }
  }

  override def getLocation(): String ={
    "Attic"
  }

  override def getSensorType(): String ={
    getClass.getName
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
