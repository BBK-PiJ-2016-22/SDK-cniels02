import scala.util.Random

/**
  * Created by Casper on 23/01/2017.
  */
class SmokeSensor extends Sensor {

  private var Battery: Int = 0

  override def isTriggered(): Boolean ={

    Battery = Battery - (Battery/5)

    if(Random.nextInt(100) <= 10 ){
      true
    }else{
      false
    }
  }

  override def getLocation(location : Enumeration): Enumeration ={
    location
  }

  override def getSensorType(): String ={
    this.getClass.toString
  }

  override def getBatteryPercentage(): Int ={
    Battery
  }


}
