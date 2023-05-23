
public class event {
   private String event_name; 
   private int event_time;
   private int event_code;
   private String event_place;
   private int event_duration;
   private String volunteer_role;
   private int number_of_volunteer;
   private String event_services; 
   
   public event() {
    }

    public event(String event_name, int event_time, int event_code, String event_place, int event_duration, String volunteer_role, int number_of_volunteer, String event_services) {
        this.event_name = event_name;
        this.event_time = event_time;
        this.event_code = event_code;
        this.event_place = event_place;
        this.event_duration = event_duration;
        this.volunteer_role = volunteer_role;
        this.number_of_volunteer = number_of_volunteer;
        this.event_services = event_services;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getEvent_time() {
        return event_time;
    }

    public void setEvent_time(int event_time) {
        this.event_time = event_time;
    }

    public int getEvent_code() {
        return event_code;
    }

    public void setEvent_code(int event_code) {
        this.event_code = event_code;
    }

    public String getEvent_place() {
        return event_place;
    }

    public void setEvent_place(String event_place) {
        this.event_place = event_place;
    }

    public int getEvent_duration() {
        return event_duration;
    }

    public void setEvent_duration(int event_duration) {
        this.event_duration = event_duration;
    }

    public String getVolunteer_role() {
        return volunteer_role;
    }

    public void setVolunteer_role(String volunteer_role) {
        this.volunteer_role = volunteer_role;
    }

    public int getNumber_of_volunteer() {
        return number_of_volunteer;
    }

    public void setNumber_of_volunteer(int number_of_volunteer) {
        this.number_of_volunteer = number_of_volunteer;
    }

    public String getEvent_services() {
        return event_services;
    }

    public void setEvent_services(String event_services) {
        this.event_services = event_services;
    }

    @Override
    public String toString() {
        return "event{" + "event_name=" + event_name + ", event_time=" + event_time + ", event_code=" + event_code + ", event_place=" + event_place + ", event_duration=" + event_duration + ", volunteer_role=" + volunteer_role + ", number_of_volunteer=" + number_of_volunteer + ", event_services=" + event_services + '}';
    }
    
    

    
   
   
    
}
