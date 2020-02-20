public abstract class TangigleAsseet extends Asset implements Thing {
    private String color;
	private double weight;

    public TangigleAsseet(String name, int price, String color){
        super(name, price);
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }


}