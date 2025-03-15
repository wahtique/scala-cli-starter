package starter.app

import cats.effect.*
import starter.lib.Lib

object Main extends IOApp.Simple:
  def run = IO.println(Lib.hello)
