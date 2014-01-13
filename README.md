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

    CCD
    CTX
    ACK
    ATX

The NACHA 2013 schemas are in the '2013' folder.

----------------
NACHA 2013 Operating Rules and Guidelines may be purchased from the NACHA website: www.nacha.org

Please observe the copyright notice within each schema.

