package decorator

class RomaTomatoes(val pizza: Pizza) extends PizzaDecorator(pizza) {

  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (5.20)"

  override def getPrice: Double = super.getPrice + 5.20

}
