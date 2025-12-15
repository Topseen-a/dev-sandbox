const prompt = require("prompt-sync")();

let numberOne = parseInt(prompt("Enter first integer: "));
let numberTwo = parseInt(prompt("Enter second integer: "));
let numberThree = parseInt(prompt("Enter third integer: "));

let sum = numberOne + numberTwo + numberThree;
console.log("The sum of the three integers is: " +  sum);

let average = sum / 3;
console.log("The average of the three integers is: " +  average);

let product = numberOne * numberTwo * numberThree;
console.log("The product of the three integers is: " +  product);   

if (sum <= average && sum <= product){
        console.log("Sum is the smallest number  "  +  sum); 
    }
else if (average <= sum && average <= product){
        console.log("Average is the smallest number  "  +  average);            
    }
else {
        consoe.log("Product is the smallest number  "  +  product);                 
    }  
 
if (sum >= average && sum >= product){
        console.log("Sum is the largest number  "  +  sum); 
    }
else if (average >= sum && average >= product){
        console.log("Average is the largest number  "  +  average);            
    }
else {
        console.log("Product is the largest number  "  +  product);                 
    }
