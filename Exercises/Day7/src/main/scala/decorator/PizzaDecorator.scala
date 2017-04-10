package decorator

/**
  * Created by Casper on 21/02/2017.
  */

abstract class PizzaDecorator(pizza: Pizza) extends Pizza{

  val separator = ", "

  override def getDesc: String = pizza.getDesc

  override def getPrice: Double = pizza.getPrice

}