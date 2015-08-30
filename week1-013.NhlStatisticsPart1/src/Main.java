
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println(""); //blank line
        
        System.out.println("Top 25 penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        
        System.out.println("Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        
        System.out.println("Philadelphia Flyers by points");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("");
        
        System.out.println("Anaheim Ducks by points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        System.out.println("");
    }
}
