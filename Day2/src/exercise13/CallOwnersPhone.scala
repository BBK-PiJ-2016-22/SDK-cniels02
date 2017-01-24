package exercise13

/**
  * Created by Casper on 24/01/2017.
  */
class CallOwnersPhone extends Strategy{

  override def ifSensorTriggered(): Unit ={
    println("Phone is called")
  }

}
