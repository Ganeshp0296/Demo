import java.util.regex.Pattern;

public class UserRegistration {
//    String name;
    public boolean getName(String name){
        return
        Pattern.matches("[A-Z][a-z]{2,}",name);
    }

}
