import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTesting {
    UserRegistration user = new UserRegistration();
    @Test
    void GivenNameIsValidatedReturnTrue(){
        boolean result = user.getName("Ganesh");
        Assertions.assertEquals(true,result);
    }

    @Test
    void WhenGivenNameFirstLetterIsSmallThenReturnFalse(){
        Boolean result = user.getName("ganesh");
        Assertions.assertEquals(false,result);
    }

    @Test
    void WhenGivenNameIsHavingLessThanThreeLetterThenReturnFalse(){
        Boolean result = user.getName("Ga");
        Assertions.assertEquals(false,result);
    }


}

