package sapin

import scala.util.{Try, Success, Failure}

class CLI(factory: IFactory) {
  def execute(args: Array[String]): Try[String] = {
    var size = 5
    if (args.length > 0) {
      Try(args(0).toInt).toOption match {
        case Some(n) if n > 0 => size = n
        case _ => return Failure(new Exception("invalid sapin size"))
      }
    }
    val sapin = factory.createSapin(size)
    Success(sapin.format(leaf = '*', trunk = '|'))
  }
}
