package sapin

import org.scalamock.scalatest.MockFactory
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CLISpec extends AnyFlatSpec with Matchers with MockFactory {
  "A CLI" should "parse arguments correctly" in {
    val mockedSapin = mock[SapinService]
    (mockedSapin.format _).expects('*', '|').returning("hello")

    val mockedFactory = mock[Factory]
    (mockedFactory.createSapin _).expects(1).returning(mockedSapin)

    val cli = new CLI(mockedFactory)
    cli.execute(Array("1")) shouldEqual Right("hello")
  }

  "A CLI" should "handle bad arguments" in {
    val mockedFactory = mock[Factory]
    val cli = new CLI(mockedFactory)
    cli.execute(Array("-1")) shouldEqual Left("invalid sapin size `-1`")
    cli.execute(Array("abc")) shouldEqual Left("invalid sapin size `abc`")
    cli.execute(Array("0")) shouldEqual Left("invalid sapin size `0`")
  }
}
