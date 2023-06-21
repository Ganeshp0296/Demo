import java.util.regex.Pattern;

public class UserRegistration {
//    String name;
    public boolean getName(String name){
        return
        Pattern.matches("[A-Z][a-z]{2,}",name);
    }
    public boolean getLName(String lName){
        return
                Pattern.matches("[A-Z][a-z]{2,}",lName);
    }
    public boolean getEmail(String email){
        return
                Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",email);
    }

}
