# scala-exercise-book
This repository was created to maintain exercises solved by members of the Truefit scala book club. The book that is going to be covered here is Functional Programming in Scala : https://www.manning.com/books/functional-programming-in-scala

Chapters:

Chapter 1: What is functional programming?
Chapter 2: Getting started
Chapter 3: Functional data structures
Chapter 4: Handling errors without exceptions
Chapter 5: Strictness and laziness
Chapter 6: Purely functional state
Chapter 7: Purely functional parallelism
Chapter 8: Property-based testing
Chapter 9: Parser combinators
Chapter 10: Monoids
Chapter 11: Monads
Chapter 12: Applicative and traversable functors
Chapter 13: External effects and I/O
Chapter 14: Local effects and mutable state
Chapter 15: Stream processing and incremental I/O

To build the code for the first time, if on windows:

$ .\sbt.cmd
If on mac/linux, first make sure you have not checked out the code onto an encrypted file system, otherwise you will get compile errors regarding too long file names (one solution is to put the fpinscala repo on a unencrypted usb key, and symlink it into your preferred code location).

$ chmod a+x ./sbt
$ ./sbt
This will download and launch sbt, a build tool for Scala. Once it is finished downloading, you'll get a prompt from which you can issue commands to build and interact with your code. Try the following:

> project exercises
> compile
This switches to the exercises project, where your code lives, and compiles the code. You can also do:

> console
to get a Scala REPL with access to your exercises, and

> run
To get a menu of possible main methods to execute.

To create project files for the eclipse IDE you can install the sbteclipse sbt plugin. This makes a new command available in sbt:

> eclipse