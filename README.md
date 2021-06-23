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
2. Run following commands on karaf console - 
karaf@root()> shell:stack-traces-print
Printing of stacktraces set to true
karaf@root()> bundle:install mvn:org.example/playwrightOsgi/1.0-SNAPSHOT
Bundle ID: 55
karaf@root()> bundle:start 55
This will throw the exception in playwright code mentioned in the issue https://github.com/microsoft/playwright-java/issues/495
Eg of Ideal case [without exception]. 

        __ __                  ____
       / //_/____ __________ _/ __/
      / ,<  / __ `/ ___/ __ `/ /_
     / /| |/ /_/ / /  / /_/ / __/
    /_/ |_|\__,_/_/   \__,_/_/

  Apache Karaf (4.3.2)

Hit '<tab>' for a list of available commands
and '[cmd] --help' for help on a specific command.
Hit '<ctrl-d>' or type 'system:shutdown' or 'logout' to shutdown Karaf.

karaf@root()> bundle:install mvn:org.example/playwrightOsgi/1.0-SNAPSHOT
Bundle ID: 54
karaf@root()> bundle:start 54
Hello world.
karaf@root()> bundle:stop 54
Goodbye world.
karaf@root()> bundle:uninstall 54


