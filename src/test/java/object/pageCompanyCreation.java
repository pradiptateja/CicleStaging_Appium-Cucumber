package object;

import org.openqa.selenium.By;

public class pageCompanyCreation {

    By fieldName = By.xpath("//android.widget.EditText[@text=\"type name...\"]");
    public By getFieldName() {
        return fieldName;
    }

    By filedDescription = By.xpath("//android.widget.EditText[@text=\"type description...\"]");
    public By getFiledDescription() {
        return filedDescription;
    }

    By buttonCreate = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    public By getButtonCreate() {
        return buttonCreate;
    }

    By buttonClose = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]");
    public By getButtonClose() {
        return buttonClose;
    }

    By txtError = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    public By getTxtError() {
        return txtError;
    }

}
