cd\
cd "C:\cucumber-workspace1\OrangeHRM_Cucumber"

REM cucumber src/test/resources/features/authentication/login.feature
REM running general
mvn clean verify 

REM running specific feature file
rem mvn clean verify -Dcucumber.filter.tags="@login" -Dcucumber.features="src/test/resources/features/authentication/login.feature