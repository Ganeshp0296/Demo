public class MoodAnalyser {
    String message;

    String userMoodSad(String input){
        if(input.equals("Sad") || input.equals("SAD"))
            return "sad";
        else
            return "happy";
    }

    String userMoodHappy(String input){
        if(input.equals("Happy") || input.equals("happy"))
            return "happy";
        else
            return "sad";
    }
}