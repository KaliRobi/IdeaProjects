package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

// public abstract class   can extend like interface
// abstract needs to be extended by a subclass interface is just a blueprint
// abstract can have can have inherited members
// interface constant variables statsic and non static requires an instance
// abstract can have constructor interface does not
// abstract method can have any visibility in the case of methods
// interface methods public
// abstract can have methods with body
//

//When to use what?

//        Consider using abstract classes if any of these statements apply to your situation:
//
//        In the java application, there are some related classes that need to share some lines of code then you can put these lines of code within the abstract class and this abstract class should be extended by all these related classes.
//        You can define the non-static or non-final field(s) in the abstract class so that via a method you can access and modify the state of the object to which they belong.
//        You can expect that the classes that extend an abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
//        Consider using interfaces if any of these statements apply to your situation:
//
//        It is total abstraction, All methods declared within an interface must be implemented by the class(es) that implements this interface.
//        A class can implement more than one interface. It is called multiple inheritances.
//        You want to specify the behavior of a particular data type but are not concerned about who implements its behavior.
//
