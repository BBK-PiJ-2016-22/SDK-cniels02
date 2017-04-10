package interpreter

object ExpressionUtils {


  def isOperator(s: String): Boolean = if(s == "+" || s == "*" || s == "-") true else false

  def getOperator(s: String, left: Expression, right: Expression): Expression = s match{
    case "+" => new Add(left, right)
    case "-" => new Sub(left, right)
    case "*" => new Product(left, right)

  }


}