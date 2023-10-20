package Car;
import java.util.Scanner;

public class CarsData {
    public static final String TANISHTIRUV = "Online mashina bozorimizga xush kelibsiz!";

    public static final String TANISHTIRUV_RU = "Добро пожаловать на наш интернет-авторынок!";

    public static class Main{
        static String email = "123456@gmail.com";

        static int password = 12345;

        static char language = 'u';
        public static void main(String args[]){
            while(true){
                System.out.println("""
                        Выберите Язык
                        1.UZB
                        2.RUS
                        """);
                int chooseLan = (new Scanner(System.in).nextInt());
                if (chooseLan == 1){
                    language = 'u';
                }else if (chooseLan == 2 ) {
                    language = 'r';
                }else System.err.println("404");

                System.out.println(language == 'u' ? TANISHTIRUV : TANISHTIRUV_RU);
            }
        }
    }
}
