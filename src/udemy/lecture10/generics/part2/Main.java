package udemy.lecture10.generics.part2;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> shakhtar = new Team<>("Shakhtar");
        shakhtar.addPlayer(joe);
//        shakhtar.addPlayer(pat);
//        shakhtar.addPlayer(beckham);

        System.out.println(shakhtar.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> bayern = new Team<>("Bayern");
        Team<FootballPlayer> dortmund = new Team<>("Dortmund");

        dortmund.matchResult(bayern, 3, 1);
        dortmund.matchResult(shakhtar, 1, 0);
        shakhtar.matchResult(bayern, 5, 4);

        RankingTable<Team<FootballPlayer>> rankingTable = new RankingTable<>();
        rankingTable.addTeam(shakhtar);
        rankingTable.addTeam(dortmund);
        rankingTable.addTeam(bayern);
        rankingTable.print();
    }
}
