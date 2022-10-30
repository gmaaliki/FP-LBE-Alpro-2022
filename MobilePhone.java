package telephone;

abstract public class MobilePhone extends Telephone{
    private boolean isSilent = false;
    
    
    public void toggleIsSilent() {
        this.isSilent = !this.isSilent;
    }
    
    public void messaging(String receiver, String message) {
        System.out.println("Message sent to " + receiver + " : " + message);
    }
    
    public void messaging(String message) {
        System.out.println("Message sent to all : " + message);
    }
    
}
