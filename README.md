NACHA Electronic Payment messages
=================================

This GitHub repository holds DFDL schemas that model NACHA - The Electronic Payments Association messages.
The messages correspond to the following releases of the NACHA Operating Rules and Guidelines:

    2013

To download the repository go to http://dfdlschemas.github.com/NACHA/.

The NACHA 2013 schemas are in folder 2013.

A NACHA file consists of a File Header record, repeating batches and a File Control record.
A batch consists of a Batch Header record, repeating entries and a Batch Control record.
An entry consists of an Entry Detail record optionally followed by Addenda records.
Entry Detail records of types CCD, CTX, ACK and ATX are currently supported.

nacha_format.xsd 
----------------
A DFDL schema that contains default values for DFDL properties that are suitable for NACHA data.

nacha_types.xsd
---------------
A DFDL schema that provides a set of DFDL-annotated types for NACHA data types.

nacha_elements.xsd
------------------
A DFDL schema that provides a set of DFDL-annotated elements for NACHA fields.

nacha_records.xsd
-----------------
A DFDL schema that provides a set of DFDL-annotated elements for NACHA records.

nacha_file.xsd
--------------
A DFDL schema that provides a DFDL-annotated element to model a NACHA file. 

----------------
NACHA 2013 Operating Rules and Guidelines may be purchased from the NACHA website: www.nacha.org

Please observe the copyright notice within each schema.

