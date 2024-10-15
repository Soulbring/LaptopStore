import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> filterCriteria = new HashMap<>();

        System.out.print("Введите критерий фильтрации (например, brand, price, ram, processor): ");
        String key = scanner.nextLine();
        System.out.print("Введите значение для критерия " + key + ": ");
        String value = scanner.nextLine();

        filterCriteria.put(key, value);

        List<Laptop> laptops = List.of(
                new Laptop("Dell", 800, 8, "Intel i5"),
                new Laptop("HP", 600, 8, "AMD Ryzen 5"),
                new Laptop("Apple", 1200, 16, "M1"),
                new Laptop("Asus", 700, 8, "Intel i7")
        );

        List<Laptop> filteredLaptops = filterLaptops(laptops, filterCriteria);

        System.out.println("Ноутбуки, соответствующие критерию: ");
        filteredLaptops.forEach(System.out::println);
    }

    private static List<Laptop> filterLaptops(List<Laptop> laptops, Map<String, String> criteria) {
        return laptops.stream().filter(laptop -> {
            for (Map.Entry<String, String> entry : criteria.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                switch (key) {
                    case "brand":
                        if (!laptop.getBrand().equalsIgnoreCase(value)) return false;
                        break;
                    case "price":
                        if (laptop.getPrice() != Double.parseDouble(value)) return false;
                        break;
                    case "ram":
                        if (laptop.getRam() != Integer.parseInt(value)) return false;
                        break;
                    case "processor":
                        if (!laptop.getProcessor().equalsIgnoreCase(value)) return false;
                        break;
                    default:
                        System.out.println("Неизвестный критерий фильтрации: " + key);
                        return false;
                }
            }
            return true;
        }).collect(Collectors.toList());
    }
}
