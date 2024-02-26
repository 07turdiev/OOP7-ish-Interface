package Sport;

public class FootballPlayer extends Player {
    private int countOfRedCard;
    private int countOfYellowCard;
    private int countOfGoals;


    public void setCountOfRedCard(int countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }


    public int getCountOfRedCard() {
        return countOfRedCard;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }
}
