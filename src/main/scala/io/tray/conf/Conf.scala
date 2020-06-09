package io.tray.conf

import io.tray.models.TaggedInt.LongPollingTimeout

import scala.concurrent.duration.FiniteDuration

case class Conf(component: ComponentConf)

sealed trait MyProperty
case class FirstAlternative(value: String) extends MyProperty
case class SecondAlternative(value: Int) extends MyProperty

case class Nested(intProperty: Int, stringProperty: String)

case class ComponentConf(
  intProperty: Int,
  stringProperty: String,
  timeProperty: FiniteDuration,
  envProperty: String,
  copiedProperty: String,
  nested: Nested,
  propertyWithAlternatives: MyProperty,
  taggedProperty: LongPollingTimeout
)
