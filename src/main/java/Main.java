import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer pat = new FootballPlayer("Pat");
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer mike = new FootballPlayer("Mike");
        FootballPlayer john = new FootballPlayer("John");

        BaseballPlayer sergiei = new BaseballPlayer("Sergiei");
        BaseballPlayer valery = new BaseballPlayer("Velery");
        BaseballPlayer sasha = new BaseballPlayer("Sasha");
        BaseballPlayer ivan = new BaseballPlayer("Ivan");

        Team<FootballPlayer> manchester = new Team<>("Manchester United");
        Team<FootballPlayer> barcelona = new Team<>("FC Barcelona");

        Team<BaseballPlayer> moscow = new Team<>("Moscow Destroyers");
        Team<BaseballPlayer> kazan = new Team<>("Kazan Annihilators");

        manchester.addPlayer(pat);
        manchester.addPlayer(joe);
        barcelona.addPlayer(mike);
        barcelona.addPlayer(john);

        moscow.addPlayer(sergiei);
        moscow.addPlayer(valery);
        kazan.addPlayer(sasha);
        kazan.addPlayer(ivan);
        kazan.addPlayer(ivan);




    }
}
