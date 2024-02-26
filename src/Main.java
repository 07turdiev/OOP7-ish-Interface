import Convertatsiya.Ugirish;
import Sport.Goalkeeper;
import Sport.PointGuard;
import Sport.Setter;

public class Main {
    public static void main(String[] args) {
        Goalkeeper fudbol = new Goalkeeper("Ignatiy Nesterov", "Fudbol", 14, "Uzbekstan", 1, 2,3,5);

        System.out.println("Malumot: " + fudbol.getInfo());
        System.out.println("O'yinchi nomi: " + fudbol.getNameOfPlayer());
        System.out.println("Sport turi: " + fudbol.getSportType());
        System.out.println("O'yinchi raqami: " + fudbol.getNumberPosition());
        System.out.println("Jamoa nomi: " + fudbol.getTeamName());
        System.out.println("Qizil kartchka soni: " + fudbol.getCountOfRedCard());
        System.out.println("Sariq kartchka soni: " + fudbol.getCountOfYellowCard());
        System.out.println("Gollar Soni: " + fudbol.getCountOfGoals());
        System.out.println("Saqlashlar soni: " + fudbol.countOfSaves);
        System.out.println();

        Setter voleybol = new Setter("Gulnoza Rahimova", "Voleybol", 23, "Uzbekistan", 10, 8);

        System.out.println("Malumot: " + voleybol.getInfo());
        System.out.println("O'yinchi nomi: " + voleybol.getNameOfPlayer());
        System.out.println("Sport turi: " + voleybol.getSportType());
        System.out.println("O'yinchi raqami: " + voleybol.getNumberPosition());
        System.out.println("Jamoa nomi: " + voleybol.getTeamName());
        System.out.println("Pointlar soni: " + voleybol.getNumberOfPoints());
        System.out.println("Setlar soni: " + voleybol.countOfSets);
        System.out.println();

        PointGuard basktbol = new PointGuard("Salimova", "Basketbol", 3, "Uzbekistan", 10, 8);
        System.out.println("Malumot: " + basktbol.getInfo());
        System.out.println("O'yinchi nomi: " + basktbol.getNameOfPlayer());
        System.out.println("Sport turi: " + basktbol.getSportType());
        System.out.println("O'yinchi raqami: " + basktbol.getNumberPosition());
        System.out.println("Jamoa nomi: " + basktbol.getTeamName());
        System.out.println("Gollar soni: " + basktbol.getNumberOfGoals());
        System.out.println("Guardlar soni: " + basktbol.countOGuard);
        System.out.println();

        Ugirish ugirish = new Ugirish();

        ugirish.selsiyKelvin();
        System.out.println();
        ugirish.selsiyFarengeyt();
    }
}
