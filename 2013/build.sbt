name := "dfdl-nacha"
 
organization := "com.tresys"
 
version := "0.0.1-SNAPSHOT"
 
scalaVersion := "2.12.11"
 
libraryDependencies := Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % "test"
  "com.novocode" % "junit-interface" % "0.11" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false


// instead of src/main/resources, find the schema xsd files in the base directory
unmanagedResourceDirectories in Compile += baseDirectory.value,

// instead of src/test/resources, find the test resources under the base directory
unmanagedResourceDirectories in Test += baseDirectory.value,

// but also look in src/test/resources
unmanagedResourceDirectories in Test += baseDirectory.value / "src" / "test" / "resources",

// but only *.xsd are resources we want.
includeFilter in (Compile, unmanagedResources) := "*.xsd",

// include only the files we care about in test resources
includeFilter in (Test, unmanagedResources) :=  "TestData_2013" || "TestInfosets_2013" || "*.xml" || "*.txt" || "*.tdml",
