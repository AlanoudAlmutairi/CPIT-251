
public class volunteer {

    private String volunteer_charactaristics;
    private int experience_period;
    private String volunteer_role;
    private String participatoin_record;

    public volunteer() {
    }
    
    public volunteer(String volunteer_charactaristics, int experience_period, String volunteer_role, String participatoin_record) {
        this.volunteer_charactaristics = volunteer_charactaristics;
        this.experience_period = experience_period;
        this.volunteer_role = volunteer_role;
        this.participatoin_record = participatoin_record;
    }

    public volunteer(String volunteer_charactaristics) {
        this.volunteer_charactaristics = volunteer_charactaristics;
    }

    public String getVolunteer_charactaristics() {
        return volunteer_charactaristics;
    }

    public void setVolunteer_charactaristics(String volunteer_charactaristics) {
        this.volunteer_charactaristics = volunteer_charactaristics;
    }

    public int getExperience_period() {
        return experience_period;
    }

    public void setExperience_period(int experience_period) {
        this.experience_period = experience_period;
    }

    public String getVolunteer_role() {
        return volunteer_role;
    }

    public void setVolunteer_role(String volunteer_role) {
        this.volunteer_role = volunteer_role;
    }

    public String getParticipatoin_record() {
        return participatoin_record;
    }

    public void setParticipatoin_record(String participatoin_record) {
        this.participatoin_record = participatoin_record;
    }
    public void delete volunteer(String volunteer_charactaristics,int experience_period,String volunteer_role,String participatoin_record){
        
    }
    public void register(){
        
    }
    public void duration(){
        
    }

    @Override
    public String toString() {
        return "volunteer{" + "volunteer_charactaristics=" + volunteer_charactaristics + ", experience_period=" + experience_period + ", volunteer_role=" + volunteer_role + ", participatoin_record=" + participatoin_record + '}';
    }
    
    
    
    
    
}
