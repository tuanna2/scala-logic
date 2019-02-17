object Bai4 {

  def palindromeRearranging(inputString: String): Boolean = {
    var arr = new Array[Int](26)
    var count = 0
    var x = inputString.charAt(0) - 'a'
    for(i <- 0 until inputString.length){
      arr(inputString.charAt(i)-'a') += 1
    }
    for(i <- arr){
      if(i % 2 == 1) count +=1
    }
    if(count <= 1) return true
    return false
  }

  def main(args: Array[String]): Unit ={
    val inputString = "aabba"
    val output = palindromeRearranging(inputString)
    println(output)
  }
}
