#!/usr/bin/env bash
echo "RUNNING THE SETUP FOR THE ITEMS REVIEW FEATURES"
mvn clean test -Dcucumber.options="--tags @setup --tags @itemsReview"