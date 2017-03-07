package composite

// TODO

case class HtmlElement(s: String) extends HtmlTag(s) {

  override def setStartTag(tag: String): Unit = startTag = HtmlElement(tag)

  override def setEndTag(tag: String): Unit = endTag = HtmlElement(tag)

  override def setTagBody(tagBody: String): Unit = HtmlElement(tagBody)

  override def generateHtml: Unit = {
    print(startTag.getTagName)
    print(bodyTag.getTagName)
    print(endTag.getTagName)
  }

}
