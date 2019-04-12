set projectLocation=C:\Users\609028160\eclipse-workspace\newUpdatedTestNG
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause