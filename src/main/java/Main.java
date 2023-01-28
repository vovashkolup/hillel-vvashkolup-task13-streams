import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> example = List.of(
                new Product("Book", 100),
                new Product("Book", 260),
                new Product("Book", 330),
                new Product("Magazine", 40),
                new Product("Magazine", 50)
        );
//        StreamClass.expensiveBooks(example);


        List<Product> example2 = List.of(
                new Product("Book", 100, false),
                new Product("Book", 260, true),
                new Product("Book", 330, false),
                new Product("Magazine", 40, true),
                new Product("Magazine", 50, false)
        );

//        StreamClass.discountProducts(example2);

        List<Product> example3 = List.of(
                new Product("Book", 100, false),
                new Product("Book", 260, true),
                new Product("Book", 330, false),
                new Product("Magazine", 40, true),
                new Product("Magazine", 50, false)
        );

        List<Product> example4 = List.of(

        );

        List<Product> example5 = List.of(
                new Product(null, 100, false)
        );

//        StreamClass.minPrice(example3);
//        StreamClass.minPrice(example4);
//        StreamClass.minPrice(example5);

        List<Product> example6 = List.of(
                new Product("Book", 100, false, LocalDate.of(2022, 1, 1)),
                new Product("Book", 260, true, LocalDate.of(2022, 2, 1)),
                new Product("Book", 330, false, LocalDate.of(2022, 3, 1)),
                new Product("Magazine", 40, true, LocalDate.of(2022, 4, 1)),
                new Product("Magazine", 50, false, LocalDate.of(2022, 5, 1))
        );

//        StreamClass.lastThreeAdded(example6);

        List<Product> example7 = List.of(
                new Product("Book", 10, false, LocalDate.of(2022, 1, 1)),
                new Product("Book", 260, true, LocalDate.of(2022, 2, 1)),
                new Product("Book", 50, false, LocalDate.of(2022, 3, 1)),
                new Product("Magazine", 40, true, LocalDate.of(2022, 4, 1)),
                new Product("Magazine", 50, false, LocalDate.of(2022, 5, 1))
        );

//        StreamClass.sumOfCheapBooks(example7);

        List<Product> example8 = List.of(
                new Product("Book", 10, false, LocalDate.of(2022, 1, 1)),
                new Product("Book", 260, true, LocalDate.of(2022, 2, 1)),
                new Product("Book", 55, false, LocalDate.of(2022, 3, 1)),
                new Product("Magazine", 40, true, LocalDate.of(2022, 4, 1)),
                new Product("Magazine", 50, false, LocalDate.of(2022, 5, 1))
        );
        StreamClass.listAllProducts(example8);

    }

}
