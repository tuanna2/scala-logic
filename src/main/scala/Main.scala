class Tong(val a: Int, val b: Int){

  def tong(t2: (Int, Int) => Int) : Int = {
    t2(a, b) + 5
  }


}


object Main {
  def t2(a: Int,b: Int): Int = {
    a + b
  }
  def hello(a: Int, b: Int) : Int = {
    a + b
  }
  def main(args: Array[String]): Unit = {
    val (a: Int, b: Int) = (4, 6)
    val tong = new Tong(a, b)

    println(tong.tong(t2))

    println(hello(a, b))
    val multiplier = (i: Int) => i * 2
    println("Multiplier la " + multiplier(a))

    var list = Array("tuan","hoa")
    for(i <- list){
      println("list :" + list)
    }
  }
}