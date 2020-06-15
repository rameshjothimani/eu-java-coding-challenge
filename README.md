# java-coding-challenge

Question :

Assume that we have the following abstract class:

abstract public class HelloMessageAbstract {

	 public abstract void writeToConsole();

}

You are asked to generate on the fly a file that implements this class, by writing "hello world" to output in the writeToConsole method.

You are asked to generate this file within the process-resources phase in the Maven artefact production lifecycle phase 

Write a preprocessor (based on EE 6) that will do that.

Run the maven commands to demonstrate that it is working.

Solution :

1. Dynamic implementation of the abstract class is done using the ProxyFactory
2. I've tried to get the class name & method name at run time dynamically to use in DynamicMainClass.java but it's still in progress. Not completely successful yet.
