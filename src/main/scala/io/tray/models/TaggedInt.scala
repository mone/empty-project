package io.tray.models

import shapeless.tag
import shapeless.tag.@@

import scala.util.{Failure, Success, Try}

object TaggedInt {

  sealed trait LongPollingTimeoutTag
  type LongPollingTimeout = Int @@ LongPollingTimeoutTag

  object LongPollingTimeout {
    def fromInt(value: Int): Try[LongPollingTimeout] = {
      if (value > 0 && value <= 20) {
        Success(tag[LongPollingTimeoutTag][Int](value))
      } else {
        Failure(new Exception("You need to use 6"))
      }
    }
  }

}

trait TaggedIntPureConfigFormat {
  import TaggedInt._
  import pureconfig.ConvertHelpers
  import pureconfig.ConfigReader

  implicit val sixReader =
    ConfigReader.fromString[LongPollingTimeout](
      ConvertHelpers.catchReadError(s => LongPollingTimeout.fromInt(s.toInt).get)
    )

}
