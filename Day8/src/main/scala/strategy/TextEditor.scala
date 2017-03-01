package strategy

// TODO

case class TextEditor(formatter: TextFormatter) {
  def publishText(s: String):Unit = formatter.format(s)

}
