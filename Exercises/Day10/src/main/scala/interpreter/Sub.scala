package interpreter

/**
  * Created by Casper on 31/03/2017.
  */
class Sub(private val leftExpression: Expression, private val rightExpression: Expression)
  extends Expression{
  override def interpret(): Int = leftExpression.interpret() - rightExpression.interpret()
}
