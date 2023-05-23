
public class User {
    private String userName;
    private int password;
    private String Email;
    private int ContactNumber;
    private int ID;
    private String gender;

    public User(String userName, int password, String Email, int ContactNumber, int ID, String gender) {
        this.userName = userName;
        this.password = password;
        this.Email = Email;
        this.ContactNumber = ContactNumber;
        this.ID = ID;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void sign_up(){
        
    }
    public void log_in(){
        
    }
    public void forget_password(){
        
    }
    public void Evaluation(){
        
    }
}
