import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser mood = new MoodAnalyser();
    @Test
    void whenGivenMessage_Sad_ShouldReturnSad(){
        String result = mood.userMoodSad("sad");
        Assertions.assertEquals("sad",result);
    }

    @Test
    void whenGivenAnyMessage_ShouldReturnHappy(){
        String result1 = mood.userMoodHappy("Happy");
        Assertions.assertEquals("happy",result1);
    }

    @Test
    void whenGivenMessage_Happy_ShouldReturnHappy(){
        String result = mood.userMoodHappy("happy");
        Assertions.assertEquals("Happy",result);
    }

    @Test
    void whenGivenAnyMessage_ShouldReturnSad(){
        String result = mood.userMoodSad("Bored");
        Assertions.assertEquals("Sad",result);
    }
}
