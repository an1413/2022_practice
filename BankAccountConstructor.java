class BankAccount{
    String accNumber;
    String ssNumber;
    int balance; // 예금잔액

    public BankAccount(String acc,String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMybalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔   액: " + balance);
        return balance;
    }
}

class BankAccountConstructor {
    public static void main(String[] args){
        BankAccount nabyeol = new BankAccount("742-00-0154","928-1183849",10000);
        BankAccount sumin = new BankAccount("334-00-0154","928-2183849",15000);

        sumin.deposit(3000);
        nabyeol.deposit(50000);
        nabyeol.checkMybalance();
        

    }
}
