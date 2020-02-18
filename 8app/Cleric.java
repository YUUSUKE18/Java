import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int max_hp = 50;
    int mp = 10;
    final int max_mp = 10;

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