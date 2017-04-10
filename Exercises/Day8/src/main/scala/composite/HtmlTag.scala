package composite

abstract class HtmlTag(tagName: String) {

  var startTag: HtmlTag = _
  var endTag: HtmlTag = _
  var bodyTag: HtmlTag = _

  var elements: List[HtmlTag] = Nil

  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String)

  def addChildTag(htmlTag: HtmlTag):Unit = elements = elements :+ htmlTag

  def removeChildTag(htmlTag: HtmlTag):Unit = elements = elements.filter(a => !a.equals(htmlTag))

  def getChildren: List[HtmlTag] = elements

  def generateHtml
}