package com.bitrix.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ={"json:target/cucumber.json",
                 "html:target/default-cucumber-reports"},
        //tags = {" ~@negative"},
        //tags = {"  not @negative"},
        //tags = {"@navigation"},
        features = { // to specify where the features are
                "src/test/resources/features",
//                "src/test/resources/features/login",
//                "src/test/resources/features/sidemenu",
//                "src/test/resources/features/activitystream"
        },

        // feature contains scenarios
        // every scenario is like a test
        // where is the implementation for features
        glue={
                "com/bitrix/step_definitions",
                //"com/...."   hook we can put here also

        },

        // dry run = to generate step definitions automatically
        // you will see them in the console output
        dryRun = false
)
public class CukesRunner {



}
