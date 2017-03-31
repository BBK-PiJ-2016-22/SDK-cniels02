package command

class LoggingJob extends Job {

  var logging: Logging = _

  def setLogging(logging: Logging): Unit = this.logging = logging

  override def run(): Unit = logging.log
}