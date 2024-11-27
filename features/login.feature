Feature: login functionality
 
  @Fisrt 
  Scenario: login with valid cred
  Given go to url and launch
  When login with valid cred
  Then navigated to home page
  
  
    @Fisrt @second
  Scenario: login with invalid cred
  Given go to url and launch
  When login with valid cred
  Then navigated to home page