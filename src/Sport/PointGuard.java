package Sport;

import Sport.BasketballPlayer;

public class PointGuard extends BasketballPlayer {
    public int countOGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        this.setNameOfPlayer(nameOfPlayer);
        this.setSportType(sportType);
        this.setNumberPosition(numberPosition);
        this.setTeamName(teamName);
        this.setNumberOfGoals(numberOfGoals);
        this.countOGuard = countOfGuard;
    }
}
