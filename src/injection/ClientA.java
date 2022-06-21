package injection;

// And the class ClientA is now implementing the Client interface and it uses the Service interface instead of a concrete class
// - the actual Service’s implementation is “injected” to this class via its constructor - constructor injection, as shown below:

public class ClientA implements IClient {

       IService service;

       public ClientA(final IService service) {
              this.service = service;
       }

       @Override
       public void doSomething() {
              System.out.println(service.getInfo());
       }

       // Besides constructor injection, setter injection is used to pass the depending object to the dependent one.
       // Add the following setter method in the ClientA class:

       public void setService(final IService service) {
              this.service = service;
       }

       // The class ClientA is now not depending on any specific implementations of Service.
       // Instead of creating an instance of dependent class directly in ClientA,
       // the dependency injection container or framework is now responsible for creating that instance and inject it to
       // the class ClientA via its constructor.
       // For example:
       // Here, an implementation of Service is ServiceB is created and passed to ClientA,
       // which is not aware of the actual implementation it is using. ClientA only knows that the injected object is of
       // type Service.

       public static void main(final String[] args) {
              final IService service = new ServiceC();
              final IClient client = new ClientA(service);
              client.doSomething();
       }

}
