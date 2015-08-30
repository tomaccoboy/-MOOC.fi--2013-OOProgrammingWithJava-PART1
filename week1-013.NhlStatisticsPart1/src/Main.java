
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
    }
}
