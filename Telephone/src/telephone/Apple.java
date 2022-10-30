package telephone;

public class Apple extends Telephone{
    public Apple(String idNumber, String person) {
        this.ID = idNumber;
        this.ownerName = person;
    }
    
    @Override
    public void isCalled() {
        System.out.println("\"Insert apple call noise\"");
    }
}
