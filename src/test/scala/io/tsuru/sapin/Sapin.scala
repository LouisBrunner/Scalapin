package sapin

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SapinSpec extends AnyFlatSpec with Matchers {
  "A small sapin" should "display correctly" in {
    val sapin = new Sapin(size=1)
    sapin.format(leaf='o', trunk='I') shouldEqual """   o
  ooo
 ooooo
ooooooo
   I
"""
  }

  "A bigger sapin" should "display correctly" in {
    val sapin = new Sapin(size=4)
    sapin.format(leaf='*', trunk='|') shouldEqual """            *
           ***
          *****
         *******
          *****
         *******
        *********
       ***********
      *************
        *********
       ***********
      *************
     ***************
    *****************
   *******************
      *************
     ***************
    *****************
   *******************
  *********************
 ***********************
*************************
          |||||
          |||||
          |||||
          |||||
"""
  }
}
