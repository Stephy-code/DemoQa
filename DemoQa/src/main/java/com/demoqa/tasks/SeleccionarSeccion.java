package com.demoqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoqa.userInterfaces.ElementsUI.BTN_TEXT_BOX;
import static com.demoqa.userInterfaces.HomeUI.BTN_ELEMENTS;

public class SeleccionarSeccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ELEMENTS),
                Click.on(BTN_TEXT_BOX)
        );
    }
    public static SeleccionarSeccion seleccionarSeccion() {
        return Tasks.instrumented(SeleccionarSeccion.class);
    }

}
