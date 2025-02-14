package com.demoqa.questions;

import com.demoqa.userInterfaces.TextBoxUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionTextBox implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        return TextBoxUI.MSJ_VALIDACION.resolveFor(actor).isVisible();

    }
    public static Question validacionTextBox(){
        return new ValidacionTextBox();
    }
}
