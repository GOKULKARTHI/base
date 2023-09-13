@facebook
Feature: To Verify login function in facebook application

Background:
    Given To user launch chrome browser
    
	@smoke
  Scenario: To verify valid email and password
    When To user pass url
    And To user pass invaild username and invalid password
      #1D-Map
      | username-1 | red@gmail.com  |
      | password-1 |           1111 |
      | username-2 | blue@gmail.com |
      | password-2 |           2222 |
    Then To user click continue button
#@regression 
  #Scenario: To verify valid email and password
    #When To user pass url
    #And To user pass valid username and valid password
      #2D-Map
      #| email      | number | password |
      #| red@123    |    123 |     0000 |#0
      #| green@456  |    456 |     1111 |#1
      #| yellow@789 |    789 |     2222 |#2
    #Then To user click continue button
