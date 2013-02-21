import sbt._
import Keys._

object SvmLightJniBuild extends Build {
  
  lazy val svmLightJni = Project(id = "SvmLightJni", base = file("."))
  
}