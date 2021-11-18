Feature: Transfer funds

  Rule : admin user needs to transfer funds from one account to another

      Example: admin user is on transfer fund page
        Given admin is on the login page
        And  admin log in with valid credentials
        And admin user is on the Bank Page
        When admin user clicks on Transfer Fund link
        And admin user is on the Transfer Fund Page


