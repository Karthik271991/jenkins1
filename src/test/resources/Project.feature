
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add the customer Details
    Given User enter enter into page
    When User click Add customer and its goes to next page
    |Venkatesh|Venkat|Venkat1993@gmail.com|Theni|9922330099|
    And User Fill the Page and submit
    Then User navigates into next Page

  @tag2
  Scenario Outline: Customer Add the details
    Given User in Home page
    When User wants to click Add customer field
    And User Fills all the field and click submit"<name1>","<name2>","<name3>","<name4>","<name5>"
    Then User See in next Page

    Examples: 
      | name1|name2|name3|name4|name5|
      | Venkat |s| venkats27@gmail.com|Bangalore|7654980145|
      | Rohit|Vignesh|Rohit06@gmail.com|mumbai|9940923459|
