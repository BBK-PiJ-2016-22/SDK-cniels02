package builder

// TODO

case class CarDirector(carBuilder: CarBuilder) {
  def build(): Unit = {
    this.carBuilder.buildBodyStyle
    this.carBuilder.buildPower
    this.carBuilder.buildEngine
    this.carBuilder.buildBreaks
    this.carBuilder.buildSeats
    this.carBuilder.buildWindows
    this.carBuilder.buildFuelType

  }

}
