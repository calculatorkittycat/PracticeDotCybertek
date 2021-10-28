Feature: Test Automation Practice

  Background:
    Given you are at practice.cybertekschool.com

  Scenario: A/B Testing
    Then you navigate to A B Testing
    Then verify the header says "No A/B Test"

  Scenario: Add/Remove Elements
    Then you navigate to Add Remove Elements
    When you click Add Element
    Then Delete button should appear
    When you click Delete button
    Then Delete button should dissapear

  Scenario: Autocomplete
    Then you navigate to Autocomplete
    When you enter "Aus"
    Then you should see "Australia" and "Austria" in the dropdown
    When you click "Australia" it should appear in the text input field
    When you click submit "You selected: Australia" should appear on the page

  Scenario: Basic Auth
    Then you navigate to Basic Auth
    When you enter "admin" as user name and password
    And you click Sign In
    Then you should see "Congratulations! You must have the proper credentials. " on the next page

  Scenario: Broken Images
    Then you navigate to Broken Images
    Then verify image 1 is broken
    Then verify image 2 is broken
    Then verify image 3 is not broken
@ts
  Scenario: Challenging DOM
    Then navigate to Challenging DOM
    Then verify the table
      | Lorem    | Ipsum     | Dolor     | Sit         | Amet          | Diceret   | Action      |
      | Iuvaret0 | Apeirian0 | Adipisci0 | Definiebas0 | Consequuntur0 | Phaedrum0 | edit delete |
      | Iuvaret1 | Apeirian1 | Adipisci1 | Definiebas1 | Consequuntur1 | Phaedrum1 | edit delete |
      | Iuvaret2 | Apeirian2 | Adipisci2 | Definiebas2 | Consequuntur2 | Phaedrum2 | edit delete |
      | Iuvaret3 | Apeirian3 | Adipisci3 | Definiebas3 | Consequuntur3 | Phaedrum3 | edit delete |
      | Iuvaret4 | Apeirian4 | Adipisci4 | Definiebas4 | Consequuntur4 | Phaedrum4 | edit delete |
      | Iuvaret5 | Apeirian5 | Adipisci5 | Definiebas5 | Consequuntur5 | Phaedrum5 | edit delete |
      | Iuvaret6 | Apeirian6 | Adipisci6 | Definiebas6 | Consequuntur6 | Phaedrum6 | edit delete |
      | Iuvaret7 | Apeirian7 | Adipisci7 | Definiebas7 | Consequuntur7 | Phaedrum7 | edit delete |
      | Iuvaret8 | Apeirian8 | Adipisci8 | Definiebas8 | Consequuntur8 | Phaedrum8 | edit delete |
      | Iuvaret9 | Apeirian9 | Adipisci9 | Definiebas9 | Consequuntur9 | Phaedrum9 | edit delete |


