import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

    public static List<Product> expensiveBooks(List<Product> products) {
        System.out.println(products.stream().filter(product -> product.getType().equals("Book")).
                filter(product -> product.getPrice() >= 250).collect(Collectors.toList()));
        return products.stream().filter(product -> product.getType().equals("Book")).
                filter(product -> product.getPrice() >= 250).collect(Collectors.toList());
    }

    public static List<Product> discountProducts(List<Product> products) {

        System.out.println(products.stream().filter(product -> product.getType().equals("Book") && product.isForSale()).
                map(product -> {
                    Product p = new Product("Book", product.getPrice() * 0.9, true);
                    return p;
                })
                .collect(Collectors.toList()));


        return products.stream().filter(product -> product.getType().equals("Book") && product.isForSale()).
                map(product -> {
                    Product p = new Product("Book", product.getPrice() * 0.9, true);
                    return p;
                })
                .collect(Collectors.toList());
    }

    public static Product minPrice(List<Product> products) {
        try {
            System.out.println(products.stream().filter(product -> product.getType().equals("Book"))
                    .min(Comparator.comparing(Product::getPrice)).
                    orElseThrow(() -> new IncorectDataException("No product found")));

            return products.stream().filter(product -> product.getType().equals("Book"))
                    .min(Comparator.comparing(Product::getPrice)).
                    orElseThrow(() -> new IncorectDataException("No product found"));
        } catch (NullPointerException e) {
            System.out.println("There is null in type name");
        }
        return new Product("default", 0);
    }

    public static Map<LocalDate, List<Product>> lastThreeAdded(List<Product> products) {
        System.out.println(products.stream().limit(3).collect(Collectors.groupingBy(Product::getDate)));
        return products.stream().limit(3).collect(Collectors.groupingBy(Product::getDate));
    }

    public static double sumOfCheapBooks(List<Product> products) {
        System.out.println("Sum is "+products.stream().filter(product -> product.getType().
                equals("Book") && product.getPrice() <= 75
                && product.getDate().getYear() == 2022).map(Product::getPrice).mapToDouble(Double::doubleValue).sum());
        return products.stream().filter(product -> product.getType().
                equals("Book") && product.getPrice() <= 75
                && product.getDate().getYear() == 2022).map(Product::getPrice).mapToDouble(Double::doubleValue).sum();
    }

    public static Map<String,List<Product>> listAllProducts(List<Product> products){
        System.out.println(products.stream().collect(Collectors.groupingBy(Product::getType)));
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }


}
