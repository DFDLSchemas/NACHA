val root = (project in file("."))
  .settings(
    name := "dfdl-nacha",

    organization := "com.ibm",

    version := "0.0.2"
  )
  .daffodilProject()
