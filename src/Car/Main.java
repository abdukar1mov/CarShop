package Car;
import static Car.CarsData.*;
import java.util.Scanner;

public class Main {
    static String email = "123456@gmail.com";
    static int password = 12345;

    static char language = 'e';
    public static void main(String args[]){
        int user = (new Scanner(System.in).nextInt());
        switch (user){
            case 1:
                registration();
                break;
            case 2:
                logination();
                break;
            default:
        }
        while(true){
            System.out.println("""
                        
                        1.UZB
                        2.EN
                        """);
            int chooseLan = (new Scanner(System.in).nextInt());
            if (chooseLan == 1){
                language = 'u';
            }else if (chooseLan == 2 ) {
                language = 'e';
            }else System.err.println("404");

            System.out.println(language == 'u' ? TANISHTIRUV : TANISHTIRUV_EN);
            System.out.println(language == 'u' ? EMAIL_UZ : EMAIL_EN);
            String email  = (new Scanner(System.in).next());

            int correctPassword = (new Scanner(System.in).nextInt());
            if (correctPassword == password){
                boolean exit = true;
                while(exit){
                    categoryMenu();
                    int menu = (new Scanner(System.in).nextInt());
                    switch (menu){
                        case 1:
                            category();
                            break;
                        case 2:
                            settings();
                            break;
                        case 3:
                            aboutUs();
                            break;
                        case 4:
                            changeLanguage();
                            break;
                        case 5:
                            exit = false;
                            break;
                        default:
                    }
                }
            }else {
                System.out.println("Incorrect password");
            }
        }
    }

    private static void logination() {
        System.out.println(language == 'e' ? EMAIL_EN : EMAIL_UZ);
        String email = (new Scanner(System.in).nextLine());
        
        System.out.println(language == 'e' ? PASSWORD_EN : PASSWORD_UZ);
        String password = (new Scanner(System.in).nextLine());

    }

    private static void registration() {
    }

    private static void changeLanguage() {
        System.out.println("Change lan");
    }

    private static void aboutUs() {
        System.out.println("About us");
    }

    private static void settings() {
        System.out.println("Setting");
    }

    private static void category() {
        System.out.println("Categor");
    }

    private static void categoryMenu() {
        System.out.println(language == 'e' ? MAIN_MENU_EN : MAIN_MENU_UZ);
    }
}
