-> Created 2 page classes and 1 test class - java classes
-> Utility method (moveToVideoAndClick) to move to recommended video and click on "Add to favorite"
-> utility method (verifyVideoTitleNDesc ) to verify the video title and description

-> Test method(clickOnButtons) to instantiate the driver -> open browser -> navigate to discovery.com -> call the utility method (moveToVideoAndClick) -> navigate to my videos page -> Call the utility method (verifyVideoTitleNDesc) -> Close the session

TestNG framework is used to run the test 
xpath of each element is dynamic and will always work without any issue
Selenium along with java is used to develop the test using POM(Page object model) design pattern 