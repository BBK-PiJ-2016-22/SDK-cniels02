package composite

// TODO
case class HtmlParentElement(s: String) extends HtmlTag(s) {

  override def setStartTag(tag: String): Unit = startTag = HtmlParentElement(tag)

  override def setEndTag(tag: String): Unit = endTag = HtmlParentElement(tag)

  override def setTagBody(tagBody: String): Unit = HtmlParentElement(tagBody)


  override def generateHtml: Unit = {

    println(startTag.getTagName)
    elements.foreach(a => a.getChildren.foreach(a => a.generateHtml))
    println(endTag.getTagName)

  }

}
