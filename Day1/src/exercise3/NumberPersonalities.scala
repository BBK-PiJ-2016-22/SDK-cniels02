package exercise3


/**
  * Created by Casper on 12/01/2017.
  */
object NumberPersonalities {
  val limit = 100

  def main(args: Array[String]): Unit = {

    //print(isPrime(11))

    print(isHappy(18))

    isTriangular(30)
  }

  // 4 16 37 58 89 145 42 20 4

  def isPrime(n: Int): Boolean ={

    if(n==1){
      return false
    }

    var i = 2
    while(i < n){
      if(n%i == 0){
        return false
      }

      i = i+1
    }

    true

  }


  def isHappy(n: Int): Boolean ={

    var splitted: Int = n

        while (splitted != 1) {
          splitted = splitted.toString.map(_.asDigit).toList.map(a => math.pow(a, 2)).sum.toInt
          println(splitted)
          if (splitted == 4) {
            return false
          }
        }
    true
  }


  def isTriangular(n: Int): Boolean={

    var triangular = 1
    var i = n

    while (i < 0){
      triangular = n - i
      print(triangular)
      i = i+1
    }

    true
  }
  def isSquare(n: Int): Boolean ={
    true
  }
  def isSmug(n: Int): Boolean = {
    true
  }
  def isHonest(n: Int): Boolean ={
    true
  }
  def isPronic(n: Int): Boolean ={
    true
  }
  def isDeficient(n: Int): Boolean ={
    true
  }
  def isPerfect(n: Int): Boolean ={
    true
  }
  def isAbundant(n: Int): Boolean={
    true
  }

  def sumOfPositiveDivisorsOf(n: Int): Int ={
    9
  }
}
