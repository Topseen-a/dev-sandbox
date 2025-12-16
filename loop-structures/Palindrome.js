const prompt = require("prompt-sync")();

let digit = parseInt(prompt("Enter a five digit integer: "));

while(true){
    if (digit >= 10000 && digit <= 99999){
        break;
    }
    else {
        digit = parseInt(prompt("Enter a five digit integer: "));
    }
}

let digitOne = Math.floor(digit / 10000) % 10;
let digitTwo = Math.floor(digit / 1000) % 10;
let digitThree = Math.floor(digit / 100) % 10;
let digitFour = Math.floor(digit / 10) % 10;
let digitFive = digit % 10;

if (digitOne == digitFive && digitTwo == digitFour){
    console.log("It is a palindrome");
}
else {
    console.log("It is not a palindrome");
}
