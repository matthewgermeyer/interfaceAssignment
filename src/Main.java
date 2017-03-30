public class Main {

    public static void main(String[] args) {
        Implement implement = new Implement();
        System.out.printf("I am calling isTrue %s \n", implement.isTrue());
        System.out.printf("I am calling tellMe() %s \n", implement.tellMe());
        System.out.printf("I am calling getClassCounter() %s \n", Foo.getClassCounter());
        System.out.printf("I am calling setEmail() %s \n", implement.setEmail("matto483@gmail.com"));
        System.out.printf("I am calling isEmailValid %s \n", implement.isEmailValid("matto483@gmail.com"));
        System.out.printf("I am calling getSize %.2fs \n\n", Int2.getSize());

        //basfishing extends Foo, it can call all of Foo's nonstatic
        // methods as well as any method inside of basfishing itself
        BasFishing basFishing = new BasFishing();
        System.out.printf("I am calling boo %d \n", basFishing.boo());
        System.out.printf("I am calling getClassCounter() %s, \n", Foo.getClassCounter());
        System.out.printf("I am calling setEmail %s \n", basFishing.setEmail("matto483@gmail.com"));
        System.out.printf("I am calling isEmailValid %s \n", basFishing.isEmailValid("matto483@gmail.com"));

        System.out.printf("I am calling boo2() %s \n", Int2.boo2());

        System.out.println("I think we're done ^_^ ^_^ \n\n");

    }
}
