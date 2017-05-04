package memento

case class Originator(
  var x: Double,
  var y: Double,
  var careTaker: CareTaker
) {

  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    println(s"Saving state...$savepointName")
    lastUndoSavepoint = savepointName
    careTaker.saveMemento(Memento(x,y), savepointName )
  }

  def undo(): Unit = {
    println(s"Undo at ...$lastUndoSavepoint")
    x = careTaker.getMemento(lastUndoSavepoint).x
    y = careTaker.getMemento(lastUndoSavepoint).y
  }

  def undo(savepointName: String): Unit = {
    println(s"Undo at ...$savepointName")

    lastUndoSavepoint = savepointName
    x = careTaker.getMemento(savepointName).x
    y = careTaker.getMemento(savepointName).y
  }

  def undoAll(): Unit = {
    undo("INITIAL")
    println("Clearing all save points...")
    careTaker.clearSavepoints()
  }

  private def setOriginatorState(savepointName: String): Unit = {
    lastUndoSavepoint = savepointName
  }

  override def toString(): String = "X: " + x + ", Y: " + y
}
