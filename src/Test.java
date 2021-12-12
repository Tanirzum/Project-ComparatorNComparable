import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<House> houseList = Arrays.asList(
                new House(100, 150000, 6, 2019),
                new House(55, 48000, 2, 2020),
                new House(37, 37000, 1, 2010),
                new House(45, 45000, 3, 1991),
                new House(46, 55000, 2, 2015)
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Filter by price;
                2.Filter by area;
                3.Filter by count of rooms;
                4.Filter by age.
                Enter your number here:""");
        String input = scanner.nextLine();

        switch (Integer.parseInt(input)) {
            case 1 -> {
                houseList.sort(House::compareTo);
                System.out.println("Filter by price: \n" + houseList);
            }
            case 2 -> {
                Comparator<House> area = new FilterByArea();
                houseList.sort(area);
                System.out.println("Filter by area: \n" + houseList);
            }
            case 3 -> {
                Comparator<House> rooms = new FilterByCountOfRooms();
                houseList.sort(rooms);
                System.out.println("Filter by count of rooms: \n" + houseList);
            }
            case 4 -> {
                Comparator<House> age = new FilterByAge();
                houseList.sort(age);
                System.out.println("Filter by age: \n" + houseList);
            }
            default -> System.out.println("Write right number");
        }
    }
}
