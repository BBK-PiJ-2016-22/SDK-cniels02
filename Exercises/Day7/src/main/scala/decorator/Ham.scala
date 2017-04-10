package decorator

class Ham(val pizza: Pizza) extends PizzaDecorator(pizza) {
  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (18.12)"

  override def getPrice: Double = super.getPrice + 18.12

}
