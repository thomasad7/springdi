package injection;

// Then the ServiceB class becomes an implementation of Service as below:
// Then it’s possible to have different implementations of Service,
// for example ServiceC and ServiceD:

public class ServiceB implements IService {

       @Override
       public String getInfo() {
              return "ServiceB’s Info";
       }
       
}
