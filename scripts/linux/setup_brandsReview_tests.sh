#!/usr/bin/env bash
echo "RUNNING THE SETUP FOR THE BRANDS REVIEW FEATURES"
mvn clean test -Dcucumber.options="--tags @setup --tags @brandsReview"