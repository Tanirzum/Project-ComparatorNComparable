public class House implements Comparable<House> {
    private int area;
    private int price;
    private int countOfRooms;
    private int ageOfConstruction;

    public House(int area, int price, int countOfRooms, int ageOfConstruction) {
        this.area = area;
        this.price = price;
        this.countOfRooms = countOfRooms;
        this.ageOfConstruction = ageOfConstruction;
    }

    @Override
    public String toString() {
        return "{area=" + area + ", price=" + price + ", countOfRooms=" + countOfRooms +
                ", ageOfConstruction=" + ageOfConstruction + "}";
    }

    public int getArea() {
        return area;
    }


    public int getCountOfRooms() {
        return countOfRooms;
    }


    public int getAgeOfConstruction() {
        return ageOfConstruction;
    }


    @Override
    public int compareTo(House o) {
        return this.price - o.price;
    }
}

