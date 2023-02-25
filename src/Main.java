import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     Wine wine1 = new Wine("LUC PIRLET","PAYC D'OC ","France", LocalDate.of(2022,5,15));
     Wine wine2 = new Wine("Vin De France","Les 4's amis","France", LocalDate.of(2022,11,7));
     Wine wine3 = new Wine("Molise","Wun Saka","Italy", LocalDate.of(2021,10,24));
     Wine wine4 = new Wine("Lazio","Tonsane","Italy", LocalDate.of(2023,1,1));

     Wine[] wines = new Wine[5];

     Vinodel vinodel = new Vinodel("Вино куйуп берет",3,"Менделеева119",wines);
        System.out.println(vinodel);
        wines[0] = wine1;
        wines[1] =wine2;
        wines[2] =wine3;
        wines[3] = wine4;
        wines[4] = vinodel.addWine(wines);
        System.out.println(vinodel);

        for (Wine a: wines) {
            System.out.println(a);
        }
    }
}