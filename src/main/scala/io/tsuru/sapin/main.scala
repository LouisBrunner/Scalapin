package sapin

import scala.util.Try

object Main extends App {
  var size = 5
  if (args.length > 0) {
    Try(args(0).toInt).toOption match {
      case Some(n) if n > 1 => size = n
      case _ => println("invalid sapin size"); sys.exit(1)
    }
  }
  val sapin = new Sapin(size)
  print(sapin.format(leaf = '*', trunk = '|'))
}
