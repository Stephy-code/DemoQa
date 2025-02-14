package com.demoqa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/DiligenciarTextBox.feature",
        glue = "com.demoqa.stepDefinitions",
        //tags = "@Login",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class DiligenciarTextBoxRunner {
}
