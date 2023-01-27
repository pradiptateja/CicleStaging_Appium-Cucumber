package object;

import org.openqa.selenium.By;

public class pageLogin {

    By buttonSignInGoogle = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google Account\"]");
    public By getButtonSignInGoogle() {
        return buttonSignInGoogle;
    }

    By accountGoogle = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    public By getAccountGoogle() {
        return accountGoogle;
    }
}
