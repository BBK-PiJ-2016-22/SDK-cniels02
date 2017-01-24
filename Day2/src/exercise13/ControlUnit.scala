package exercise13

import scala.collection.mutable.ListBuffer

object ControlUnit {
  def main(args: Array[String]): Unit = {
    val c = new ControlUnit

    val l = new ListBuffer[Sensor]
    l += new MotionSensor()
    l += new SmokeSensor
    l += new FireSensor
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
      if (sensor.isTriggered) {

        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)

        val context = new Context(new TriggerSiren)
        context.executeStrategy()

        if(sensor.isInstanceOf[HazardSensor]){
          val context = new Context(new CallFireDepartment)
          context.executeStrategy()
        }

        if (sensor.isInstanceOf[SecuritySensor]) {
          val context = new Context(new CallOwnersPhone)
          context.executeStrategy()
        }
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

