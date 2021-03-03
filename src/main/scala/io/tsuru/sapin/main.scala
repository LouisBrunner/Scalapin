package sapin

import scala.util.{Success, Failure}
import com.softwaremill.macwire._

object Main extends App {
  val factory = wire[Factory]

  wire[CLI].execute(args) match {
    case Success(s) => println(s)
    case Failure(s) => println(s"error: $s"); sys.exit(1)
  }
}
