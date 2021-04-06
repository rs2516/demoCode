Feature: login link in header

Scenario Outline: Validate login link in header
Given Open the URL "http://www.qaclickacademy.com/" in browser
When Click on the login link
And Enter emailid <Email> and password <Password>
Then Verify login page displayed

Examples:
|Email					|	|Password	|
|test@yopmail.com		|	|12345		|
|test1234@yopmail.com	|	|ad123		|