
package rechargecard;
import java.util.Random;
import java.util.Scanner;
public class RechargeCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Random randomNumnbers = new Random();
        
        System.out.println("Welcome To Jason Airtime Vending Machine!!\n");
        
        int decision = 0;
        long phoneNoo = 99999999999L;
        long phoneNo = 00000000000L;
       
        while (decision != 2){
              
            if (decision == 1)
            {
            System.out.print("Enter User Phone Number:\n* ");
            long phoneNumber = input.nextLong();
            if ( phoneNumber >= phoneNo && (phoneNumber <= phoneNoo)){

            System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                    "Which Network do you want to Buy:",
                    "> Press 1 for MTN",
                    "> Press 2 for GLO",
                    "> Press 3 for Airtel",
                    "> Press 4 for 9Mobile");
            int network = input.nextInt();

            OUTER:
            switch (network)
            {
                case 1:
                    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                            "How much worth of Airtime do you want to Buy:",
                            "> Press 1 for $100",
                            "> Press 2 for $200",
                            "> Press 3 for $500",
                            "> Press 4 for $750");
                    int mtnAmount = input.nextInt();

                    switch (mtnAmount)
                    {
                        case 1:
                            System.out.println("Your Purchase of $100 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 11; cardPin++)
                    {
                        int mtn = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", mtn  );

                    }
                    break OUTER;
                        case 2:
                            System.out.println("Your Purchase of $200 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 14; cardPin++)
                    {
                        int mtn = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", mtn  );

                    }
                    break OUTER;
                        case 3:
                             System.out.println("Your Purchase of $500 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int mtn = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", mtn  );

                    }
                    break OUTER;
                        case 4:
                             System.out.println("Your Purchase of $750 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int mtn = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", mtn  );

                    }
                    break OUTER;
            }
                case 2:
                    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                            "How much worth of Airtime do you want to Buy:",
                            "> Press 1 for $100",
                            "> Press 2 for $200",
                            "> Press 3 for $500",
                            "> Press 4 for $750");
                    int gloAmount = input.nextInt();

                    switch (gloAmount)
                    {
                        case 1:
                            System.out.println("Your Purchase of $100 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 11; cardPin++)
                    {
                        int glo = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", glo  );

                    }
                    break OUTER;

                        case 2:
                            System.out.println("Your Purchase of $200 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 14; cardPin++)
                    {
                        int glo = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", glo  );

                    }
                    break OUTER;

                        case 3:
                            System.out.println("Your Purchase of $500 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int glo = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", glo  );

                    }
                    break OUTER;

                        case 4:
                            System.out.println("Your Purchase of $750 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int glo = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", glo  );

                    }
                    break OUTER;
                    }

                case 3:
                    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                            "How much worth of Airtime do you want to Buy:",
                            "> Press 1 for $100",
                            "> Press 2 for $200",
                            "> Press 3 for $500",
                            "> Press 4 for $750");

                    int airtelAmount = input.nextInt();

                    switch (airtelAmount)
                    {
                        case 1:
                            System.out.println("Your Purchase of $100 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 11; cardPin++)
                    {
                        int airtel = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", airtel  );

                    }
                    break OUTER;

                        case 2:
                            System.out.println("Your Purchase of $200 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 14; cardPin++)
                    {
                        int airtel = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", airtel  );

                    }
                    break OUTER;

                        case 3:
                            System.out.println("Your Purchase of $500 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int airtel = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", airtel  );

                    }
                    break OUTER;

                        case 4:
                            System.out.println("Your Purchase of $750 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int airtel = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", airtel  );

                    }
                    break OUTER;

                    }

                case 4:
                    System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                            "How much worth of Airtime do you want to Buy:",
                            "> Press 1 for $100",
                            "> Press 2 for $200",
                            "> Press 3 for $500",
                            "> Press 4 for $750");

                    int etiAmount = input.nextInt();

                    switch (etiAmount)
                    {
                        case 1:
                            System.out.println("Your Purchase of $100 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 11; cardPin++)
                    {
                        int eti = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", eti  );

                    }
                    break OUTER;

                        case 2:
                            System.out.println("Your Purchase of $200 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 14; cardPin++)
                    {
                        int eti = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", eti  );

                    }
                    break OUTER;

                        case 3:
                            System.out.println("Your Purchase of $500 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int eti = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", eti  );

                    }
                    break OUTER;

                        case 4:
                            System.out.println("Your Purchase of $750 worth of Airtime to this Number "
                                + phoneNumber + " is Successful\nYour Scratch Pin is: ");

                    for (int cardPin = 1; cardPin <= 16; cardPin++)
                    {
                        int eti = randomNumnbers.nextInt(9);

                        System.out.printf("%d ", eti  );

                    }
                    break OUTER;

                    }

                default:
                    System.out.println("Please Choose a Valid number from the Option");
                    //break;

        }

            System.out.println("\n\nThank you for Choosing Us...\n       From Jason Airtime "
                    + "Vending Machine.");
            }
            else 
                    System.out.println("Invalid Number...\nPlease Enter your 11 "
                            + "digit Numner.");
          }
            
            System.out.printf("\n%s\n%s\n",
                    "> Press 1 to Start",
                    "> Press 2 to Exit");
            decision = input.nextInt(); 
            
        }
}
}