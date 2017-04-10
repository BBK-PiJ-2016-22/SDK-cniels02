package decorator

class Spinach(val pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (7.92)"

  override def getPrice: Double = super.getPrice + 7.92

}
