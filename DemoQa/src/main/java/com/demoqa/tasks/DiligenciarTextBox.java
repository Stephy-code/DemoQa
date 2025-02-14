package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demoqa.userInterfaces.TextBoxUI.*;

public class DiligenciarTextBox implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Stephanie").into(TXT_FULL_NAME),
                Enter.theValue("stephycortes90@gmail.com").into(TXT_EMAIL),
                Enter.theValue("Cra 45 c").into(TXT_CURRENT_ADDRESS),
                Enter.theValue("Cra 45 c").into(TXT_PERMANENT_ADDRESS),
                Click.on(BTN_SUBMIT)

        );

    }
    public static DiligenciarTextBox textBox () {
        return Tasks.instrumented(DiligenciarTextBox.class);
    }
}
