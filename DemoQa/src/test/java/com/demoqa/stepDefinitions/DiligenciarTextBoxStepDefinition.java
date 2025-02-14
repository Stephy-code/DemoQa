package com.demoqa.stepDefinitions;


import com.demoqa.questions.ValidacionTextBox;
import com.demoqa.tasks.DiligenciarTextBox;
import com.demoqa.tasks.SeleccionarSeccion;
import io.cucumber.java.Before;

import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DiligenciarTextBoxStepDefinition {

    @Managed
    private WebDriver browser;

    @Before
    public void setStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));

    }
    @Dado("Dado que el usuario se encuentre en la pagina web demoqa")
    public void dadoQueElUsuarioSeEncuentreEnLaPaginaWebDemoqa() {
        OnStage.theActorCalled("User").wasAbleTo(Open.url("https://demoqa.com/"));

    }
    @Cuando("se encuentre en la seccion elementos para seleccionar la opcion de text Box")
    public void seEncuentreEnLaSeccionElementosParaSeleccionarLaOpcionDeTextBox() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarSeccion.seleccionarSeccion());
    }
    @Cuando("complete el formulario")
    public void completeElFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarTextBox.textBox());

    }
    @Entonces("el usuario visualizara en la parte inferior los datos ingresados")
    public void elUsuarioVisualizaraEnLaParteInferiorLosDatosIngresados() {

        OnStage.theActorInTheSpotlight().should(seeThat("El usuario visualiza el cuadro con la información ingresada", ValidacionTextBox.validacionTextBox(), Matchers.equalTo(true)));


    }



}
