package sapin

import scala.util.Try

class CLI(factory: IFactory) {
  def execute(args: Array[String]): Either[String, String] = {
    var size = 5
    if (args.length > 0) {
      Try(args(0).toInt).toOption match {
        case Some(n) if n > 0 => size = n
        case _ => return Left(s"invalid sapin size `${args(0)}`")
      }
    }
    val sapin = factory.createSapin(size)
    Right(sapin.format(leaf = '*', trunk = '|'))
  }
}
