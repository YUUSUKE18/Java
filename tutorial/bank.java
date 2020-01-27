class WithDraw {
    void User_Details(){
        System.out.println("With Draw Money");
    }
}

class Check extends WithDraw {
    void Check_Detail(){
        System.out.println("With Draw Money");
    }
}

public class User {
    public static void main(String args[]){
        Customer one = new Check();
        one.Check_Detail();
        one.User_Details();
    }
}