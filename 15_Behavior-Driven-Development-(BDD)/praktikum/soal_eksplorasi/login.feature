Feature: Login Functionality to Sepulsa Application
    As a user
    I want to login
    so that I can access online services


    Scenario: Successful login with valid credentials
        Given I am on the login page
        When I enter valid credentials
        And I click on the login button
        Then I should be redirected to the homepage

    Scenario: Unsuccessful login with invalid credentials
        Given I am on the login page
        When I enter invalid credentials
        And I click on the login button
        Then I should see an error message


    Scenario: Login with incorrect password
        Given I am on the login page
        When I fill in the email field with a valid email and invalid password
        And I click the "login" button
        Then I should see an error message indicating invalid password

    Scenario: Login with forgot password feature
        Given I am on the login page
        When I click "forgot password" link
        And I fill in the email field with a valid email for password recovery
        And I click the "send" button
        Then I should receive an email with instructions for password recovery