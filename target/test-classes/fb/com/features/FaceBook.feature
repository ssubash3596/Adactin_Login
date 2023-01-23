@Smoke
Feature: Facebook Login-Testcase Automation 
#Backround--it will run the before scenario
Background:      
  Given user Launch "Chrome" Browser
  And User naviagte Url "https://adactinhotelapp.com/"
  And User Verify page land on login page
@FB-login
Scenario: FB Login with valid details 
  And User Verify Page land on login page
  And User Naviagte Url "https://facebook.com/"
	And User Enter Valid Username "9791400831" 
	And User Enter Valid Password "bala3596" 
	And User Click Login Button 
	Then User Verify loged in Successfull

@Adactin
Scenario: Adactin login with invalid credentials
And User Enter UserName "valid Username"
And User Enter PassWord "Invalid Password"
And User click login button
Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter UserName "Invalid Username"
And User Enter PassWord "valid Password"
And User click login button
Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter UserName "Invalid Username"
And User Enter PassWord "Invalid Password"
And User click login button
And User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"

@Adactin-Tc001
Scenario Outline: Adactin login with invalid credentials
And User Enter Login Details <UserName> and <PassWord>
And User click login button
And User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"

Examples:
|UserName|PassWord|
|"Invalid Username"|"Invalid Password"|
|"valid Username"|"Invalid Password"|
|"Invalid Username"|"valid Password"|


