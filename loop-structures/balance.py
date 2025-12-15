while True:
    account_number = int(input("Enter account number or -1 to exit: "))
    if account_number == -1:
        break
    else:
        beginning_balance = int(input("Enter beginning balance: "))
        items_charged = int(input("Enter items_charged: "))
        credit_applied = int(input("Enter credit applied: "))
        credit_limit = int(input("Enter credit limit: "))
        
        new_balance = beginning_balance + items_charged - credit_applied
        print("Your new balance is", new_balance)
    
        if new_balance > credit_limit:
            print("Credit limit exceeded")
        else:
            print("Credit limit is okay")
