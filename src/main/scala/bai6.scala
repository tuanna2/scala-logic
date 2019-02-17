object  bai6 {
  def isMAC48Address(inputString: String): Boolean = {
    """([A-F0-9]{2})-([A-F0-9]{2})-([A-F0-9]{2})-([A-F0-9]{2})-([A-F0-9]{2})-([A-F0-9]{2})""".r.unapplySeq(inputString).isDefined
  }

  def main(args: Array[String]): Unit = {
    val input ="Z1-1B-63-84-45-E6"
    val output = isMAC48Address(input)
    println(output)
  }
}
