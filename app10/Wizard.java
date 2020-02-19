public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        if(hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp(){
        return this.mp;
    }

    public void setMp(int mp){
        if(mp < 0){
            mp = 0;
        }
        this.mp = mp;
    }

    public int getWand(){
        return this.wand;
    }

    public void setWp(Wand wand){
        if(mp < 0){
            mp = 0;
        }
        this.wand = wand;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name == null || name.length() > 3){
            System.out.println("正しく入力してください");
        }
        this.name = name;
    }

    void heal(Hero h){
        int basePoint = 10;
        int recoverPoint = (int) (basePoint * this.wand.power);

        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");
    }


}