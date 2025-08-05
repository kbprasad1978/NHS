Feature: Search Feature


 Scenario:User is able to search the jobs based on the input typed in the search field text box
   Given I am a jobseeker on NHS Jobs website
   When I put my preferences into the Search functionality
   Then I should get a list of jobs which matches my preferences
   And sort my search results with the newest Date Posted
