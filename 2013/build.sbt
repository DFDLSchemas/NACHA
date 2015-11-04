scalaVersion in ThisBuild := "2.11.7"

organization := "com.tresys"

version := "0.0.1"

// instead of src/main/resources, find the schema xsd files in the base directory
unmanagedResourceDirectories in Compile += baseDirectory.value

// instead of src/test/resources, find the test resources under the base directory
unmanagedResourceDirectories in Test += baseDirectory.value

// but also look in src/test/resources
unmanagedResourceDirectories in Test += baseDirectory.value /"src" / "test" / "resources"

// but only *.xsd are resources we want.
includeFilter in (Compile, unmanagedResources) := "*.xsd"

// include only the files we care about in test resources
includeFilter in (Test, unmanagedResources) :=  "TestData_2013" || "TestInfosets_2013" || "*.xml" || "*.txt" || "*.tdml"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0-SNAPSHOT" % "test"
)

retrieveManaged := true

exportJars in ThisBuild := true


