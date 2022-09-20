@smoke
  Feature: f05 | Hover feature
    Scenario:
      Given user hover on one of the first categories in the homepage
      Then Hover on one of the sub categories and get its text then click on it
      Then User gets the page title and compair it to the usb category text
