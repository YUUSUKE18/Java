// public class Main{
//     public static void main(String[] args) {
//        Character hero = new Character();
//        hero.name = "yuu";
//        hero.hp = 100;
//        hero.attackPoint = 5;
//     //    hero.attack();
//     //    hero.runAway();

//        hero.callName();
//     }
// }

public class Main {

    public static void main(String[] args){
        //heroを作りました。
        Character hero = new Character("yuu", 100, 5);

        //キャラクターの設定
        hero.hp = 100;
        hero.attackPoint = 10;

        //メソッドの呼び出し
       hero.attack(); //攻撃する。
       hero.runAway(); //逃げる。
       hero.callName();//名前を名乗る
    }  
}