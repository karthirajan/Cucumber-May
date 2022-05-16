# Author: karthi@your.domain.com
@Regression
Feature: Mobile

Background:
   Given User login flipkart application

  Scenario: Mobile validation
    When user search mobile
    And user choose the mobile
    And user switch to new window
    Then User validate the both names

@smoke @sanity
  Scenario: Mobile validation by 1D list
    When user search mobile by one Dim list
      | realme | iPhone | SAMSUNG |
    And user choose the mobile
    And user switch to new window
    Then User validate the both names

@smoke
  Scenario: Mobile validation by 1D Map
    When user search mobile by one Dim map
      | 1 | realme  |
      | 2 | iPhone  |
      | 3 | SAMSUNG |
    And user choose the mobile
    And user switch to new window
    Then User validate the both names

  Scenario Outline:
    When user search mobile "<Mobiles>"
    And user choose the mobile
    And user switch to new window
    Then User validate the both names

    Examples: 
      | Mobiles |
      | iPhone  |
      | realme  |
      | SAMSUNG |
