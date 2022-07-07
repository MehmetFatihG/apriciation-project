@wip
Feature: CRMLY appreciation section feature

  Background:
    Given user successfully logged into crmly application
    When user clicked on more dropdown module on the main page
    And user clicked on appreciation link under the more module

    @REM-1360
  Scenario: As a user, I should be able to mention
    When user clicked on add mention button
    When user clicked on employees and departments on the opened page
    Then user should be able to add mentions about department employees

    @REM-1361
  Scenario: As a user, I should be able to add link
    When user clicked on link button
    And user enters "google" on the link text input
    And user enters "https://www.google.com" on the link url input
    And user click on save button
    And user click on message send button
    Then user should be able to attach a link to the specified text

    @REM-1362
  Scenario: As a user, I should be able to insert YouTube and Vimeo videos
    When user clicked on insert video button
    And user enters "https://www.youtube.com/watch?v=6Htn1x-_-is" and click save button
    And user clicked on insert video button
    And user enters other "https://vimeo.com/335402109" and click save button
    Then user should be able to see the url on the message area

    @REM-1363
  Scenario: As a user, I should be able to add quotes.
    When user clicked on quote button
    And user write "quote text" on the input and click send button
    Then user should be able to add quotes.

    @REM-1364
  Scenario: As a user, I should be able to add tags to messages
    When user enters "appreciation" message
    And user clicked add tag button
    And user enters "message" and click add button and send button
    Then user should be able to add tags to messages

    @REM-1365
  Scenario: As a user, I should be able to remove tags before sending the message
    When user enters "appreciation" message
    And user clicked add tag button
    And user enters "message" and click add button
    And user click on remove added tag button
    Then user should be able to remove tags before sending the message
