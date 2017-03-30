import java.util.Random;

/**
 * Created by MattyG on 3/30/17.
 */
public interface Int2 {
    //static constant
    int MIN_CHARS = 2;
    //default
    default String tellMe() {
        return "TODO";
    }
    //abstract
    boolean isTrue();
    //static
    static double getSize() {
        Random random1 = new Random();
        return random1.nextDouble();
    }

    static boolean boo2(){
        return false;
    }
}
