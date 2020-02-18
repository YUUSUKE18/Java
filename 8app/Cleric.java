import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    // final int max_hp = 50;
    int mp = 10;
    // final int max_mp = 10;
    static final int max_hp = 50;
    static final int max_mp = 10;

    void Cleric(String name , int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    void Cleric(String name , int hp){
        this(name, hp, Cleric.max_mp);
    }

    void Cleric(String name){
        this(name, Cleric.max_hp);
    }

    void Cleric(){
        this();
    }




    void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた");
        this.mp -= 5;
        this.hp = this.max_hp;
        System.out.println("HPが最大限まで回復した");
    }

    int pray(int sec) {
        int recover_mp = new Random().nextInt(3) + sec;
        int recoverActual = Math.min(this.max_mp - this.mp, recover_mp);
        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した");
        return recoverActual;
    }
}