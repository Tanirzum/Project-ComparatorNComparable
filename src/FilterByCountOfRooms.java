import java.util.Comparator;

public class FilterByCountOfRooms implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getCountOfRooms() - o2.getCountOfRooms();
    }
}