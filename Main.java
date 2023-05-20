
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.println("'a'  for admin .... 'v' for volunteer  :");
       char Role = input.next().charAt(0);
       
       int x=0 ;
       int y =0; 
       
     Admin a = new Admin ();
       
       if (Role =='a'){
       // Admin(a);;
        Admin(a,input);
        
           
       }
       else if(Role == 'v') {
           
       }   
       
        
        
        
           }   
    
    
    public static void Admin(Admin a1 , Scanner input){
      //a1.log_in();
      
      System.out.println("select:");
      String select = input.next();
      do{
      if(select.equalsIgnoreCase("A"))
         a1.add_advertisements();
        System.out.println();
         
          
          }while(select=="q"); 
    }
    
}
