import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        Integer annasOmission = bill.get(k);
        Integer annasBill = (bill.stream().reduce(Integer::sum).get() - annasOmission) / 2;
        System.out.println((annasBill == b) ? "Bon Appetit" : b - annasBill);
    }

    public static void main(String[] args) {

    }
}

