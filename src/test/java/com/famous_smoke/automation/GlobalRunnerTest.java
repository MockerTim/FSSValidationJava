package com.famous_smoke.automation;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * <p>This is the JUnit Test Runner for the ALL features.</p>
 *
 * <p>It's run using Cucumber-JVM runner, it checks for the features in the
 * <strong>features</strong> folder with the any tag
 *
 * <p>It publishes its results to <strong>target/cucumber-report.json</strong></p>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		plugin = {"pretty", "json:target/cucumber-report.json"}
)
public class GlobalRunnerTest {
}