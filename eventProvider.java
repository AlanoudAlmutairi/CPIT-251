
import java.util.Scanner;


public class eventProvider  {
    Scanner input = new Scanner(System.in);
    private String event_provider_name;
    private String event_provider_type;

    public eventProvider() {
    }

    
    public eventProvider(String event_provider_name, String event_provider_type) {
        this.event_provider_name = event_provider_name;
        this.event_provider_type = event_provider_type;
    }

    public String getEvent_provider_name() {
        return event_provider_name;
    }

    public void setEvent_provider_name(String event_provider_name) {
        this.event_provider_name = event_provider_name;
    }

    public String getEvent_provider_type() {
        return event_provider_type;
    }

    public void setEvent_provider_type(String event_provider_type) {
        this.event_provider_type = event_provider_type;
    }
    
    
    public void add_event(){
    String event_name= input.next(); 
    int event_time= input.nextInt();
    int event_code= input.nextInt();
    String event_place=input.next();
    int event_duration = input.nextInt();
    String volunteer_role= input.next();
    int number_of_volunteer = input.nextInt();
    String event_services = input.next();
    
    event newEvent = new event (event_name,  event_time,  event_code,  
      event_place,  event_duration,  volunteer_role,  number_of_volunteer,  event_services );
        
    }
    
    public void delete_event(){
           int num =  search(Events ,  eventCode );
        
                Events[num].setEvent_code(0);
                Events[num].setEvent_duration(0);
                Events[num].setEvent_name(null);
                Events[num].setEvent_place(null);
                Events[num].setEvent_services(null);
                Events[num].setEvent_time(0);
                Events[num].setNumber_of_volunteer(0);
                Events[num].setVolunteer_role(null);
               System.out.println("delet done");
            
        
    }
    
      public int search(event[]Events , int eventCode ){
       for(int index = 0 ; index < Events.length ; index++){
            if (eventCode==(Events[index].getEvent_code()) ){
                 //System.out.print("dearch done");
                return index ;
                
            }
       } 
     return -1;   
    }
    
    public void accept_volunteer(){
        
    }

    @Override
    public String toString() {
        return "eventProvider{" + "event_provider_name=" + event_provider_name + ", event_provider_type=" + event_provider_type + '}';
    }
    
    
    
}
