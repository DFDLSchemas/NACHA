
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.tresys",
      version      := "0.1.0-SNAPSHOT",
      scalaVersion := "2.12.6",
      crossPaths := false,
      testOptions += Tests.Argument(TestFrameworks.JUnit, "-v"),
    )),
    name := "dfdl-nacha",
    libraryDependencies := Seq(
      // 
      // Note: for Daffodil 2.2.0, this module is named daffodil-tdml.
      // For Daffodil 2.3.0+ (and latest.integration snapshots thereof) it is named
      // daffodil-tdml-processor.
      //
      "org.apache.daffodil" %% "daffodil-tdml-processor" % "latest.integration" % "test",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test",
    )
  ).
  settings(nachaSettings)
  //
  // Uncomment this line below to run against IBM DFDL.
  // You need to have IBM DFDL installed and the IBM DFDL Cross Tester
  //
  // Note: This requires a 2.3.0 release of daffodil. (See version of daffodil-tdml-processor above)
  // or a development snapshot (e.g., version "latest.integration")
  // 
  //.settings(IBMDFDLCrossTesterPlugin.settings)

lazy val nachaSettings = Seq(
  // instead of src/main/resources, find the schema xsd files in the base directory
  unmanagedResourceDirectories in Compile += baseDirectory.value,
  // instead of src/test/resources, find the test resources under the base directory
  unmanagedResourceDirectories in Test += baseDirectory.value,
  // but also look in src/test/resources
  unmanagedResourceDirectories in Test += baseDirectory.value /"src" / "test" / "resources",
  // but only *.xsd are resources we want.
  includeFilter in (Compile, unmanagedResources) := "*.xsd",
  // include only the files we care about in test resources
  includeFilter in (Test, unmanagedResources) :=  "TestData_2013" || "TestInfosets_2013" || "*.xml" || "*.txt" || "*.tdml",
)
