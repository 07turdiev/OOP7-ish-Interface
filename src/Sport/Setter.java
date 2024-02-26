package Sport;

public class Setter extends VolleyballPlayer{
    public int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
            this.setNameOfPlayer(nameOfPlayer);
            this.setSportType(sportType);
            this.setNumberPosition(numberPosition);
            this.setTeamName(teamName);
            this.setNumberOfPoints(numberOfPoints);
            this.countOfSets = countOfSets;
    }
}
