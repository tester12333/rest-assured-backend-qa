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
 
Reporting: you can find simple report in this path .\Bassam project\test-output\emailable-report.html or index.html OR 
Or Allure Report by execute this comand "allure serve .\allure-results\" Using Powershell in project path
__________________________________________________________________________

Note that to view allure report you need To install Allure :
 How to install Allure: 1- download and install Scoop 
						2- and then execute in the Powershell: "scoop install allure"
 
 How to install Scoop : 1- Open Powershell and execute "iwr -useb get.scoop.sh | iex"
                        2- If you got an error regarding the execution policy execute "Set-ExecutionPolicy RemoteSigned -scope CurrentUser"
						3- Now you ready to install allure and use it 
 
 
 