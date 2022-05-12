scalaVersion := "2.12.15"

name := "scalameta-2750"
organization := "com.github.tanishiking"
version := "1.0"


libraryDependencies += "com.wix" %% "accord-core" % "0.7.3"

addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "4.5.0-SNAPSHOT" cross CrossVersion.full)
scalacOptions += "-Yrangepos"

