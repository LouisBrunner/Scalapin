package sapin

import com.softwaremill.macwire._

object Main extends App {
  val factory = wire[Factory]

  wire[CLI].execute(args) match {
    case Right(s) => println(s)
    case Left(s) => println(s"error: $s"); sys.exit(1)
  }
}
