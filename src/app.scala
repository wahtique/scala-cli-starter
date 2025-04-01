package starter

import cats.effect.std.Console
import starter.lib.Lib
import com.monovore.decline.effect.CommandIOApp
import scala.cli.build.BuildInfo
import com.monovore.decline.Opts
import cats.effect.IO
import cats.effect.ExitCode

final case class SayHelloTo(target: Option[String])

object Main
    extends CommandIOApp(
      name = "hello-world",
      header = "A simple CLI that says hello",
      version = BuildInfo.projectVersion.getOrElse("0.1.0-SNAPSHOT")
    ):

  val sayHelloSubCommand: Opts[SayHelloTo] =
    Opts.subcommand("hello", "Say hello"):
      Opts.argument[String]("target").orNone.map(SayHelloTo.apply)

  override def main: Opts[IO[ExitCode]] =
    sayHelloSubCommand.map: sayHelloTo =>
      val greeting      = sayHelloTo.target.fold(Lib.hello)(t => Lib.hello(t))
      val printGreeting = Console[IO].println(greeting)
      printGreeting >> IO(ExitCode.Success)
