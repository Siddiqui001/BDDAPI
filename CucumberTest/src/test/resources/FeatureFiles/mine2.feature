@Hotel.com_RegressionSuite
Feature: Title of your feature I want to use this template for my feature file - Heheheeehe

  @tag1
  Scenario Outline: Verify Flight and Hotel Booking functionlality
    Given Opened browser with Home page of hotels.com
    And Verify the Sub Menu items "<MenuItems>"
    And Click on "Packages & Flights" link from home page
    And Verify if Flight&Hotel Link is Selected Already if not select it

		 And Verify if Flight&Hotel Link is Selected Already if not select it1
		 And Verify if Flight&Hotel Link is Selected Already if not select it2
		 
    Examples: 
      | MenuItems                                                                                                                   |
      | Deals%Vacation rentals%Things to do%Packages & Flights%Groups & Meetings%Gift Cards%List your property%Hotels.com® Rewards% |

  Scenario Outline: Verify Flight and Hotel Booking functionlality
    And Say Hello to New ONboarded Person "<Name>"

    @Regression
    Examples: 
      | Name     |
      | Muzzafar |
      | Siddiqui |

    @smoke
    Examples: 
      | Name  |
      | Reddy |
      | Kevin |
