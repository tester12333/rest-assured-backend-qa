# rest-assured-backend-qa

Name : Bassam Lahlouh 
________________________________________________________________________
In this app you can find 3 packages {Data , Requst and Test Cases}

Data package has 3 classes:
 1- DataProvider : this class method will return 3 test cases will be filed in postrequest body to test Date back end validation {Valid test , Date in past and To date greater than fron}
 Note we dont have back end validation on date by using secon and therd test cases
 2-JasonReuse in this calss we are reusing JasonPath method
 3-PayLoad has requests body and this tacke data from DataProvider class

Request package : has a requst (given,when,then)

TestCase Package this has 2  test cases
 1-GetTest here we are calling get request and make assertion validtion
 2-PostTest here we are calling get request and make assertion validtion using the data provider
 
Also you can find simple report in this path .\Bassam project\test-output\emailable-report.html or index.html
__________________________________________________________________________