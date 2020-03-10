Feature: Categories
Open the browser

Background: open browser Jain book agency
Given I have a browser with jain book agency

Scenario: Categories
When click on the category by the name of the category
Then I get the books by the searched category


Scenario: Goto
When I enter the title of the book as 'sridevi'
Then I get the book by the title given

Scenario: SortBy
When I click on the sort by option by the required sorting method as 'New & Popular' 
Then I get the books by the given sorting method 

Scenario: View By
When I click on the View By option by the required View By method as 'Grid'
Then I get the books by the given View By method

Scenario: Logout
When I click on the logout option
Then I shoulf=d be able to logout of the account
