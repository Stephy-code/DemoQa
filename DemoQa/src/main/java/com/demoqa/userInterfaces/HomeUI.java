package com.demoqa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target BTN_ELEMENTS = Target.the("clic elements")
            .locatedBy(("//div/h5[text()='Elements']"));
}
