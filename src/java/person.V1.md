## Create a class called Person
## Owner: Aarti Saravanan


## The data members will be:
## givenName - people may change there name so we ask for the name from when they were first born that is on there birth certificate
## familyName - people may change there name so we ask for the name from when they were first born that is on there birth certificate
## Job - data can change (DEPRECATED)
## Place of Birth - can't change, set data
## Date of Birth - can't change, set data

## The behaviour:
## person(DOB, Place of Birth, givenName, familyName) - constructor asking for the data required
## not using person() because its an open constructor which would take no data in

## The methods:
## getGivenName() - gets given name (Read Only)
## getFamilyName() - gets family name (Read Only)
## getDOB() - gets date of birth (Read Only)
## setDOB() - sets date of birth (can't change) (DEPRECATED)
## setName() - sets name (can change in certain limited circumstances)
