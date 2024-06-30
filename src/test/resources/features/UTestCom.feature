#Author: Carolina
  #language: en
@stories
Feature: Test Utest
  As a User, I want to register myself on the website UTest.com.

  @register
  Scenario: Approved Register
    Given That I want to register myself on the website
    When She complete the first part of the registry
      | firstName | lastName | emailAddress                | birthMonth | birthDay | birthYear |
      | Lucía     | Arjona   | luciarjona__555@yopmail.com | October    | 27       | 2000      |
    And She complete the second part
      | city                            | zip    | country  |
      | Cali, Valle del Cauca, Colombia | 760000 | Colombia |
    And She complete the third part
      | oSComputer | versionOSComputer   | languageOSComputer | brandMobile | modelMobile    | oSMobile  |
      | Ubuntu     | Ubuntu Budgle 20.04 | German             | Asus        | Nexus 7 (2012) | Android 6 |
    And She complete the fourth part
      | password      | confirmPassword |
      | Contrasena33* | Contrasena33*   |
    Then She can see the welcome message on the website
      | responseMessage                                                         |
      | Welcome to the world's largest community of freelance software testers! |
