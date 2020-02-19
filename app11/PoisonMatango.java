class PoisonMatango extends Matango {
    int attack_num = 5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    
    public void attack(Hero h){
        System.out.println("きのこ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.setHp(h.getHp() - 10); 
        if(this.attack_num > 0){
            System.out.println("毒の胞子をばらまいた");
            int posion_power = h.getHp() / 5;
            h.setHp(h.getHp() - posion_power);
            System.out.println(posion_power + "のダメージを食らった");
            attack_num--;
        }
    }


}