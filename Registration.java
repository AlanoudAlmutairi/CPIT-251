/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251project;

/**
 *
 * @author alano
 */
public class Registration {
    
    private String Registration_code ;
    private String Event_name ;
    private String Volunteer_Role ;
    private String Volunteer_name ;
    
  public Registration (String Registration_code,String Event_name , String Volunteer_Role,String Volunteer_name){
      this.Registration_code = Registration_code ;
      this.Event_name = Event_name ;
      this.Volunteer_Role = Volunteer_Role ;
      this.Volunteer_name = Volunteer_name ;
  }
  
  public String GetRegistration_code(){
      return Registration_code ;
}
  public void SetRegistration_code(String code ){
      this.Registration_code = code ;
  }
  public String GetEvent_name(){
      return Event_name ;
  }
  public void SetEvent_name(String eventName){
      this.Event_name = eventName ;
  }
  public String GetVolunteer_Role(){
      return Volunteer_Role ;
  }
  public void SetVolunteer_Role( String Role){
      this.Volunteer_Role = Role;
  }
  public String GetVolunteer_name(){
      return Volunteer_name ;
  }
  public void SetVolunteer_name( String volunteerName ){
      this.Volunteer_name = volunteerName ;
  }
  
  public String Display_Ads_info(){
  
  return " ";
  }
  
  
}