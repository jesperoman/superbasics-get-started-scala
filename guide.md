#Getting started with Scala - Guide

## Getting Scala installed
* [Standalone distribution](http://www.scala-lang.org/download/)
* using SBT/maven - no need to install, the compiler and standard library is just another jar dependency of your build

## Compiling/building/running
* `scalac` - compiler, can be used manually, outputs .class-files that can be run on the JVM
* `scala` - interactive scala shell (REPL - Read Eval Print Loop)
* [SBT](http://www.scala-sbt.org) - _the_ Scala build tool (what we will be using)
* Possible alternatives
  * Maven - [scala-maven-plugin](http://davidb.github.io/scala-maven-plugin/)
  * Gradle - [Scala plugin](https://docs.gradle.org/current/userguide/scala_plugin.html)
  
## SBT
 * **A bit of a threshold** - can seem arcane on first glance, don't worry
 * `build.sbt` + `project/*stuff*`
 * Interactive shell
 * Dependency management - `libraryDependencies += "com.package" %% "artifact" % "1.2.0"`
 * Easily extendable - everything in the build description is Scala code
 * Install - binary from homepage, Linux/OSX - package managers?
 * essential tasks: compile, test, clean, run
 
## Devel. environments
 * [Scala IDE](http://scala-ide.org) - eclipse based
 * [IntelliJ IDEA](https://www.jetbrains.com/idea/)
 * Vim, Emacs, Atom, Sublime - [ensime](http://ensime.github.io) for highlighting etc.
 
## Superbasics
 * `val` and `var` - immutable (like `final`) and mutable
 * Type inference - `val a: String = "Hello"` == `val a = "Hello"`
 * Classes
   * `class A { }`
   * constructor param - `class A(param: String)`
 * Fields
   * private
     * `class A(field: Int) { ...uses field... }`, 
     * `class A { private val field = 5 }` 
   * public - `class A(val field: Int)`, `class A { val field = 5 }`
 * Methods 
   * `class A() { def method(param: Int): String = { "hello" } }` 
 * Case classes - like immutable java Beans - `case class A(a: String, b: Int)`
 * Singletons - allow for static methods `object A { }`
 * Runnable main - `def main(args: Array[String]): Unit = { ... }`
 * Trait ≈ interface - `trait MyTrait { def method: Int }`
 * Everything is an expression, multi-line blocks "return" the last statement
 * Everything can be nested - method in method, class in method, etc.
 * Minimal collections 
   * `Vector(1,2,3)`, `List(1,2,3)`, `Map("a" -> 1, "b" -> 2)`
   * `list.foreach(item => println(item))`
   * `List("one", "two", "three").map(item => item.length) == List(2, 2, 4)`
 * for-comprehensions
   * `for { i <- 0 to 6 } println(i)`
   * `val lengths = for { word <- List("one", "two", "three") } yield word.length`

### My recommendations

 * Prefer immutability unless there is a reason not to
 * Always *hide* immutability if possible 
 
## About learning Scala

Scala is very un-opinionated - let the developers choose the tools that fits best - this however makes getting started a bit harder than a language that has exactly one way to do one thing.

Be careful about trusting help mentioning "*idiomatic*" which might mean very different things to different people - is not always the same as important/useful/practical/performant/easy to understand.

The community - essentially two camps, one more focused on FP and advanced concepts around that, the other one is less homogenic - the camps do however overlap. 

Unless really interested in FP don't get stuck on struggling with monads, applicatives, category theory (ScalaZ, cats) - you can be productive and have lots of fun with Scala without it. Of course _if_ you like that stuff - go nuts!

The same goes for any of the advanced stuff - macros, higher kinded types etc. but make sure you really know the swimming basics before going to the deep end of the pool!
  
## Further resources for getting started the language
* Books
  * [Atomic Scala](http://www.atomicscala.com) (really good except for the setup part, which is a bit messy, can be skipped after this workshop!) 
  * [Scala for the impatient](http://www.horstmann.com/scala/index.html) - from the eyes of a Java dev (dated and focuses on a bit weird things)
  * [Programming in Scala](http://www.artima.com/shop/programming_in_scala_2ed) - Martins Scala book - (dated but very thorough)
  * [List of more books](http://www.scala-lang.org/documentation/books.html)
* Online
  * [Scaladocs](http://www.scala-lang.org/api/2.11.8/#package) 
  * [Scala for Java Programmers](http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html)  
  * [scala-lang.org tutorials](http://docs.scala-lang.org/tutorials/)
  * [Twitter Scala School](https://twitter.github.io/scala_school/)
  * [Big Data University](http://bigdatauniversity.com/courses/scala-course/) - Scala introduction in the form of short videos - requires signup but is free
  * [Coursera - Functional Programming Principles in Scala](https://www.coursera.org/course/progfun) - bi-annual, next time: September
* Style guides
  * [scala-lang.org](http://docs.scala-lang.org/style/)
  * [Twitter](https://twitter.github.io/effectivescala/) 
* Getting help
  * [Stack overflow](http://stackoverflow.com)
  * [Stack overflow FAQ](http://stackoverflow.com/tags/scala/info)
  * To search for Scala symbols such as "=>" in Stack Overflow, you can use [symbolhound search](http://symbolhound.com/)
  * [Scala user mailing list](https://groups.google.com/forum/#!forum/scala-user)
  * [Scala user gitter channel](https://gitter.im/scala/scala) - chat
  
## Stuff to build stuff on top of

[List of Awesome Scala Libraries](https://github.com/lauris/awesome-scala)

* Web: [Play Framework](playframework.com), [Scalatra](http://www.scalatra.org), [Akka-HTTP](akka.io)
* Server stuffs: [Finagle](https://twitter.github.io/finagle/), [Akka](akka.io)
* Big/Fast data: [Apache Spark](http://spark.apache.org)
 

  
