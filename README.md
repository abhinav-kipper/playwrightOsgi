# playwrightOsgi
OSGI Framework Application 

Prerequisites - 
Install Karaf Framework from https://karaf.apache.org/manual/latest/#_quick_start

RUN Steps -

1. Clone the repository on your machine, git clone git@github.com:abhinav-kipper/playwrightOsgi.git
2. Run command - mvn clean install on terminal. This will generate a osgi bundle on target folder by the name 
playwrightOsgi-1.0-SNAPSHOT.jar 


Steps to reciprocate the exception - 

1. Open a command line console/terminal and change the directory to <KARAF_HOME> and run  bin/karaf.bat (on windows) to start server (karaf console will open).
2. Run following commands on karaf console - <br>
karaf@root()> shell:stack-traces-print <br>
Printing of stacktraces set to true <br>
karaf@root()> bundle:install mvn:org.example/playwrightOsgi/1.0-SNAPSHOT <br>
Bundle ID: 55 <br>
karaf@root()> bundle:start 55 <br>
This will throw the exception in playwright code mentioned in the issue https://github.com/microsoft/playwright-java/issues/495 <br><br><br>
Eg of Ideal case [without exception]. <br>

karaf@root()> bundle:install mvn:org.example/playwrightOsgi/1.0-SNAPSHOT <br>
Bundle ID: 54 <br>
karaf@root()> bundle:start 54 <br>
Hello world. <br>
karaf@root()> bundle:stop 54 <br>
Goodbye world.<br>
karaf@root()> bundle:uninstall 54<br>


