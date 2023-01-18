import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userChose;
        do {
            System.out.println(" Are you interested to : " + "\n"
                    + " creat an account press #1 " + "\n"
                    + " connect to an existing account press #2 " + " \n"
                    + " finish the program #3 ");

            Scanner scanner = new Scanner(System.in);
            userChose = scanner.nextInt();


        } while (userChose < 0 || userChose > 3);
        RealEstate realEstate1 = new RealEstate();

        if (userChose == 1) {
            realEstate1.createUser();

        } else if (userChose == 2) {
            realEstate1.Login();

        } else if (userChose == 3) {


        }


    }

}