// Build and packaging
//
// latest version
//> using scala 3.3.1
// platforms : jvm, scala-js, js, scala-native, native
//> using platform jvm
// jvm like `14`, `adopt:11`, `graalvm:21`, `system`
// see coursier for complete list : https://github.com/coursier/jvm-index
//> using jvm 19
// Main class
//> using mainClass starter.app.Main
// packaging options : assembly, raw-assembly, bootstrap, library, source,
// doc, spark, js, native, docker, graalvm, deb, dmg, pkg, rpm, msi
//> using packaging.packageType graalvm
// packaged app name
//> using packaging.output out/app
//
// Dependencies
//
// cats, cats-effect
// fs2, fs2-io, fs2-data-csv
// http4s ember client
// circe
// decline, decline-effect
// munit, munit-cats-effect
//> using toolkit typelevel:latest
