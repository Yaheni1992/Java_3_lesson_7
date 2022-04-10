package lesson7;

public class MyTesting {

    @Test(priority = 3)
    public void testMethod1() {
        System.out.println("Test method priority = 3");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("Test method priority = 2");
    }

    @Test(priority = 9)
    public void testMethod3() {
        System.out.println("Test method priority = 9");
    }

    @Test(priority = 6)
    private void testMethod4() {
        System.out.println("Test method priority = 6 (private)");
    }

    @Test
    public void testMethod5() {
        System.out.println("Test method priority = default");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuite method");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite method");
    }

}