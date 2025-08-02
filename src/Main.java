import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus_Structure BS = new Bus_Structure();
        Scanner sc = new Scanner(System.in);
        BS.AddRoute();
        BS.BusList();
        System.out.println("\n");
        System.out.println("........");
        System.out.println("\n");
        System.out.println("Your App Feature");
        System.out.println("Press 1 for Book Seat...");
        System.out.println("Press 2 for Cancel Booking...");
        System.out.println("press 3 for Check Each Buss Status...");
        System.out.println("pres 4 for Exit....");
        System.out.println("\n");
        System.out.println("........");
        System.out.println("\n");
        System.out.print("Enter the Number: ");
        int store = sc.nextInt();
        switch (store){
            case 1:
                BS.Book_A_Seat(1,"Asrar","lahore");
                BS.Book_A_Seat(1,"Saqib","Karachi");
                BS.Book_A_Seat(1,"Aqib","Multan");
                break;
            case 2:
                BS.cancel_seat("1","lahore");
                break;
            case 3:
                BS.display();
                break;
            case 4:
                System.out.println("Thanks....");
                break;
            default:
                System.out.println("Invalid Number....");
        }

       BS.cancel_seat("1","lahore");
        BS.display();
    }
}

/*
 Features:
Show Available Buses (e.g., Bus 1: Lahore to Karachi)

Book a Seat (Choose seat number and passenger name)

Check Seat Status (Kis seat pe kon hai?)

Cancel Booking (By seat number or passenger name)

Exit Option
* */