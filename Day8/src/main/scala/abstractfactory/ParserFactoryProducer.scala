package abstractfactory

class NYCOrderXMLParser() extends XMLParser{
  override def parse: String = "NYC Parsing order XML..." + "\n" + "NYC Order XML Message"
}

class NYCErrorXMLParser() extends XMLParser{
  override def parse: String = "NYC Parsing error XML..." + "\n" + "NYC error XML Message"

}

class NYCFeedbackXML() extends XMLParser{
  override def parse: String = "NYC Parsing feedback XML..." + "\n" + "NYC feedback XML Message"
}

class NYCResponseXMLParser() extends XMLParser{
  override def parse: String = "NYC Parsing response XML..." + "\n" + "NYC response XML Message"
}


class LondonOrderXMLParser() extends XMLParser{
  override def parse: String = "London Parsing order XML..." + "\n" + "London Order XML Message"
}

class LondonErrorXMLParser() extends XMLParser{
  override def parse: String = "London Parsing error XML..." + "\n" + "London error XML Message"
}

class LondonFeedbackXML() extends XMLParser{
  override def parse: String = "London Parsing feedback XML..." + "\n" + "London feedback XML Message"
}

class LondonResponseXMLParser() extends XMLParser{
  override def parse: String = "London Parsing response XML..." + "\n" + "London response XML Message"
}


object NewYorkFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match{
    case "NYCORDER" => new NYCOrderXMLParser()
    case "NYCERROR" => new NYCErrorXMLParser()
    case "NYCFEEDBACK" => new NYCFeedbackXML()
    case "NYCRESPONSE" => new NYCResponseXMLParser()

  }
}
object LondonFactory extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = parserType match{
    case "LondonORDER" => new LondonOrderXMLParser()
    case "LondonERROR" => new LondonErrorXMLParser()
    case "LondonFEEDBACK" => new LondonFeedbackXML()
    case "LondonRESPONSE" => new LondonResponseXMLParser()
  }
}



 object ParserFactoryProducer {
  def getFactory(s: String): AbstractParserFactory = s match {
    case "NYCFactory" =>  NewYorkFactory;
    case "LondonFactory" => LondonFactory
  }



}
