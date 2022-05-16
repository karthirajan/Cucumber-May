$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobilePurchase.feature");
formatter.feature({
  "name": "Mobile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_login_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile validation by 1D list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user search mobile by one Dim list",
  "rows": [
    {
      "cells": [
        "realme",
        "iPhone",
        "SAMSUNG"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_search_mobile_by_one_Dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the mobile",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_choose_the_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user switch to new window",
  "keyword": "And "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_switch_to_new_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate the both names",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilePurchaseSteps.user_validate_the_both_names()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});