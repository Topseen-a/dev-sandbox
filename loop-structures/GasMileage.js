let miles = 0;
let gallons = 0;

while (true) {
    const prompt = require("prompt-sync")();
    let milesDriven = parseInt(prompt("Enter the miles driven or -1 to exit: "));
    
    if (milesDriven == -1){
        break;
    }
    else {
        let gallonsUsed = parseInt(prompt("Enter the gallons used: "));

        let trip = milesDriven / gallonsUsed;
        console.log("The miles per gallon for each trip is " + trip);

        miles += milesDriven;
        gallons += gallonsUsed;

        let combined = miles / gallons;
        console.log("The combined miles per gallons is " + combined);
    }
}
