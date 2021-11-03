import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String day;
        String checkPest;
        String continueG;
        String isHappy;
        boolean LoopCont1 = true;
        boolean LoopCont2 = true;
        int numL;
        int numC;

        Garfield defaultG = new Garfield();
        while (LoopCont1) {
                System.out.println("");
                System.out.println("Welcome to the Garfield Simulator!");
                System.out.println("");
            while (LoopCont2) {                
                LoopCont1 = false;
                System.out.println("What day is it today?");
                day = scan.nextLine();
                defaultG.setday(day);
                System.out.println("");
                System.out.println("Do you have a pest in your home? (input yes or no)");
                checkPest = scan.nextLine();
                if (checkPest.equalsIgnoreCase("yes")) {
                    defaultG.setPest(true);
                    System.out.println("Is it a spider? (input yes or no)");
                    checkPest = scan.nextLine();
                    if (checkPest.equalsIgnoreCase("yes")) {
                        defaultG.setPestType("Spider");
                    } else {
                        defaultG.setPestType(checkPest);
                    }
                } else {
                    defaultG.setPest(false);
                }
                System.out.println("");
                System.out.println("How many plates of Lasagna did Garfield eat? (input number only)");
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number! Try again!");
                    scan.next();
                }
                numL = scan.nextInt();
                defaultG.setnumL(numL);
                System.out.println("");
                System.out.println("How many cups of coffee did Garfield drink? (input number only)");
                while (!scan.hasNextInt()) {
                    System.out.println("That's not a number! Try again!");
                    scan.next();
                }
                numC = scan.nextInt();
                defaultG.setnumC(numC);
                scan.nextLine();

                System.out.println("");
                System.out.println("So far your inputs are:");
                System.out.println("Today is " + day);
                if (defaultG.isPest()) {
                    System.out.println("There are pests");
                } else {
                    System.out.println("There are no pests");
                }
                System.out.println("Garfield ate " + numL + " plates of lasagna.");
                System.out.println("Garfield drank " + numC + " cups of coffee.");

                System.out.println("");
                System.out.println("Is this correct? (input yes or no)");
                System.out.println("<Entering anything other than yes or no will promt the questions again>");
                continueG = scan.nextLine();

                if (continueG.equalsIgnoreCase("yes")) {
                    LoopCont2 = false;
                } else {
                    LoopCont2 = true;
                }
            }
            System.out.println("");
            System.out.println("Calculating Garfield's behavior...");
 
            if (defaultG.checkHappy()) {
                isHappy = "Happy!";
            }else if(!defaultG.checkHappy() && defaultG.getday().equalsIgnoreCase("Monday") ){
                isHappy = "Not happy at all! It's Monday!";
            }
            else {
                isHappy = "Not too happy!";
            }
            //This just adds a delay to make it seem like my program is chugging on
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("");
            System.out.println("With your inputs, Garfield is feeling: ");
            System.out.println(isHappy);
            if (defaultG.isPest()) {
                System.out.println("");
                System.out.println("This is what Garfield says about the pests in your house:");
                defaultG.catchP(); 
            } else {
                System.out.println("");
                System.out.println("There are no pests in your house!");
            }
            System.out.println("");
            System.out.println("Would you like to try a different simulation? (input yes or no)");
            System.out.println("<Entering anything other than yes or no will terminate program>");
            continueG = scan.nextLine();
            if (continueG.equalsIgnoreCase("yes")) {
                LoopCont1 = true;
                LoopCont2 = true;
            } else {
                LoopCont1 = false;
                LoopCont2 = false;
            }
        }
        System.out.println("");
        System.out.println("Thank you for using the Garfield Simulator!");
    }
}
