@smoke
  Feature: F04 | Search test
    Scenario Outline: user could search using product name
      Given User searched for an item from the homepage
      When User search for "<items>"
      Then the search results are relevant

      Examples:
        |items|
        |book|
        |laptop|
        |nike|

    Scenario Outline: user could search using product name
      Given User searched for an item from the homepage
      When User search for "<sku>"
      Then the search result is relevant

      Examples:
        |sku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|