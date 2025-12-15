const prompt = require("prompt-sync")();

let numberOne = parseFloat(prompt("Enter a number: "));
let numberTwo = parseFloat(prompt("Enter another number: "));
let numberThree = parseFloat(prompt("Enter another number: "));

let smallest;
let middle;
let largest;

if (numberOne < numberTwo && numberOne < numberThree){
    smallest = numberOne;
    if (numberTwo < numberThree){
        middle = numberTwo;
        largest = numberThree;
    }
    else {
        middle = numberThree;
        largest = numberTwo;
    }
}
else if (numberTwo < numberOne && numberTwo < numberThree){
    smallest = numberTwo;
    if (numberOne < numberThree){
        middle = numberOne;
        largest = numberThree;
    }
    else {
        middle = numberThree;
        largest = numberOne;
    }
}
else if (numberThree < numberOne && numberThree < numberTwo){
    smallest = numberThree;
    if (numberOne < numberTwo){
        middle = numberOne;
        largest = numberTwo;
    }
    else {
        middle = numberTwo;
        largest = numberOne;
    }
}
console.log("Ascending order is:", smallest, middle, largest);
