package sapin

import scala.collection.mutable.StringBuilder

class Sapin(size: Int) extends SapinService {
  val space = ' '

  def format(leaf: Char, trunk: Char): String = {
    val builder = new StringBuilder()
    for (i <- 0 until size) {
      for (j <- 0 until i + 4) {
        builder ++= (
          space.toString * (size * 3 - (i * 2) - j)
          + leaf.toString * (i * 4 + j * 2 + 1)
          + System.lineSeparator
        )
      }
    }
    builder ++= (
      space.toString * math.ceil(size * 2.5).toInt
      // FIXME: probably should round the trunk up to the above odd number?
      + trunk.toString * size
      + System.lineSeparator
    ) * size
    builder.toString()
  }
}

trait SapinService {
  def format(leaf: Char, trunk: Char): String
}
