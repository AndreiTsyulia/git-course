package gitcourse;

import org.testng.annotations.Test;

public class GitCourse {
    private static final String HELLO = "Hello";
    private static final String WORLD = "world";

    public static void main(String[] arg) {
        System.out.println(HELLO + " from git");
        System.out.println(HELLO + WORLD);
    }

    @Test
    public void test(){
        System.out.println(HELLO + " from git");
        System.out.println(HELLO + WORLD);
    }
}
