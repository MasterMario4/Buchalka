import java.util.ArrayList;

public class LeagueTable<T extends Team> {
    ArrayList<T> teams;

//    public boolean addTeam()

    public boolean getTeams() {
        if (teams.isEmpty() || teams == null) {
            System.out.println("No teams added to the league!");
            return false;
        } else {
            for (Team t : teams) {
                System.out.println(t.getName());
            }
            return true;
        }
    }


}
