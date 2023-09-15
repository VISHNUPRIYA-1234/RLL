Feature: Locate the preschool using location



@TC_101 @find_preschool
Scenario: A user able to find preschool locator
Given A user is on landing page
When he clicks on login
And he entered into login page
And he hovers preschool&stores and click select 'find preschool' in the submenu
And he switches focus to new tab
And he click on the second available city
And click on findmy preschool
Then  he must be able to  verify the text "FirstCry Intellitots Preschools In Agra"


#Examples:
#|cityname|
#|Bangalore|
#|Chennai|
#|Vijayawada|
#
