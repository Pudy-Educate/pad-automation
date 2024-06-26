package org.example.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features/article.feature"},
        glue = {"org.example.stepDefinitions"},plugin = {"pretty","json:target/cucumberArticle.json"})
public class RunTestArticle {
}
