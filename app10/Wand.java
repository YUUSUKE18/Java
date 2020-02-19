public class Wand {
    private String name;
    private double power;

    getName(){
        return this.name;
    }
    setName(){
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException("正しく入力してください");
        }
        this.name = name;
    }

    getPower(){
        return this.power;
    }

    setPower(){
        if(power < 0.5 || power > 100){
            throw new IllegalArgumentException("正しく入力してください");
        }
        this.power = power;
    }
}