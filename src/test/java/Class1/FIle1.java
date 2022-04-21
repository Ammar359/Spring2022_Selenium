package Class1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FIle1 {
    @Test
    public void verify2Plus2 (){
        Assert.assertEquals(2+2,14,"2+2 ISNT equal");
    }
}
