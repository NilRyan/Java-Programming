
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner content = new Scanner(Paths.get(fileName))) {
            Team statistic = new Team(team);

            while (content.hasNextLine()) {
                String line = content.nextLine();
                String[] data = line.split(",");
                String team1 = data[0];
                int scoreTeam1 = Integer.valueOf(data[2]);
                String team2 = data[1];
                int scoreTeam2 = Integer.valueOf(data[3]);

                if (team.equals(team1) && scoreTeam1 > scoreTeam2) {
                    statistic.addWins();
                }

                if (team.equals(team2) && scoreTeam2 > scoreTeam1) {
                    statistic.addWins();
                }

                if (team.equals(team1) && scoreTeam1 < scoreTeam2) {
                    statistic.addLosses();
                }

                if (team.equals(team2) && scoreTeam2 < scoreTeam1) {
                    statistic.addLosses();
                }
            }

            System.out.println("Games: " + statistic.getGamesPlayed());
            System.out.println("Wins: " + statistic.getWins());
            System.out.println("Losses: " + statistic.getLosses());

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }

}
