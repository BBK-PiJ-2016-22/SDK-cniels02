package state

case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = println("walking")

  def cook(): Unit = println("cooking")

  def off(): Unit = println("cannot be switched off")

}
