object Bai7 {
  def findEmailDomain(address: String): String = {
    val x = address.split('@')
    x(x.length-1)
  }


  def main(args: Array[String]): Unit = {
    val input ="prettyandsimple@example.com"
    val output = findEmailDomain(input)
    println(output)
  }
}
