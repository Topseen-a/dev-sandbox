const prompt = require("prompt-sync")();

let lengthOfBase = parseInt(prompt("Enter the length of base between (1-10): "))

while (lengthOfBase < 1 || lengthOfBase > 10) {
    lengthOfBase = parseInt(prompt("Enter the length of base between (1-10): "))
}

for (let index = 1; index <= lengthOfBase; index++) {
    for (let count = 1; count <= index; count++) {
        process.stdout.write("*");
    }
    console.log();
}
