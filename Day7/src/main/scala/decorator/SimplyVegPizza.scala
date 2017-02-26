package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = this.getClass.getSimpleName + " (" + getPrice + ")"

  def getPrice: Double = 230.0
}
