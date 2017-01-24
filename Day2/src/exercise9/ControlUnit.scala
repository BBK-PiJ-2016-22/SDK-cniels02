package exercise9

import scala.collection.mutable.ListBuffer

class ControlUnit {

  private var sensors = new ListBuffer[Sensor]()

  def setSensors(sensors: ListBuffer[Sensor]): Unit ={
    this.sensors = sensors
  }

  def pollSensors() {
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

