@loginTests
  Feature: Test login and log out processes in different scenarios


    Background:
      Given Landed on web page
      Then Verified if home page is displayed successfully

    Scenario Outline:The user successfully logins with correct email and password
      Given The user is  on the login page
      Then The user verifies if "Login to your account" message displayed on LoginPage
      When The user enter correct email <email> address and password <password>
      And Click to the login button
      Then The user verifies that Logged in as username is visible
      When The user clicks Delete Account button
      Then The User verifies that "ACCOUNT DELETED!" is visible

      Examples:
        | email          | password |
        | oguzz@oguz.com |asdasdasd |


    Scenario Outline:The user tries to login with incorrect email and password
      Given The user is  on the login page
      Then The user verifies if "Login to your account" message displayed on LoginPage
      When The user enter correct email <email> address and password <password>
      And Click to the login button
      Then The user verifies that "Your email or password is incorrect!" is visible
      Examples:
        | email             | password |
        | oguzoguz@oguz.com |asdasdasd |
