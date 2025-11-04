import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + 
               "', price=" + price + ", quantity=" + quantity + 
               ", totalValue=" + String.format("%.2f", getTotalValue()) + "}";
    }
}

public class ProductAnalysis {
    public static void main(String[] args) {
        // Create a large dataset of products
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 45000, 15),
            new Product("Mouse", "Electronics", 500, 50),
            new Product("Keyboard", "Electronics", 1200, 40),
            new Product("Monitor", "Electronics", 8000, 25),
            new Product("Desk", "Furniture", 12000, 10),
            new Product("Chair", "Furniture", 5000, 30),
            new Product("Table", "Furniture", 8000, 15),
            new Product("Notebook", "Stationery", 50, 200),
            new Product("Pen", "Stationery", 10, 500),
            new Product("Pencil", "Stationery", 5, 600),
            new Product("Smartphone", "Electronics", 25000, 20),
            new Product("Tablet", "Electronics", 18000, 12),
            new Product("Bookshelf", "Furniture", 6000, 8),
            new Product("Eraser", "Stationery", 3, 800),
            new Product("Headphones", "Electronics", 2000, 35)
        );

        System.out.println("========== Product Stream Operations ==========");
        System.out.println("\nTotal Products: " + products.size());

        // 1. Grouping products by category
        System.out.println("\n1. Products grouped by category:");
        Map<String, List<Product>> productsByCategory = products.stream()
            .collect(Collectors.groupingBy(Product::getCategory));
        
        productsByCategory.forEach((category, prods) -> {
            System.out.println("\n" + category + ":");
            prods.forEach(p -> System.out.println("  " + p));
        });

        // 2. Finding maximum price product in each category
        System.out.println("\n2. Maximum price product in each category:");
        Map<String, Optional<Product>> maxPriceByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
            ));
        
        maxPriceByCategory.forEach((category, product) -> 
            product.ifPresent(p -> 
                System.out.println(category + ": " + p.getName() + " (₹" + p.getPrice() + ")")
            )
        );

        // 3. Calculate average price by category
        System.out.println("\n3. Average price by category:");
        Map<String, Double> avgPriceByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.averagingDouble(Product::getPrice)
            ));
        
        avgPriceByCategory.forEach((category, avg) -> 
            System.out.println(category + ": ₹" + String.format("%.2f", avg))
        );

        // 4. Total inventory value by category
        System.out.println("\n4. Total inventory value by category:");
        Map<String, Double> totalValueByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.summingDouble(Product::getTotalValue)
            ));
        
        totalValueByCategory.forEach((category, total) -> 
            System.out.println(category + ": ₹" + String.format("%.2f", total))
        );

        // 5. Products with price greater than 5000
        System.out.println("\n5. Products with price > ₹5000:");
        products.stream()
            .filter(p -> p.getPrice() > 5000)
            .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
            .forEach(System.out::println);

        // 6. Overall statistics
        System.out.println("\n6. Overall Statistics:");
        DoubleSummaryStatistics stats = products.stream()
            .mapToDouble(Product::getPrice)
            .summaryStatistics();
        
        System.out.println("Highest Price: ₹" + stats.getMax());
        System.out.println("Lowest Price: ₹" + stats.getMin());
        System.out.println("Average Price: ₹" + String.format("%.2f", stats.getAverage()));
        System.out.println("Total Products: " + stats.getCount());
        
        double totalInventoryValue = products.stream()
            .mapToDouble(Product::getTotalValue)
            .sum();
        System.out.println("Total Inventory Value: ₹" + String.format("%.2f", totalInventoryValue));
    }
}
