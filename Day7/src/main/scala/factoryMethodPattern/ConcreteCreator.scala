package factoryMethodPattern

/**
  * Created by Casper on 21/02/2017.
  */
class ConcreteCreator extends Creator{

  override def create(a: Any): Product = a match {
    case a => new ConcreteProduct(a)
      
  }

}
