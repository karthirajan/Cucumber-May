#Author: your.email@your.domain.com
@Tv @Regression
Feature: Tv Purchase

  Background: 
    Given User login flipkart application

  Scenario: 
    When user search tv
    And user choose the tv
    And user switch to new window
    Then User validate the both names
