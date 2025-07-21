import java.util.Scanner;

public class Menu {
    //TO DO
    private Scanner sc = new Scanner(System.in);

    private void options(){
        System.out.println("Welcome to Memory journal!");
        System.out.println("\tSelect a option: ");
        System.out.println("1 - Register \t 2 - Login \t 3 - Quit");
    }

    private int readOpt(){
        try{
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }

    }
    public void showUp(){
        int opt;

        do {
            options();
            opt = readOpt();

            switch (opt){
                case 1:
                    System.out.println("test1");
                    break;
                case 2:
                    System.out.println("test2");
                    break;
                case 3:
                    System.out.println("Shutting down...");
                    break;
            }
        }while (opt != 3);
    }
}
