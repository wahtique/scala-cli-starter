package starter.app

import cats.effect.*
import starter.lib.Lib

object Hello extends IOApp.Simple:
  def run = IO.println(Lib.hello)
