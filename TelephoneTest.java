package telephone;

public class TelephoneTest {
    public static void main(String[] args) {
        Android hpGhifari = new Android("1", "Ghifari");
        
        hpGhifari.setContactNumber("081234567890");
        hpGhifari.getContactNumber();
        hpGhifari.call();
        hpGhifari.isCalled();
        
    }
    
}
