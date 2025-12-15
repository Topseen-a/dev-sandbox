miles = 0
gallons = 0

while True:
    miles_driven = int(input("Enter the miles driven or -1: "))
    
    if miles_driven == -1:
        break
    else:
        gallons_used = int(input("Enter the gallons used: "))

        trip = miles_driven / gallons_used
        print("The miles per gallon for each trip is", trip)

        miles += miles_driven
        gallons += gallons_used

        combined = miles / gallons
        print("The combined miles per gallon is", combined)
