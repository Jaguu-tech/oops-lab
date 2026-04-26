/*// Create a class Bank Account with data members as account_number, name and saving_balance. The member functions are setdata, display, 
// withdraw, deposit and transfer amount. Create main() to create 3 objects of class Bank Account and use all the methods.

class BankAccount {
     int account_number;
     String name;
    double saving_balance;

    void setdata(int a, String n, double s){
        account_number = a;
        name = n;
        saving_balance= s;
    }

    void display(){
        System.out.println("Account Number: "+account_number);
        System.out.println("Name: "+name);
        System.out.println("Saving Balance: "+saving_balance);
        System.out.println("-----------------------------------------------------------------------------");
    }

    void deposit(double amount){
         saving_balance= saving_balance+amount;
         System.out.println("Deposited Sccuessfully: "+amount);
    }

    void withdraw(double amount){
        if(amount<=saving_balance){
            saving_balance=saving_balance-amount;
            System.out.println("Withdrawal Successfully: "+amount);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void transfer(BankAccount reciever,double amount){
        if(amount<=saving_balance){
            saving_balance=saving_balance-amount;
            reciever.saving_balance=reciever.saving_balance+amount;
            System.out.println("Transferred Amount Successfully: "+amount);
        }
        else{
            System.out.println("Failed to transfer amount!");
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        b1.setdata(101, "Jagruti", 3000);
        b2.setdata(102, "Mansi", 5000);
        b3.setdata(103, "Atharav", 7000);

        b1.display();
        b2.display();
        b3.display();

        b1.deposit(2000);
        b2.withdraw(2000);
        b3.transfer(b2, 2000);

        System.out.println(" After Transactions ");
        b1.display();
        b2.display();
        b3.display();
    }
}*/

class BankAccount{
    int account_no;
    static String name="Google";
    double balance;

    void setData(int a, double b){
        account_no=a;
        balance=b;
    }

    void display(){
        System.out.println("Account Number: "+account_no);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }

    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposited Successfully"+balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Withdrawal Successfully"+balance);
        }
        else{
            System.out.println("Withdrawal Failed!!");
        }
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        b1.setData(101, 2000);
        b2.setData(102, 3000);
        b3.setData(103, 4000);

        b1.display();
        b2.display();
        b3.display();

        b1.withdraw(300);
        b2.deposit(700);

        System.out.println("After Transactions");
        b1.display();
        b2.display();
        
    }
}
