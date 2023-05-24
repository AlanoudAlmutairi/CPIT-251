
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
    }
    
}
