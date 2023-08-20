## Project Description developed by Bassam Lahlouh

Welcome to our application repository. This project encompasses three distinct packages, each serving a specific purpose: `Data`, `Request`, and `Test Cases`.

### Data Package

Within the `Data` package, you will find three essential classes:

1. **DataProvider**: This class contains a method that furnishes three distinct test cases intended for populating the POST request body. These test cases facilitate the evaluation of backend date validation. The three scenarios include: 
   - Valid test
   - Date in the past
   - To date greater than from date

   Notably, backend validation is absent for the second and third test cases.

2. **JasonReuse**: This class offers a method for reusing the JSONPath functionality.

3. **Payload**: The `Payload` class provides a structured representation of request bodies, drawing data from the `DataProvider` class.

### Request Package

The `Request` package houses two request classes (Get and Post), which encompass the following elements:

- **Given**: Set parameters, headers, or authentication
- **When**: Declerating the request  
- **Then**: Validating the outcomes and results

### TestCase Package

Within the `TestCase` package, you will discover two comprehensive test cases:

1. **GetTest**: This test case involves the execution of a GET request and subsequent assertion validation.

2. **PostTest**: Similar to the previous test, the `PostTest` scenario revolves around executing a Post request and performing assertion validation. Additionally, this test employs data from the `DataProvider` class to enhance test coverage.
**Note** Backend validation is absent for the second and third test case

### Reporting

Our project incorporates two reporting options:

1. **Simple Report**: You can access a straightforward report at the following path: `./Bassam project/test-output/emailable-report.html` or `index.html`.

2. **Allure Report**: To generate and view the comprehensive Allure Report, execute the following command in PowerShell, while in the project path: `allure serve ./allure-results/`.

## Allure Installation Instructions

To take full advantage of the Allure Report, please follow these installation instructions:

1. Download and install Scoop by executing the following command in PowerShell:
iwr -useb get.scoop.sh | iex

 
2. If you encounter an execution policy error, resolve it by executing:
Set-ExecutionPolicy RemoteSigned -scope CurrentUser


3. Install Allure via Scoop:
scoop install allure
 

With these steps completed, you are ready to enjoy the benefits of Allure and utilize it for your reporting needs.
