package Car;
import static Car.CarsData.*;
import java.util.Scanner;

public class Main {
    public static boolean exit;
    public static Scanner scan = new Scanner(System.in);
    static final String[] emailed = {"abdulboriy@gmail.com", "amirxan@gmail.com", "ahadulloh@gmail.com"};
    static final String[] password = {"abdukar1m0v", "amir2233", "701sdy"};
    static char language = 'e';
    public static void main(String args[]) {
        while (true) {
            System.out.println("""
                    1.UZB
                    2.EN
                    """);
            int chooseLan = (new Scanner(System.in).nextInt());
            if (chooseLan == 1) {
                language = 'u';
            } else if (chooseLan == 2) {
                language = 'e';
            } else System.err.println("");

            System.out.println(language == 'e' ? EMAIL_EN : EMAIL_UZ);
            String loginright = scan.nextLine();
            System.out.println(language == 'e' ? PASSWORD_EN : PASSWORD_UZ);
            String paswordright = scan.nextLine();
            boolean axa = false;
            for (int i = 0; i < loginright.length(); i++) {
                if (loginright.equals(emailed[i]) && paswordright.equals(password[i])) {
                    axa = true;
                    exit = true;
                    while (exit) {
                        categoryMenu();
                        int menu = (new Scanner(System.in).nextInt());
                        switch (menu) {
                            case 1:
                                category();
                                int a = (new Scanner(System.in).nextInt());
                                if (a == 1) {
                                    System.out.println(CARS_MODEL_SEDAN);
                                    int taycan = scan.nextInt();
                                    if (taycan == 1){
                                        System.out.println(Taycan);
                                        int one = scan.nextInt();
                                        if (one == 0){
                                            exit = true;
                                        }
                                    } else if (taycan == 2) {
                                        System.out.println(TAYCANFOURS);
                                        int two = scan.nextInt();
                                        if (two == 0){
                                            exit = true;
                                        }
                                    } else if (taycan == 3) {
                                        System.out.println(TAYCANGTS);
                                        int three = scan.nextInt();
                                        if (three == 0){
                                            exit = true;
                                        }
                                    } else if (taycan == 4) {
                                        System.out.println(TAYCANTURBOS);
                                        int four = scan.nextInt();
                                        if (four == 0){
                                            exit = true;
                                        }
                                    }
                                    break;
                                } else if (a == 2) {
                                    System.out.println(CARS_MODEL_CROSS_TURISMO);
                                    int cross = scan.nextInt();
                                    if (cross == 1){
                                        System.out.println(TAYCANFOURCROSSTURISMO);
                                        int five = scan.nextInt();
                                        if (five == 0){
                                            exit = true;
                                        }
                                    } else if (cross == 2) {
                                        System.out.println(TAYCANFORSCROSSTURISMO);
                                        int six = scan.nextInt();
                                        if (six == 0){
                                            exit = true;
                                        }
                                    } else if (cross == 3) {
                                        System.out.println(TAYCANTURBOCROSSTURISMO);
                                        int seven = scan.nextInt();
                                        if (seven == 0){
                                            exit = true;
                                        }
                                    } else if (cross == 4) {
                                        System.out.println(TAYCANTURBOSCROSSTURISMO);
                                        int eight = scan.nextInt();
                                        if (eight == 0){
                                            exit = true;
                                        }
                                    }
                                    break;
                                } else if (a == 3) {
                                    System.out.println(CARS_MODEL_SPORT_TURISMO);
                                    int sport = scan.nextInt();
                                    if (sport == 1){
                                        System.out.println(TAYCANSPORTTURISMO);
                                        int nine = scan.nextInt();
                                        if (nine == 0){
                                            exit = true;
                                        }
                                    } else if (sport == 2) {
                                        System.out.println(TAYCANFOURSSPORTTURISMO);
                                        int ten = scan.nextInt();
                                        if (ten == 0){
                                            exit = true;
                                        }
                                    } else if (sport == 3) {
                                        System.out.println(TAYCANTURBOSPORTTURISMO);
                                        int eleven = scan.nextInt();
                                        if (eleven == 0){
                                            exit = true;
                                        }
                                    } else if (sport == 4) {
                                        System.out.println(TAYCANTURBOSPORTTURISM);
                                        int twelve = scan.nextInt();
                                        if (twelve == 0){
                                            exit = true;
                                        }
                                    } else if (sport == 5) {
                                        System.out.println(TAYCANTURBOSSPORTTURISMO);
                                        int thirteen = scan.nextInt();
                                        if (thirteen == 0){
                                            exit = true;
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 2:
                                aboutUs();
                                exit = false;
                                break;
                            case 3:
                                changeLanguage();
                                break;
                            case 4:
                                exit = false;
                                break;
                            default:
                        }
                    }
                } else if(exit == false) {
                    System.out.println("ERROR!");break;
                }   
            }
        }
    }

    private static void changeLanguage() {
        System.out.println("Ingliz tili kerak bolsa e yozing");
        System.out.println("If you want uzbek language write u");
        int changeLanguage = (new Scanner(System.in).nextInt());
        if (changeLanguage == 'e'){
            language = 'u';
        }else language = 'e';
        exit = true;
    }

    private static void aboutUs() {
        System.out.println(language == 'e' ? ABOUT_US_UZ : ABOUT_US_EN);
        int brow = scan.nextInt();
        if (brow == 0){
            exit = true;
        }
    }

    private static void category() {
        System.out.println(language == 'e' ? CATEGORY : CATEGORY);
    }

    private static void categoryMenu() {
        System.out.println(language == 'e' ? MAIN_MENU_EN : MAIN_MENU_UZ);
    }
}
