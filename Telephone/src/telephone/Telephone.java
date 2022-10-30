package telephone;

abstract public class Telephone {
    private String contactNumber;
    String ID, ownerName;
    
    
    public void setContactNumber(String inp) {
        this.contactNumber = inp;
    }
    
    public void getContactNumber() {
        System.out.println("Nomor " + ownerName + " : " + contactNumber);
    }    
    
    public void call() {
        System.out.println(ownerName + " diblokir mantan :(");
    }
    
    public void isCalled() {
        System.out.println("The phone doesn't make a sound");
    }
    
}
