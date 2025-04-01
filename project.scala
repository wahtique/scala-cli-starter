// BUILD
//
// Scala version
//> using scala 3.6.4
// 
// Compiler options
//> using options -Wunused:all
//
// Main class
//> using mainClass starter.app.Main
//
// Enable build-info in `scala.cli.build.BuildInfo`
//> using buildInfo
//
// PLATFORM 
//
// platforms : jvm, js, native
//
// JVM 
//
// //> using platform jvm
// jvm like `14`, `adopt:11`, `graalvm:21`, `system`
// see coursier for complete list : https://github.com/coursier/jvm-index
// //> using jvm 21
// 
// NATIVE
//
//> using platform native
//> using nativeVersion 0.4.17
//
// JS
// 
// TODO : add js options
// 
// PACKAGING
// 
// packaging types : assembly, raw-assembly, bootstrap, library, source,
// doc, spark, js, native, docker, graalvm, deb, dmg, pkg, rpm, msi
//> using packaging.packageType native
// packaged app name
//> using packaging.output out/app
// 
// SCALAFIX RULES
//
// https://github.com/typelevel/typelevel-scalafix
//> using scalafix.dep org.typelevel::typelevel-scalafix:0.5.0
// https://github.com/dedis/scapegoat-scalafix
//> using scalafix.dep io.github.dedis:scapegoat-scalafix:1.1.4
//
// DEPENDENCIES
//
// cats, cats-effect
// fs2, fs2-io, fs2-data-csv
// http4s ember client
// circe
// decline, decline-effect
// munit, munit-cats-effect
//> using toolkit typelevel:default