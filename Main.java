import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie_List movie_list = new Movie_List();
        BookTicket seat_book = new BookTicket();
        Admin ad = new Admin();
        CancelTicket cancelTicket = new CancelTicket();
      
        while (true){
        	System.out.println("\n\n\n\n\t\t\t\t WELCOME TO THE DAFFODIL CINEPLEX \t\t\t\t");
            System.out.println("\n\n\t\t1.View Movie List");
            System.out.println("\t\t2.Book Tickets");
            System.out.println("\t\t3.Cancel Booking");
            System.out.println("\t\t4.Admin");
            System.out.println("\t\t5.Exit");
            int ch=scanner.nextInt();
            switch (ch){
                case 1: movie_list.view();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 2: seat_book.view();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 3: seat_book.callCancel();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        break;
                case 4: System.out.println("Enter Password : ");
                	    int n = scanner.nextInt();
                        if(n==22135998)
                        {
                	    ad.acc();
                        System.out.println("Enter 1 to continue: ");
                        scanner.next();
                        }
                        break;
                case 5: 
                	System.out.println("\t\t\t\t\t***SEE YOU SOON***\t\t\t");
                	return;
            }
        }
    }
}
