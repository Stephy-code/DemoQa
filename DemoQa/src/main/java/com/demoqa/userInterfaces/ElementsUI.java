package com.demoqa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementsUI {
    public static final Target BTN_TEXT_BOX = Target.the("click text box")
            .locatedBy(("//span[text()='Text Box']"));
}
