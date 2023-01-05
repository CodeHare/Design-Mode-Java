import java.util.Locale;
import java.util.Map;

public class TeacherView {
    public void printTeacherDetails(String name, String subject, int gender, int code){
        String personalPronoun = judgePersonalPronoun(gender);
        String subjectPersonalPronoun = judgeSubjectPersonalPronoun(gender);

        System.out.println( subjectPersonalPronoun + " is a teacher, " + personalPronoun + " name is " + name + ".");
        System.out.println( subjectPersonalPronoun + " teaches subject is " + subject + ".");
        System.out.println( subjectPersonalPronoun + " employee number is " + code + ".");
    }

    public String judgePersonalPronoun(int gender){
        return gender == 1 ? "his" : "her";
    }

    public String judgeSubjectPersonalPronoun(int gender){
        return gender == 1 ? "he" : "she";
    }
}
