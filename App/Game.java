public class Game {
    public static void main(String args[]){
        System.out.println("数当てゲーム");
            int [] numbers = {3, 4, 9};
            System.out.println("一桁の数字を入力してください");
            int input = new java.util.Scanner(System.in).nextInt();
            for(int n : numbers){
                if(input == n){
                System.out.println("あたり！");
                } else {
                    System.out.println("外れ");
                }
        }
        System.out.println("ゲームを終了します");
    }
}
