console.log("N\tN2\tN3\tN4");

for (let count = 1; count <= 5; count++){

    let powerTwo = count * count;
    let powerThree = count * count * count;
    let powerFour = count * count * count * count;
    console.log(count + "\t" + powerTwo + "\t" + powerThree + "\t" + powerFour);
}
