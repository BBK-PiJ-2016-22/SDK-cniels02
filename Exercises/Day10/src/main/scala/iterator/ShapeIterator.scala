package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var current: Int = 0

  override def hasNext(): Boolean = if (current < shapes.length) true else false

  override def next(): Shape = {
    if(hasNext()) {
      val toReturn: Shape = shapes(current)
      current = current + 1
      toReturn
    }else{
      null
    }
  }

  override def remove(): Unit = {
    if(hasNext()) {
      shapes(current) = null
      shapes = shapes.filter(shape => shape != null)
    }
  }
}