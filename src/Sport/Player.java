package Sport;

import Sport.Information;

public class Player implements Information {

    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;
    private String teamName;


    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    @Override
    public String getInfo() {
        return "O'zbekiston terma jamoasi";
    }

    @Override
    public String getTeamName() {
        return teamName;
    }
}
