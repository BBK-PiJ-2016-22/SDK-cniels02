package chain

case class VideoFileHandler(s: String) extends Handler {
  var handler: Handler = _

  override def setHandler(handler: Handler): Unit = {
    this.handler = handler
  }

  override def process(file: File): Unit = {

    if (handler == null){
      println("File not supported")
    }else{
      if(file.fileType == "video"){
        println(s"Process and saving ${file.fileName} audio fileby $s")
      }else{
        println(s"Text Handler forwards request to ${handler.getHandlerName()}")
        handler.process(file)
      }
    }
  }

  override def getHandlerName(): String = s
}
