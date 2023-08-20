Project Description
Welcome to our application repository. This project encompasses three distinct packages, each serving a specific purpose: Data, Request, and Test Cases.

Data Package
Within the Data package, you will find three essential classes:

DataProvider: This class contains a method that furnishes three distinct test cases intended for populating the POST request body. These test cases facilitate the evaluation of backend date validation. The three scenarios include:

Valid test
Date in the past
To date greater than from date
Notably, backend validation is absent for the second and third test cases.

JasonReuse: This class offers a method for reusing the JSONPath functionality.

Payload: The Payload class provides a structured representation of request bodies, drawing data from the DataProvider class.

Request Package
The Request package houses a robust request structure, which adheres to the Given-When-Then paradigm, encompassing the following elements:

Given: Setting up the preconditions for the test
When: Initiating the specific action or operation
Then: Validating the outcomes and results
TestCase Package
Within the TestCase package, you will discover two comprehensive test cases:

GetTest: This test case involves the execution of a GET request and subsequent assertion validation.

PostTest: Similar to the previous test, the PostTest scenario revolves around executing a GET request and performing assertion validation. Additionally, this test employs data from the DataProvider class to enhance test coverage.

Reporting
Our project incorporates two reporting options:

Simple Report: You can access a straightforward report at the following path: ./Bassam project/test-output/emailable-report.html or index.html.

Allure Report: To generate and view the comprehensive Allure Report, execute the following command in PowerShell, while in the project path: allure serve ./allure-results/.

Allure Installation Instructions
To take full advantage of the Allure Report, please follow these installation instructions:

Download and install Scoop by executing the following command in PowerShell:

arduino
Copy code
iwr -useb get.scoop.sh | iex
If you encounter an execution policy error, resolve it by executing:

sql
Copy code
Set-ExecutionPolicy RemoteSigned -scope CurrentUser
Install Allure via Scoop:

Copy code
scoop install allure
With these steps completed, you are ready to enjoy the benefits of Allure and utilize it for your reporting needs.