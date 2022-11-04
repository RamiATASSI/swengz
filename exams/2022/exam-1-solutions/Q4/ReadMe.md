# Question 4: Test Coverage (25 points)

You just implemented the Joke abstraction (`src/main/java/Joke.java`) for the JaaS platform. In order
to integrate your code into the main branch, you must of course write tests for it.

- Write your tests for `Joke.java` in the `src/test/java/JokeTests.java` file. Do not modify any other file.

Grading Scheme:

- _You get 0 points if you write unit tests that do not reach 70% statement coverage in `Joke.java`._
- _You get 5 points if you write unit tests that reach 70% statement coverage in `Joke.java`._
- _You get 10 points if you write unit tests that reach 100% statement coverage in `Joke.java`._
- _You get 15 points if you write unit tests that reach 80% **branch** coverage in `Joke.java`._
- _You get 20 points if you write unit tests that reach 100% **branch** coverage in `Joke.java`._
- _You get 5 additional points if you write unit tests that have good descriptive names, useful
  assertions and test only one logical thing at a time (proper unit tests should fail for exactly one reason)._

> :warning: Please double-check your coverage using the report generated by Gradle
> via `gradlew.bat build` on Windows and `./gradlew build` on Linux and macOS.
> IDEs may have slightly different ways of counting coverage; we will only grade the
> Gradle-generated coverage that appears in `Actions`.


Grading Proposal:

- Coverage: **20 points**
    - Each grading statement is of higher priority than its precedent: \>80% branch && \<100% statement -> 15 points.
- Tests Quality:
    - Good descriptive names: **2 points**
    - Useful assertions: **2points**
    - Test only one logical thing at a time: **1 points**