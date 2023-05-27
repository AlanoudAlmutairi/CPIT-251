
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
    
    
        public void add_event(ArrayList<event> event , int index ){
        System.out.println("Enter event name: ");
        String event_name= input.next(); 
        System.out.println("Enter event time: ");
        int event_time= input.nextInt();
        System.out.println("Enter event code: ");
        int event_code= input.nextInt();
        System.out.println("Enter event place: ");
        String event_place=input.next();
        System.out.println("Enter event duration: ");
        int event_duration = input.nextInt();
        System.out.println("Enter volunteer role: ");
        String volunteer_role= input.next();
        System.out.println("Enter number of volunteer: ");
        int number_of_volunteer = input.nextInt();
        System.out.println("Enter event services: ");
        String event_services = input.next();
        event ee= new event (event_name,  event_time,  event_code, event_place,  event_duration,  volunteer_role,  number_of_volunteer,  event_services );
        event.add(ee);
        index++;    
    }
    
    public void delete_event(ArrayList<event> event,int eventCode ){
     int pointer2delet =  search(event ,  eventCode );
        if (pointer2delet == -1 ){
                System.out.println("This "+eventCode +" doesn't exists");
        }
        else{
                event.get(pointer2delet).setEvent_code(0);
                event.get(pointer2delet).setEvent_duration(0);
                event.get(pointer2delet).setEvent_name(null);
                event.get(pointer2delet).setEvent_place(null);
                event.get(pointer2delet).setEvent_services(null);
                event.get(pointer2delet).setEvent_time(0);
                event.get(pointer2delet).setNumber_of_volunteer(0);
                event.get(pointer2delet).setVolunteer_role(null);
                System.out.println("Deleted successfully");
        }
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
