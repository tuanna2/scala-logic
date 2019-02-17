object Bai3 {
  def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
    if(a.length != a.length) return false
    var arr1 = a.sorted
    var arr2 = b.sorted
    var count = 0
    for(i <- 0 until a.length){
      if(a(i)!= b(i)) count+=1
      if(arr1(i)!=arr2(i))
        return false
    }
    if(count > 2) return false
    true
  }


  def main(args: Array[String]): Unit ={
    var a = Array(1,2,3)
    var b = Array(2,1,3)
    val output = areSimilar(a,b)
//    output.foreach(println)
    println(output)
  }
}
