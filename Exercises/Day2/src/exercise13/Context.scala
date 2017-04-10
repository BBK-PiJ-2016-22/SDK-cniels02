package exercise13


/**
  * Created by Casper on 24/01/2017.
  */
class Context(private var strategy: Strategy) {

  def executeStrategy(): Unit ={
    strategy.ifSensorTriggered()
  }

}
