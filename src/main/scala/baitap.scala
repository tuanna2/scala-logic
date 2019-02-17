
object BT{

  def allLongestStrings(inputArray: Array[String]): Array[String] = {
    var maxLength = inputArray.max.length
    var output = Array[String]()

    for(i <- 0 to (inputArray.length-1)){
      if(inputArray(i).length == maxLength) {
        output = output :+ inputArray(i)
      }
    }
    output
  }

  def main(args: Array[String]): Unit ={
    val input = Array("aba", "aa", "ad", "vcd", "aba")
    val output = allLongestStrings(input)
    output.foreach(println)
  }

}