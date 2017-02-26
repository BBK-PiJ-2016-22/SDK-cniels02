package observer

import scala.collection.mutable.ListBuffer


class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject with Commentary {

  private var description: String = ""

  override def subscribeObserver(observer: Observer): Unit ={
    subscribers += observer
  }

  override def unSubscribeObserver(observer: Observer): Unit ={
    subscribers -= observer
  }

  override def setDesc(desc: String): Unit ={
    description = desc
    notifyObservers()
  }

  override def notifyObservers(): Unit ={
    subscribers.foreach(a => a.update(description))
  }

  override def subjectDetails: String = title
}
