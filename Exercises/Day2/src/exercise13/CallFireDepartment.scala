package exercise13

/**
  * Created by Casper on 24/01/2017.
  */
class CallFireDepartment extends Strategy{

  override def ifSensorTriggered(): Unit ={
    println("Fire Department called")
  }

}
