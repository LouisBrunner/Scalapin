package sapin

trait IFactory {
  def createSapin(size: Int): SapinService
}

class Factory extends IFactory {
  def createSapin(size: Int): SapinService = new Sapin(size)
}

trait Module {
  import com.softwaremill.macwire._

  lazy val cli = wire[CLI]
  lazy val factory = wire[Factory]
}
