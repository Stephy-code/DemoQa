package com.demoqa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextBoxUI {
    public static final Target TXT_FULL_NAME = Target.the("click text box")
            .locatedBy(("//input[@id='userName']"));
    public static final Target TXT_EMAIL = Target.the("click text box")
            .locatedBy(("//input[@id='userEmail']"));

    public static final Target TXT_CURRENT_ADDRESS = Target.the("click text box")
            .locatedBy(("//div/textarea[@id='currentAddress']"));

    public static final Target TXT_PERMANENT_ADDRESS= Target.the("click text box")
            .locatedBy(("//div/textarea[@id='permanentAddress']"));

    public static final Target BTN_SUBMIT= Target.the("click text box")
            .located(By.className("btn btn-primary"));

    public static final Target MSJ_VALIDACION= Target.the("click text box")
            .located(By.className("border col-md-12 col-sm-12"));
}
