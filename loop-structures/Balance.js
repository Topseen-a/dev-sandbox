const prompt = require("prompt-sync")();
 
while (true) {
let account = parseInt(prompt("Enter account number or -1 to exit: "));

    if (account == -1) {
        break;
    }
    else {
        let beginningBalance = parseInt(prompt("Enter beginning balance: "));
        let itemsCharged = parseInt(prompt("Enter items charged: "));
        let creditApplied = parseInt(prompt("Enter credits applied: "));
        let creditLimit = parseInt(prompt("Enter credit limit: "));

        let newBalance = beginningBalance + itemsCharged - creditApplied;
        console.log("Your new balance is " + newBalance);

        if (newBalance > creditLimit){
            console.log("Credit Limit exceeded");
        }
        else {
            console.log("Credit Limit is okay");
        }
    }
}  
