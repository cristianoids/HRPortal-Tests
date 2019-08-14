Feature: UpdateEmployeeInfo

  Scenario: Test approving pending requests
    Given User submits a vacation request
    When User navigates to pending requests
    And clicks on approve link of that request
    Then the request is approved
