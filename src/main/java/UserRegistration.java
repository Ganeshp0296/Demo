import java.util.regex.Matcher;
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

    public boolean getMobileNum(String mobileNum){
        return
                Pattern.matches("(91)[ ][0-9]{10}",mobileNum);
    }

    public boolean getPassword(String Password){
        return
                Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$",Password);
    }

    public boolean getEmailIdValidator(String emailId) {
        return
        Pattern.matches("^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$",emailId);
    }
}

