import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> members = new ArrayList<>();

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player + " is already in team " + this.getName());
            return false;
        } else {
            members.add(player);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

}
