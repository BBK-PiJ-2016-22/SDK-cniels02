package exercise9

import java.util.Calendar

import scala.collection.mutable.ListBuffer

/**
  * Created by Casper on 24/01/2017.
  */

object SecurityControlUnit {
  def main(args: Array[String]): Unit = {
    val c = new SecurityControlUnit
    val l = new ListBuffer[Sensor]
    l += new MotionSensor()
    c.setSensors(l)
    c.pollSensors()
  }
}

class SecurityControlUnit extends ControlUnit{

  override def pollSensors():Unit = {

    val now = Calendar.getInstance()
    val currentTime = now.get(Calendar.HOUR_OF_DAY)
    if(currentTime >= 22 || currentTime <= 6) {
      super.pollSensors()
    }
  }


}
