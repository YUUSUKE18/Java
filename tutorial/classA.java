class Bank {
    private int account_number;
    String name;
    String address;
    //int age;
    int phone_number;
    String email;
    // int family_number;
    String job;
    int income;
    private int account_balance;

    public void showData(){
        System.out.println("Account Number + account_number");
        System.out.println("Account Balance + account_balance");
    }

    public void deposit(int a) {
        if(a < 0){
            System.out.println("Error!");
        } else {
            account_balance = account_balance + a;
        }
    }

    public int getBalance(){
        return this.account_balance;
    }

    public void setNumber(int num){
        this.account_number = num;
    }
}