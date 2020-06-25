package udemy.lecture10.generics.part2;

import java.util.ArrayList;

public class RankingTable<T extends Team<?>> {
    private ArrayList<T> teams;

    public RankingTable() {
        teams = new ArrayList<>();
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void addTeam(T team) {
        if (!teams.contains(team) && team != null) {
            teams.add(team);
        } else {
            System.out.println("Cannot add. Wrong parameter or the team is already on the list.");
        }
    }

    public void print() {
        if (!teams.isEmpty()) {
            teams.sort((team1, team2) -> team2.ranking() - team1.ranking());

            for (int i = 0; i < teams.size(); i++) {
                System.out.println((i + 1) + ". " + teams.get(i).getName() + ": " + teams.get(i).ranking());
            }
        }
    }
}
