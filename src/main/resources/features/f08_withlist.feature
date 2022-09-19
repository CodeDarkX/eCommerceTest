@smoke
  Feature: f08 | checking the with list
    Scenario: User adds an Item to the check list
      Given user goes to the homepage and added a phone to his wishlist
      Then The phone is added to the wishlist


    Scenario:
      Given user goes to the homepage and added a phone to his wishlist
      Then User click on the wishlist tab and check quantity
