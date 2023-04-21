Feature:Erorrmessage validation

Scenario:
Given user launches shopwithegsite
When user clicks login button
And user clicks on create Account button
When user eneters firstname with lessthan two characters
Then validate the erorr message