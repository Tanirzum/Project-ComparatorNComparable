import java.util.Comparator;

public class FilterByAge implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getAgeOfConstruction() - o2.getAgeOfConstruction();
    }
}