NACHA Electronic Payment messages
=================================

This GitHub repository holds DFDL schemas that model NACHA - The Electronic Payments Association messages.
The messages correspond to the following releases of the NACHA Operating Rules and Guidelines:

    2013

To download the repository go to http://dfdlschemas.github.com/NACHA/.

A NACHA message is referred to as a file, and consists of a File Header record, repeating batches and a File Control record.
A batch consists of a Batch Header record, repeating entries and a Batch Control record.
An entry consists of an Entry Detail record optionally followed by Addenda records.

Entry Detail records of the following types are currently supported:

    PPD
    CCD
    CTX
    ACK
    ATX

Addenda records including those for Returns, Dishonored Returns and Contested Dishonoured Returns are supported.

The NACHA 2013 schemas are in the '2013' folder.

Test data and infosets are included.

The DFDL schemas are compatible with IBM DFDL 1.0 and 1.1 releases, as shipped in IBM WebSphere Message Broker 8.0.0.1 onwards and IBM Integration Bus 9.0.0.1 onwards, respectively.

As of 2017-01-11, these schemas are also compatible with the Daffodil open-source DFDL implementation, and can be tested via 'sbt test' using the 'sbt' build tool.

By using the IBM DFDL Cross Tester for Daffodil, you can run the TDML tests defined here against either Daffodil or IBM DFDL changing only a single line in build.sbt.

See the setup instructions for the IBM DFDL Cross Tester at https://github.com/OpenDFDL/ibmDFDLCrossTester

----------------
NACHA 2013 Operating Rules and Guidelines may be purchased from the NACHA website: www.nacha.org

Please observe the copyright notice within each schema.

