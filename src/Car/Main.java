package Car;
import static Car.CarsData.*;
import java.util.Scanner;

public class Main {

    String email = "123456@gmail.com";
    static int password = 12345;
    static char language = 'e';
    public static void main(String args[]){
//        int user = (new Scanner(System.in).nextInt());
//        switch (user){
//            case 1:
//                registration();
//                break;
//            case 2:
//                logination();
//                break;
//            default:
//        }
//        try {
//            Object obj = parser.parse(new FileReader("D:\\JAVA-projects\\Lesson\\carShop\\src\\Car\\db.json"));
//            JSONObject jsonObject = (JSONObject)obj;
//            String name = (String)jsonObject.get("Name");
//            String course = (String)jsonObject.get("Course");
//            JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
//            System.out.println("Name: " + name);
//            System.out.println("Course: " + course);
//            System.out.println("Subjects:");
//            Iterator iterator = subjects.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }

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
            System.out.println(language == 'u' ? PASSWORD_UZ: PASSWORD_EN);
            int correctPassword = (new Scanner(System.in).nextInt());
            if (correctPassword == password){
                boolean exit = true;
                while(exit){
                    categoryMenu();
                    int menu = (new Scanner(System.in).nextInt());
                    switch (menu){
                        case 1:
                            category();
                            int a = (new Scanner(System.in).nextInt());
                            if (a == 1){
                                System.out.println(CARS_MODEL_SEDAN);
                                break;
                            }else if(a == 2){
                                System.out.println(CARS_MODEL_CROSS_TURISMO);
                                break;
                            } else if (a == 3) {
                                System.out.println(CARS_MODEL_SPORT_TURISMO);
                                break;
                            }

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
        System.out.println("""
                1. EN
                2. UZ
                """);
        int changeLanguage = (new Scanner(System.in).nextInt());
        if (changeLanguage == 1){
            language = 'e';
        }else language = 'u';
    }

    private static void aboutUs() {
        System.out.println(language == 'e' ? ABOUT_US_UZ : ABOUT_US_EN);
    }

    private static void settings() {

    }

    private static void category() {
        System.out.println(language == 'e' ? CATEGORY : CATEGORY);
    }

    private static void categoryMenu() {
        System.out.println(language == 'e' ? MAIN_MENU_EN : MAIN_MENU_UZ);
    }
}
