package exercise8

import scala.collection.mutable.ListBuffer

object ControlUnit{
  def main(args: Array[String]): Unit = {
    val c = new ControlUnit
    c.pollSensors()
  }
}

class ControlUnit {
  def pollSensors() {
    val sensors = new ListBuffer[Sensor]()
    sensors += new FireSensor()
    sensors += new SmokeSensor()
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

