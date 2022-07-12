import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    public void  search(){
        System.out.println("Search something ");
    }

    @Test(priority = 2)
    public void  exit(){
        System.out.println("Quit from the application ");
        Assert.assertEquals(1,1);
    }
}
