@smoke
  Feature: F04 | Search test
    Scenario Outline: user could search using product name
      Given User searched for "<items>" from the homepage
      Then the search results for "<items>" are relevant

      Examples:
        |items|
        |book|
        |laptop|
        |nike|

    Scenario Outline: user could search using product name
      Given User searched for items using "<sku>" from the homepage
      Then the search result using "<sku>" is relevant

      Examples:
        |sku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|