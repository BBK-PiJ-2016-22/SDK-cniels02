package decorator

class Meat(val pizza: Pizza) extends PizzaDecorator(pizza) {

  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (14.25)"

  override def getPrice: Double = super. getPrice + 14.25

}
