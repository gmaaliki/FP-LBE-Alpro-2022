package telephone;

public class Android extends Telephone{
    public Android(String idNumber, String person) {
        this.ID = idNumber;
        this.ownerName = person;
    }
    
    @Override
    public void isCalled() {
        System.out.println("\"Insert android call noise\"");
    }
}
