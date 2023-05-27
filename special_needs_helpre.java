
public class special_needs_helpre extends Volunteer {
    public boolean dealing_with_specia_needs_exp;
    
    private special_needs_helpre() {
    }

    public boolean isDealing_with_specia_needs_exp() {
        return dealing_with_specia_needs_exp;
    }

    public void setDealing_with_specia_needs_exp(boolean dealing_with_specia_needs_exp) {
        this.dealing_with_specia_needs_exp = dealing_with_specia_needs_exp;
    }

    

    
    @Override
    public String toString() {
        return "special_needs_helpre{" + "dealing_with_specia_needs_exp=" + dealing_with_specia_needs_exp + '}';
    }
    
    
    
}
