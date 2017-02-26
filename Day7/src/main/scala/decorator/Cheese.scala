package decorator

class Cheese(val pizza: Pizza) extends PizzaDecorator(pizza){

  override def getDesc: String = super.getDesc + separator + getClass.getSimpleName + " (20.72)"

  override def getPrice: Double = super.getPrice + 20.72
}
