name := "helloSpark"

version := "1.1"

scalaVersion := "2.10.5"

libraryDependencies ++= {
  val sparkVersion =  "1.3.1"
  Seq(
    "org.apache.spark" %%  "spark-core"	  %  sparkVersion % "provided",
    "org.apache.spark" %%  "spark-sql"	  %  sparkVersion % "provided",
    "org.apache.spark" %% "spark-repl" % sparkVersion % "provided"
  )
}
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
