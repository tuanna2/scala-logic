object Bai2 {
  def sortByHeight(a: Array[Int]): Array[Int] = {
    var arr = Array[Int]()
    var j = 0
    arr = a.filter(_ != -1).sorted
    for(i <- 0 until a.length){
      if(a(i) != -1){
        a(i) = arr(j)
        j += 1
      }
    }
    a
  }


  def main(args: Array[String]): Unit ={
    var a = Array(-1, 150, 190, 170, -1, -1, 160, 180)
    val output = sortByHeight(a)
    output.foreach(println)
  }
}
