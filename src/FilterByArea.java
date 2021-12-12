import java.util.Comparator;

public class FilterByArea implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getArea() - o2.getArea();
    }
}