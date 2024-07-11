ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.3"

resolvers ++= Seq(
  "spigotmc-repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/",
  "sonatype"      at "https://oss.sonatype.org/content/groups/public/"
)

libraryDependencies ++= Seq(
  "org.spigotmc"  %  "spigot-api"  % "1.20.1-R0.1-SNAPSHOT" % "provided",
  "org.typelevel" %% "cats-effect" % "3.5.4"
)

lazy val root = (project in file("."))
  .settings(
    name := "LearnPlugin-Scala"
  )

assembly / assemblyMergeStrategy := {
  case PathList("plugin.yml")   => MergeStrategy.first
  case PathList("META-INF", _*) => MergeStrategy.discard
  case x =>
    val oldStrategy = (assembly / assemblyMergeStrategy).value
    oldStrategy(x)
}