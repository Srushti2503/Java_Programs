package MultiLevelInheritance;


/*Create class Bank → Account → SavingsAccount
Add features like deposit, withdraw, interest.

 */



public class Bank {
    void show(){
        System.out.println("This is your bank account");
    }

    public static void main(String[] args) {
        SavingAccount aa= new SavingAccount();
        aa.show();
        aa.getdata();
        aa.putdata();
    }
}
class Account extends Bank {
    void getdata(){
        int account_number=1010;
        System.out.println("Your account number:"+account_number);
    }
}
class SavingAccount extends Account {
    void putdata(){
        System.out.println("This is your saving account");
    }
}

