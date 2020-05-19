package io.tray

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class FakeTest extends AnyFlatSpec with Matchers {

  "An empty Set" should "have size 0" in {
    Set.empty.size must equal(0)
  }

}
