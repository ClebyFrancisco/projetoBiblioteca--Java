# language: en

  Feature: Login
    Me as a system user
    I want to login
    To make a purchase on the website


    @login-success
    Scenario: Login successfully
      Given I'm on the login screen
      When I fill in login "thebigbangqa@cognizant.com.com" and password "123456"
      And  click on Login
      Then  I'm logged into the application

#    @login-empty-fields
#    Scenario Outline: Login with empty data
#      Given I'm on the login screen
#      When I fill login "<user>" and password "<password>"
#      And click on Login
#      Then I see message "<message>" field not filled
#
#      Examples:
#        | user            | password | message           |
#        |                 | 123456   | Invalid email.    |
#        | email@email.com |          | Invalid password. |
#        |                 |          | Invalid email.    |
