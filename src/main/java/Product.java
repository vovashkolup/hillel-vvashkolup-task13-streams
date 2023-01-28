import java.time.LocalDate;

public class Product {

    private String type;
    private double price;
    private boolean isForSale;
    private LocalDate date;
    private int id;

    public int getId() {
        return id;
    }

    public Product(String type, double price, boolean isForSale, LocalDate date, int id) {
        this.type = type;
        this.price = price;
        this.isForSale = isForSale;
        this.date = date;
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Product(String type, double price, boolean isForSale, LocalDate date) {
        this.type = type;
        this.price = price;
        this.isForSale = isForSale;
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public Product(String type, double price, boolean isForSale) {
        this.type = type;
        this.price = price;
        this.isForSale = isForSale;
    }

    @Override
    public String toString() {
        return "\n" +
                "{type:'" + type + '\'' +
                ", price:" + price +
                ", discount:" + isForSale +
                ", createDate:" + date +
                "," +
                '}'+"\n";
    }

//    @Override
//    public String toString() {
//        return "{type:'" + type + '\'' +
//                ", price:" + price+"}";
//    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }
}
