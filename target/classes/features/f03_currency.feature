@smoke
  Feature: F03 Change currency in Homepage
    Scenario: Euro currency from the dropdown list
      Given User go to homepage and select Euro from the currency list
      Then The items' prices in home page turn into Euro