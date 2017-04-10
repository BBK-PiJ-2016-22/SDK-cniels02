package exercise4

/**
  * Created by Casper on 23/01/2017.
  */


import scala.collection.mutable.ListBuffer

object ControlUnit{
  def main(args: Array[String]): Unit = {
    val c = new ControlUnit
    val l = new ListBuffer[Sensor]
    l += new FireSensor()
    l += new SmokeSensor()
    c.setSensors(l)
    c.pollSensors()
  }
}

class ControlUnit {

  private var sensors = new ListBuffer[Sensor]()

  def setSensors(sensors: ListBuffer[Sensor]): Unit ={
    this.sensors = sensors
  }

  def pollSensors() {
    for (sensor <- sensors) {
      if (sensor.isTriggered()) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}