package US304_305_306;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

public class TC_305 extends BaseDriver {
    @Test
    public void TC_305_1(){

        driver.get("https://shopdemo.e-junkie.com/"); //Website sayfası açıldı.
        MyFunc.Bekle(2);



        BekleKapat();

    }
}

