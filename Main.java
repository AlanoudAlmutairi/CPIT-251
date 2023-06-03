
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList <Advertisement> Adv =new ArrayList<> ();
    static ArrayList <event> event =new ArrayList<> ();
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       int eventCounter = 0 ;
       int advCounter = 0 ;
      
   
       char Role ;
         
       do {
          System.out.println("Enter [A] if you are an Admin\nEnter "
                + "[V] if you are a Volunteer\nEnter [P] if you are an Event Provider:");
             Role = input.next().charAt(0);
           switch (Role) {
               case 'a':
               case 'A':
                   Admin admin = new Admin ();
                   Admin(admin,Adv,advCounter, input);
                   break;
               case 'v':
               case 'V':
                   volunteer volun = new volunteer ();
                   volunteer(volun,Adv,advCounter, input);
                   break;
               case 'p':
               case 'P':
                   eventProvider event_provider = new eventProvider();
                   Provider( event_provider ,  event,  eventCounter, input );
                   break;
               case 'e' :
                   break;
           }
  
      }while(Role!='e');   
    } 
    
    
    public static void Admin(Admin a1 , Scanner input){
           String adv;
        char service = 'a';
        do {
         System.out.println("Enter a for Add , Enter d for Delete , q for quit");
         service = input.next().charAt(0);
        if (service == 'a'){
            adv = a1.add_advertisements(Adv,advCounter);
            System.out.println(adv);
            System.out.println(" event_specifications: " + Adv.get(advCounter).Getevent_specifications()
                + " Advertisement_code: "+Adv.get(advCounter).GetAdvertisement_code() + " Advertisement_scope: " 
                + Adv.get(advCounter).GetAdvertisement_scope());
        }
        else if (service== 'd'){
            System.out.println("enter the code of add");
            String s = input.next();
            a1.delet_addvertisements(Adv,s);
            
        }
        }while(service != 'q');
                  
    }
     
    
    public static void volunteer(volunteer volun, ArrayList<Advertisement> Adv, int advCounter, Scanner input) {
         String adv;
         String adv1;
 
        char service = 'r';
        do {
             System.out.println("Enter r for reges , Enter d for Delete , q for quit");
             service = input.next().charAt(0);
             if (service == 'r')
             show_advertisements(Adv);
         }while(service != 'q');
    }   
        
    public static void Provider(eventProvider p , ArrayList<event> event, int index, Scanner input ){
        
        System.out.println("Enter a for Add , Enter d for Delet");
        char service = input.next().charAt(0);
                    if(service== 'a'){
                         p.add_event(event, index);
                         System.out.println("Succeefully added!!");
                         System.out.println("event_name:"+ event.get(index).event_name +" event_time: "+ event.get(index).event_time +
                            " event_code: "+ event.get(index).event_code+"event_place: " + event.get(index).event_place+  
                            "event_duration: "+ event.get(index).event_duration+ " volunteer_role: "+ event.get(index).volunteer_role+
                            " number_of_volunteer : "+ event.get(index).number_of_volunteer+  " event_services: "+ event.get(index).event_services );
                    }
                    else if (service=='d'){
                          p.delete_event(event, event.get(index).getEvent_code());
                            System.out.println("event_name:"+ event.get(index).event_name +" event_time: "+ event.get(index).event_time +
                            " event_code: "+ event.get(index).event_code+"event_place: " + event.get(index).event_place+  
                            "event_duration: "+ event.get(index).event_duration+ " volunteer_role: "+ event.get(index).volunteer_role+
                            " number_of_volunteer : "+ event.get(index).number_of_volunteer+  " event_services: "+ event.get(index).event_services );
  
      
                    }
    }            
             
            
      
        }while(service != 'q');
                  
    }
    
   public static void show_advertisements (ArrayList<Advertisement> Advertisments){
            System.out.println("List of Advertisments: ");
            for(int i=0; j<advertisments.size(); i++)
                System.out.println(Advertisments.get(i).toString());
            
   }
    
}
