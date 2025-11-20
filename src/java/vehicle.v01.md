# vehicle V1
## owner: Tristan Berns
## purpose: To define the structure, needed data and behaviours of the vehicle class. Attributes and methods are described, including what can and can't change.

## the data:
make – the manufacturer of the vehicle, can't change (set data)
model – the model of the vehicle, can't change (set data)
VIN – unique identifier for the vehicle, can't change (set data)
registration – can change over time (e.g. plate replacement)
color – can change
owner – can change (vehicle can be bought/sold)

## behaviours and methods:
vehicle(make, model, VIN)
getMake() – gets the make (Read Only)
getModel() – gets the model (Read Only)
getVin() – gets the VIN (Read Only)
getRegistration() – gets the registration
setRegistration() – sets the registration (can change)
getColor() – gets the color
setColor() – sets the color (can change)
getOwner() – gets the owner
setOwner() – sets the owner (can change)
