import javax.naming.spi.NamingManager;
import java.util.*;

public class Bus_Structure {
    Scanner scanner = new Scanner(System.in);
    String distance;
    Map<Integer,String> select_seat = new HashMap<>();
    ArrayList<String> storeData = new ArrayList<>();
    ArrayList<String> add_city = new ArrayList<>();
    void AddRoute(){
        add_city.add("Lahore");
        add_city.add("Karachi");
        add_city.add("Islamabad");
        add_city.add("Faisalabad");
        add_city.add("Peshawar");
        add_city.add("Mary");
        add_city.add("HaroonBad");
        add_city.add("Bahawalpur");
        add_city.add("Multan");
        add_city.add("Lahore");
    }
    void BusList(){
        System.out.println("Note: Each Bus Seat strength 1 to 30 \n if you enter the name of any other city other than these cities, it will not be counted.");
        System.out.println("Available Buses:");
        System.out.println("Lahore To Karachi");
        System.out.println("Islamabad To Faisalabad");
        System.out.println("Peshawar To Mary");
        System.out.println("HaroonBad To Bahawalpur");
        System.out.println("Multan To Lahore");
        System.out.println("....");

    }
    void Book_A_Seat( int seat_no ,String Name, String Seat_book_city_Name){
        String C_Letter = Name.toUpperCase();
        String C_letter = Seat_book_city_Name.toUpperCase();
        boolean check_Entery = check(seat_no,Seat_book_city_Name);
        String check = select_seat.get(seat_no);
        if (check == null || check_Entery){
            boolean isCheck = false;
            for (String s : add_city) {
                if (s.equalsIgnoreCase(Seat_book_city_Name)) {
                    isCheck = true;
                    break;
                }
            }
            if ((seat_no>0 && seat_no<31) && (!Name.isEmpty() && isCheck)){
                select_seat.put(seat_no,Name);
                String store_value = "Seat NO: " + seat_no + " , Name: " + C_Letter + " , City Name: " + C_letter;
                storeData.add(store_value);
                System.out.println("your Seat booked from the " + Seat_book_city_Name + " City.");
            } else {
                System.out.println("Invalid Seat Number and Name and City_Name");
            }

        }else {
            System.out.println("Seat is already Book Enter Another Seat");
        }
    }


    void cancel_seat(String Seat_Number,String City_Name){
        String c_letter = City_Name.toUpperCase();
        int convert = Integer.parseInt(Seat_Number);
        Iterator<String> itr = storeData.iterator();
        while (itr.hasNext()){
            String temp = itr.next();
            if(temp.contains("Seat NO: " + Seat_Number) && temp.contains(" , City Name: " + c_letter)){
                itr.remove();
            }

        }

    }


    void display(){
       if(!storeData.isEmpty()){
           System.out.println();
           System.out.println("Total booking...");
           for (var s: storeData){
               System.out.println(s);
           }
       }else {
           System.out.println("Your List is Empty");
       }
    }
    boolean  check(int SN,String City_Name){
        String c_letter = City_Name.toUpperCase();
        boolean isCheck = true;
        for (var s : storeData) {
            if (s.contains("Seat NO: " + SN) && s.contains(" , City Name: " + c_letter)){
                isCheck = false;
            }
        }
        return isCheck;
    }

    void Find_Seat_No(int seat_no , String Name){
            String re_name = Name.toUpperCase();
            boolean isCheck = true;
            for(var s: storeData){
                if (s.contains("Seat NO: " + seat_no) && s.contains(" , Name: " + re_name)){
                    System.out.println("Seat is Available: ");
                    System.out.println(s);
                    isCheck = false;
                }
            }
            if (isCheck){
                System.out.println("Seat not Available....");
            }

    }
}
