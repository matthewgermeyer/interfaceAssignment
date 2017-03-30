import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Foo deals with member names, real names, ages and IDs.
public interface Foo {
    //Constant - This is abstract?  right?
    int MAX_CHARS = 15;

    //default Method
    String setEmail(String email);

    default boolean isEmailValid(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //public static String time = LocaDate.now();
    //Static
    public static int getClassCounter() {
        System.out.println("..");
        return 2;

    }


}
