
public class Admin {
    private int length_of_service;
    private int rank_of_adminstration;

    public Admin(int length_of_service, int rank_of_adminstration) {
        this.length_of_service = length_of_service;
        this.rank_of_adminstration = rank_of_adminstration;
    }

    public int getLength_of_service() {
        return length_of_service;
    }

    public void setLength_of_service(int length_of_service) {
        this.length_of_service = length_of_service;
    }

    public int getRank_of_adminstration() {
        return rank_of_adminstration;
    }

    public void setRank_of_adminstration(int rank_of_adminstration) {
        this.rank_of_adminstration = rank_of_adminstration;
    }
  
     public String add_advertisements( ArrayList<Advertisement> Adv, int index ){
     System.out.print("Enter event specification: ");
     String event_specifications = input.next();
     System.out.print("Enter Advertisement code :");
     String Advertisement_code = input.next();
     System.out.print("Enter Advertisement scope :");
     String Advertisement_scope=input.next();
     Advertisement AA=new Advertisement(event_specifications,Advertisement_code, Advertisement_scope);
     Adv.add(AA);
     index++;
     return "Suceess";
    }
    
    
       public int searchAdv(ArrayList<Advertisement> Adv , String Advertisement_code  ){
       for(int index = 0 ; index < Adv.size() ; index++){
            if (Advertisement_code.equals(Adv.get(index).GetAdvertisement_code()) ){
                return index ;
                
            }
            
       } 
     return -1;   
    }    
    
   public void delet_addvertisements(ArrayList<Advertisement> Adv , String Advertisement_code){
       
        int pointer2delet= searchAdv( Adv ,  Advertisement_code  );
        
        if (pointer2delet == -1 ){
            System.out.println("This "+Advertisement_code +" doesn't exists");
        }
        else{
            Adv.remove(Adv.get(pointer2delet));
            
            System.out.println("Deleted successfully");
        }
    }
    
    
    public void categorization_addvertisements(){
        
    }
    public void display_addvertisement(){
        
    }
    public void provide_leadership_on_issues(){
        
    }
}

