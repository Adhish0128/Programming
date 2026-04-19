class BankAccount{
    int accNumber;
    String Name;
    double balance;
    BankAccount(int accNumber,String Name,double balance){
        this.accNumber=accNumber;
        this.Name=Name;
        this.balance= balance;
    }
    void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit amount must be more than 0");
            
        }else{
            balance=balance+amount;
            System.out.println(amount+"Is diposited to"+Name);
        }
    }
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Enter a valid amount");
        } else if(amount>balance){
            System.out.println("No enough balance in "+Name+"s Account");
        }else{
            balance=balance-amount;
            System.out.println(amount+"Is withdrawn from"+Name);
            
        }
    }
    void showBalance(){
        System.out.println("Account No:"+accNumber);
        System.out.println("Account holders name:"+Name);
        System.out.println("Balance"+balance);
        System.out.println("Account No:"+accNumber);
    }
}
public class MainClass{
    public static void main(String[] args){
        BankAccount acc1= new BankAccount (101,"Pratik Koirala",50000)
;  BankAccount acc2= new BankAccount(105,"Ramesh Thapa",36000);
    System.out.println("Initial balance");
    acc1.showBalance();
    acc2.showBalance();
    System.out.println("Transaction");
    acc1.deposit(10000);
    acc1.withdraw(5000);
    acc2.deposit(20000);
    acc2.withdraw(3000);
    acc2.withdraw(1000);
    System.out.println("Final Balance");
    acc1.showBalance();
    acc2.showBalance();
    }
    
}