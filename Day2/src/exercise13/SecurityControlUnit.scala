package exercise13

import java.util.Calendar

import scala.collection.mutable.ListBuffer

/**
  * Created by Casper on 24/01/2017.
  */


class SecurityControlUnit extends ControlUnit{

  override def pollSensors():Unit = {

    if(timeCheck()) {
      super.pollSensors()
    }
  }

  def timeCheck(): Boolean ={
    val now = Calendar.getInstance()
    val currentTime = now.get(Calendar.HOUR_OF_DAY)
    if(currentTime >= 22 || currentTime <= 6) {
      true
    }else{
      false
    }
  }
}
