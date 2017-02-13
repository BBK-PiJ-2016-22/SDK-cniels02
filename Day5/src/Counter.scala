/**
  * Created by Casper on 13/02/2017.
  */

object Counter extends App{
  val v = new Counter(10)
  print(v.dec().inc().inc().adjust(new Adder(20)).count)
}


case class Counter(input: Int = 0) {

  def inc(a: Int = 1): Counter ={
    this.copy(input + 1)
  }

  def dec(a: Int = 1): Counter = {
    this.copy(input -1)
  }

  def count:Int = input

  def adjust(a: Adder): Counter ={
    new Counter(a.add(input))
  }
}



