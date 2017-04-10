package exercise13

/**
  * Created by Casper on 24/01/2017.
  */
class TriggerSiren extends Strategy{

  override def ifSensorTriggered(): Unit ={
    println("Siren is triggered")
  }

}
