Meta:
@tag component:input
@tag requirement:02_129

Narrative:
In order to find projects I would like to see
As a user
I want to be able to perform a search

Scenario: Search from the Frontpage
Given I am on the frontpage
When I enter angular into the search box
Then I should see a list of projects with angular in the name

