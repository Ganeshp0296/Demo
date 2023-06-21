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

}

