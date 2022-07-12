package group;

import org.testng.annotations.Test;

public class GroupExample {
    @Test(groups = {"retest"})
    void test1() {
        System.out.println("retest: This is test1");
    }

    @Test(groups = {"retest"})
    void test2() {
        System.out.println("retest: This is test2");
    }

    @Test(groups = {"systemTest"})
    void test3() {
        System.out.println("systemTest: This is test3");
    }
    @Test(groups = {"systemTest","sanityTest"})
    void test4() {
        System.out.println("systemTest & sanityTest: This is test4");
    }
}
