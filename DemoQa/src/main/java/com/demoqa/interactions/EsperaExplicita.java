package com.demoqa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperaExplicita implements Interaction {
    private Target elemento;

    public EsperaExplicita(Target elemento) {
        this.elemento = elemento;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isVisible()).forNoMoreThan(30).seconds()
        );
    }

    public static EsperaExplicita en (Target elemento) {
        return instrumented(EsperaExplicita.class, elemento);
    }
}

