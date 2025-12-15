const prompt = require("prompt-sync")();

let number = 0;
let largest = number;
let secondLargest = number;

for (let count = 1; count <= 10; count++){

    number = parseInt(prompt("Enter a number: "));

    if (number > largest){
        largest = number;
    }
    else if (number > secondLargest && secondLargest != largest){
        secondLargest = number;
    }
}
console.log("The largest is",largest);
console.log("The scond largest is", secondLargest)
