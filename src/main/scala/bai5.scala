object Bai5 {

  def arrayMaxConsecutiveSum(inputArray: Array[Int], k: Int): Int = {
    var max =0
    var temp = 0
//    for(i <- 0 until k) max += inputArray(i)
//    for(i <- k until inputArray.length){
//      temp = temp - inputArray(i-k) +inputArray(i)
//      if(max < temp ) max = temp
//    }
//    max
    for(i <- 0 until inputArray.length){
      if(i < k) temp += inputArray(i)
      else if(i >= k){
        if(i == k) max = temp
        temp = temp - inputArray(i-k) +inputArray(i)
        if(max < temp ) max = temp
      }
    }
    max
  }

  def main(args:Array[String]): Unit ={
    var inputArray = Array[Int]()
    val k = 1
    inputArray = Array(2,3,6,1,6)
    val output = arrayMaxConsecutiveSum(inputArray,k)
    println("max: "+output)
  }
}
