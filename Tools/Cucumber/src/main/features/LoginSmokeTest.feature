Feature: Login

#Scenario Outline: Login with user cerdentials
#Given user is able to access the homePgae of talentscreen and click login button
#When User enters the "<name>" and the "<password>" and click on login
#Then The user should be navigated to the Login Success HomePage

#Examples:
#|name      |password|
#|a@gmail.com|123456 |

Scenario: Login with user cerdentials
Given user is able to access the homePgae of talentscreen and click login button
When User enters the credentials
|name      |password|
|a@gmail.com|123456 |
|p@gmail.com|456123 |
And user click on login
Then The user should be navigated to the Login Success HomePage


Scenario: Login with facebook
Given user is able to access the homePgae of talentscreen and click login button
When User clicks facebook login button
Then The user should be navigated to the facebook login page


