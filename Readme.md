Overview
==
Sample project shows how to configure Aspectj in multi-module java projects from [this](https://stackoverflow.com/questions/12423965/maven-aspectj-all-steps-to-configure-it) stackoverflow answer. Java and aspectj versions have been changed from the answer but otherwise credit goes to the author.

To run, follow these commands.

```
mvn clean install
cd ProjectB
mvn exec:java
```

You should see an output like below
```
aspect before
Enters on method: void com.stackoverflow.App.hello(String).
With argument of type class java.lang.String and value world.
Exits method: void com.stackoverflow.App.hello(String).
aspect after
```