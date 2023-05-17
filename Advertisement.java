/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251project;

/**
 *
 * @author alano
 */
public class Advertisement {
    
    private String event_specifications;
    private String Advertisement_code ;
    private String Advertisement_scope ;
    
   public Advertisement(String event_specifications ,String Advertisement_code,String Advertisement_scope) {
       this.event_specifications = event_specifications;
       this.Advertisement_code = Advertisement_code ;
       this.Advertisement_scope = Advertisement_scope ;
   }
   public String Getevent_specifications(){
       return event_specifications ;
   }
   public void Setevent_specifications( String specification ){
       this.event_specifications = specification ;
   }
   public String GetAdvertisement_code(){
       return Advertisement_code;
   } 
   public void setAdvertisement_code( String code ){
       this.Advertisement_code = Advertisement_code;
   }
   public String GetAdvertisement_scope(){
       return Advertisement_scope;
   }
   public void setAdvertisement_scope( String scope){
       this.Advertisement_scope = scope ;
}
}
