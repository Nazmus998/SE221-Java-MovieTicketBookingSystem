public class BookTicket extends Movie_List{
    CancelTicket cancelTicket = new CancelTicket();
    Payment payment = new Payment();
    int total=0;
    String name="";
    String id="";
    String mn="";
    
    String email="";
    String pm="";
    @Override
    void view() {
       // super.view();
        System.out.println("Choose a Moviename: ");
        this.mn= scanner.nextLine();
        System.out.println("Enter Your Name: ");
        this.name= scanner.nextLine();
        System.out.println("Enter Your Student ID: ");
        this.id= scanner.nextLine();
        System.out.println("Enter Your Student Email: ");
        this.email= scanner.nextLine();
        System.out.println("How Many Seats You Want: ");
        int wn=scanner.nextInt();
        System.out.println("One Ticket is "+400);
        System.out.println("Total Due = "+400*wn);
        
        System.out.println("Payment Method:\n");
        System.out.println("\t\t1.Bkash.\n\t\t2.Nagad\n\t\t3.Card\n");
        System.out.println("Enter Payment Method: ");
        this.pm=scanner.next();
        
        payment.setAmouont(wn);
        
        System.out.println("Press 1 To Proceed 0 to Cancel");
        int ch1=scanner.nextInt();
        if(ch1==1){
        	
            System.out.println("Name: "+name);
            System.out.println("Student ID: "+id);
            System.out.println("Ticket: "+wn);
            total= payment.getAmouont();
            System.out.println("Total: "+total);
            
            while (true) {
            	
            	System.out.println("Payment Method : "+pm);
                System.out.println("Enter The Otp: ");
                int otp = scanner.nextInt();
                if (otp == payment.getOtp()) {
                    System.out.println("Booking Complete");
                    System.out.println("\t\t\t***The copy of ticket/tickets send to your  "+email+".***\t\t\t");
                    
                    break;
                } else System.out.println("Wrong Otp");
            }
        }
        else return;
    }
    void callCancel(){
        cancelTicket.cancel(name,total);
    }
}
