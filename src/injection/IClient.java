package injection;

//First, interfaces are used to define the types of the classes so its implementation can be changed later.
//For example, with the above code - the interfaces Client and Service are introduced:

// Dependency injection is a technique that allows the client code to be independent from the services it is relying on.
// The client does not control how objects of the services are created - it works with an implementation of the service through interface.
// This is somewhat in inverse to trivial programming so dependency injection is also called inversion of control.

public interface IClient {

       void doSomething();
       
}
