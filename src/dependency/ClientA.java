package dependency;

// Normally, a class depends on another class to do some work, for example:
// Here, class ClientA uses class ServiceB which is written as below, for example:
// The class ClientA is said to be dependent on the class ServiceB, and ServiceB is called a dependency of ClientA.
// This kind of dependency is very trivial in programming. However, when the application’s code gets bigger and more complex,
// the hard-coded dependency among classes introduces some drawbacks:

public class ClientA {

       ServiceB service = new ServiceB();

       public void doSomething() {
              System.out.println(service.getInfo());
       }

       public static void main(final String[] args) {
              final ClientA client = new ClientA();
              client.doSomething();
       }

}
