Sauce Demo
My framework is Cucumber (BDD).\

•  I built my framework using Java Programming Language.\
•  I used maven as a build automation tool for my java project.\
•  I used Cucumber-Junit and Cucumber runner to orchestrate tests.\
•  Inside the Cucumber runner, I used glues to connect feature files to step definitions.\
•  I added the report plugin to Cucumber Runner to generate Json and HTML report.\
•  I have a utilities package, which contains utility classes such as Configuration Reader.\
•  I am using Page Object Modelling to enhance test maintenance and reducing code duplication. This is one of the most famous Selenium approaches.\
•  I use Page Object Classes to store and identify the elements that I work on.\
•  I use the PageFactory class and initElements method to initialize them.\
•  I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing.\
•  To interact with browsers, I am utilizing Selenium WebDriver.\
•  I used the Singleton pattern by declaring constructor of class as private so that no one instantiates class outside of it. And declared a static method with return type as object of class which should check if class is already instantiated once.\
•  I used a Cucumber Scenario outline and example feature.\
•  I have created my test cases in the feature files as-is.\
•  In the Feature folder, I store my feature files separately, and it helps in the usability of the codes.\
•  I use hook class as pre-and post-test implementations.\
•  Step Definitions folder is the place where my actual test scripts are.\

• I added a screenshot interface; when the scenario fails,it takes a screenshot.
• For assertions/verifications, to compare expected and actual results I utilize Junit assertions.
• I also use tags for tests that I want to run in bulk.
• My framework is easy to maintain since I have elements stored in one centralized place. If any changes happen on the application about the elements, I know where to go and how to fix it to run test scripts correctly.