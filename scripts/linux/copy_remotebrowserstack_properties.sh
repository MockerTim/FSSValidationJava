#!/usr/bin/env bash
echo "OVERWRITING THE TESTCONFIG PROPERTIES FILE WITH THE REMOTE BROWSERSTACK WEBDRIVER"
cp -f src/test/resources/properties/TestConfig-BrowserStack.properties src/test/resources/properties/TestConfig.properties
