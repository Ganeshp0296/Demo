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
        boolean result = user.getName("ganesh");
        Assertions.assertEquals(false,result);
    }

    @Test
    void WhenGivenNameIsHavingLessThanThreeLetterThenReturnFalse(){
        boolean result = user.getName("Ga");
        Assertions.assertEquals(false,result);
    }

    @Test
    void WhenGivenLastNameIsValidateThenRerturnTrue(){
        boolean result = user.getLName("Pawar");
        Assertions.assertEquals(true,result);
    }
    @Test
    void WhenGivenLastNameFirstCharacterIsSmallThenRerturnFalse(){
        boolean result = user.getLName("pawar");
        Assertions.assertEquals(false,result);
    }
    @Test
    void WhenGivenLastNameIsHavingLessThanThreeCharacterThenReturnFalse(){
        boolean result = user.getLName("pa");
        Assertions.assertEquals(false,result);
    }
    @Test
    void WhenGivenEmailIsValidateThenReturnTrue(){
        boolean result = user.getEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }
    @Test
    void WhenGivenEmailIsNotValidateThenReturnFalse(){
        boolean result = user.getEmail("2:ganesh@bl.co");
        Assertions.assertEquals(false,result);
    }

}

