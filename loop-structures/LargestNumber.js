const prompt = require("prompt-sync")();

let number = 0;
let largest = number;

for (let count = 1; count <= 10; count++){

    number = parseInt(prompt("Enter a number: "));

    if (number > largest){
        largest = number;
    }
}
console.log("The largest is",largest);
