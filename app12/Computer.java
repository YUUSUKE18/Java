class Computer extends TangigleAsset {
    private String makerName;

    public Computer(String name, int price, String color, String isbn){
        super(this.name, this.price, this.color);
        this.makerName = makerName;
    }

    public String getMakerName(String makerName){
        return this.makerName;
    }

}