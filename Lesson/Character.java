public class Character {

    //Field
    String name;
    int hp;
    int attackPoint;

    Character(String name, int hp, int attackPoint){
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    //Method
    void attack(){
        System.out.println("攻撃する");
    }

    void runAway(){
        System.out.println("逃げる");
    }

    void callName(){
        System.out.println("私の名前は" + this.name + "です");
    }
}