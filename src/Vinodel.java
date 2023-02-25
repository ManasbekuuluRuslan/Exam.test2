import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Vinodel  implements HelpCenter{
    private String NeKylat;
    private int workExperience;
    private String workAddress;
    private Wine[] wines;

    public Vinodel(String neKylat, int workExperience, String workAddress, Wine[] wines) {
        NeKylat = neKylat;
        this.workExperience = workExperience;
        this.workAddress = workAddress;
        this.wines = wines;
    }


    public String getNeKylat() {
        return NeKylat;
    }

    public void setNeKylat(String neKylat) {
        NeKylat = neKylat;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines) {
        this.wines = wines;
    }

    @Override
    public String toString() {
        return "Vinodel{" +
                "NeKylat='" + NeKylat + '\'' +
                ", workExperience=" + workExperience +
                ", workAddress='" + workAddress + '\'' +
                ", wines=" + Arrays.toString(wines) +
                '}';
    }

    @Override
    public Wine addWine(Wine[] wines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name wino: ");
        String name= scanner.nextLine();
        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        System.out.println("made Of Country: ");
        String country = scanner.nextLine();
        System.out.println("made Of Year: ");
        LocalDate localDate = LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        Wine wine = new Wine(name, brand, country, localDate);
        return wine;
    }
}
