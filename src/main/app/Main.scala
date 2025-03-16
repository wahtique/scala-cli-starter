package starter.app

import cats.effect.*
import starter.lib.Lib

object Main extends IOApp.Simple:
  def run: IO[Unit] = IO.println(Lib.hello)
