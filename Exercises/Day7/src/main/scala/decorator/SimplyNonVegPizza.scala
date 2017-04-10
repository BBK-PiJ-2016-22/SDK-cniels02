package decorator

class SimplyNonVegPizza extends Pizza {
  override def getDesc: String = this.getClass.getSimpleName + " (" + getPrice + ")"

  override def getPrice: Double = 350.0

}
