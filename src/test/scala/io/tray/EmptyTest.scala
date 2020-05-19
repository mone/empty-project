package io.tray

class EmptyTest extends BaseSpec {

  "An empty Set" should "have size 0" in {
    Set.empty.size should equal(0)
  }

  behavior.of("An empty set")

  it should "have size 0" in {
    Set.empty.size should equal(0)
  }

}
