package decorator

class GreenOlives(val pizza: Pizza) extends PizzaDecorator(pizza){
  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (5.47)"

  override def getPrice: Double = super.getPrice + 5.47

}
