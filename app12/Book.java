class Book extends TangigleAsset {

    private String isbn;
    public Book(String name, int price, String color, String isbn){
        super(this.name, this.price, this.color);
        this.isbn = isbn;
    }


    public String getIsbn(String isbn){
        return this.isbn;
    }

}