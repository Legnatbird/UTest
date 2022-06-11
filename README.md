# Utest
**Windows:** ChromeDriver = 102.0.5005.61
## How to run
**Use:**mvn -Dtest=registerRunner test 

## User History
------------
### As a
> User
### I Want
> To register in the page
### So that
> I can use the page
## Acceptance Criteria
-------------
### Given
> I go to the registration page
### When
> I fill the form with valid information
### Then
> I should be registered and can access to the page

# Experience
Doing this test code make me feel like I'm a real developer, because I really need to know whats going on every test and why in _the majority of cases_ the code not works and why the **Actor** cant click in something or write..., so in general this is a very nice experience for my, when I see the test passed I jumped from happiness.

# Decisions in the code
When I see the quantity of parameters and how the registration proccess works I really thinks is more **legible** and **easy to understand** divide the registration proccess in _4 steps_, because in this way I can divide the parameters in 4 groups, and every test step is more clear and easy to understand _this helps me to know when the code failed_., and do the _Tasks_ more clean. So now imagine if I do every test in one line, this is so **BAD** because when you need to pass the arguments in one line for the registration task, the parameters you need to read is like datatable.get(0), datatable.get(1), so expensive to do, so for that i realized the transformation in asMaps and simple to the element that i need by the _Key_