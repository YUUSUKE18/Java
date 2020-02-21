public class Bank {
    String accountNumber;
    int balance;

    public String toString(){
        return "¥¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }

    public boolean equals(Object o){
        if(this == 0){
            return true;
        }
        if(o instanceof Account){
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if(an1.equals(an2)){
                return true;
            }
        }
        return false;
    }

//     public static String bankCheck(){
//         Account a = new Account();
//         a = ["残高": 1592, "口座番号": 4649];
//         System.out.println(a);
//     }


//     private static Object trim(a) {
//         if(a.equalto num){
//             System.out.println(a);
//         }
//     }
// }