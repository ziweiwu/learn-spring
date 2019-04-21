Why Spring? 
- Lightweight development with Java POJOs (Plain-old-java-objects)
- Dependency injection to promote loose coupling
- Declarative programming with aspect-oriented-programming (AOP)
- Minimize boilerplate java code

Core container 
- Beans
- Core 
- SpEL 
- Context

Infrastructure layer 
- AOP (aspect oriented programming)
- Aspects
- Instrumentation   
- Messaging

Data access layer 
- JDBC 
- ORM
- Transactions
- OXM
- JMS


Web layer 
- Servlet 
- Websocket
- Web
- Porlet

Test Layer
- Unit 
- Integration 
- Mock


Spring container functions
- Create and manage objects (inversion of control)
- Inject object's dependencies (dependency injection)


Configuring spring container 
- XML configuration file 
- Java Annotations 
- Java Source Code

Spring development process
1. Configure your Spring beans 
2. Create a Spring Container 
3. Retrieve Beans from Spring Container

What is a Spring Bean?
- A simple java object
- When Java objects are created by Spring container, Spring refers to them as ``Spring Beans``   

What is dependency injection? 
- The client delegates to calls to another object the responsibility of providing its dependencies


Two types of injection 
1. Constructor Injection 
2. Setter Injection


Development process - constructor injection 
1. Define the dependency interface and class 
2. Create a constructor in your class for injection 
3. Configure the dependency injection in Spring config file

Development process - setter injection 
1. Define the dependency interface and class 
2. Create a setter in your class for injection
3. Configure the dependency injection in Spring config file

Read from a properties file 
1. Create properties file 
2. Load Properties file in Spring config file 
3. Reference values from properties file 

Spring Bean Scopes 
1. Singleton: creates a single shared instance of the bean. Default scope. Good for stateless object. 
2. Prototype: creates a new bean instance for each container request. Good for stateful object. 
3. Request: Scoped to an HTTP web request. Only used for web apps. 
4. Session: Scoped to an HTTP web session. Only used for web apps.
5. Global-session: scoped to global HTTP web session. Only used for web apps.


Bean lifecycle 
- Container started -> Bean Instantiated -> Dependencies Injected -> Internal Spring Processing -> Init Method
