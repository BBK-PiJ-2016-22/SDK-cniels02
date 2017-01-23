/**
  * Created by Casper on 21/01/2017.
  */

import scala.util.Random

class FireSensor extends Sensor {

  private var Battery: Int = 0

  override def isTriggered(): Boolean = {

    Battery = Battery - (Battery/10)

    if(Random.nextInt(100) <= 5 ){
      true
    }else{
      false
    }
  }

  override def getLocation(location : Enumeration ): Enumeration ={
    location
  }

  override def getSensorType(): String ={
      this.getClass.toString
  }

  override def getBatteryPercentage(): Int ={
    Battery
  }

}
