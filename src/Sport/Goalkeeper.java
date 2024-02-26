package Sport;

public class Goalkeeper extends FootballPlayer {
    public int countOfSaves;


    public Goalkeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        this.setNameOfPlayer(nameOfPlayer);
        this.setSportType(sportType);
        this.setNumberPosition(numberPosition);
        this.setTeamName(teamName);
        this.setCountOfRedCard(countOfRedCard);
        this.setCountOfYellowCard(countOfYellowCard);
        this.setCountOfGoals(countOfGoals);
        this.countOfSaves = countOfSaves;
    }
}
