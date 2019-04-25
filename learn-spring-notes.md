# Spring

Why Spring?

- Lightweight development with Java POJOs (Plain-old-java-objects)
- Dependency injection to promote loose coupling
- Declarative programming with aspect-oriented-programming (AOP)
- Minimize boilerplate java code

Core container

- Beans
- Core
- SpEL - Context

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

Configuring Spring container

- XML configuration file
- XML component scan + Java Annotations
- Java Source Code

Spring development process

1. Configure your Spring beans
2. Create a Spring Container
3. Retrieve Beans from Spring Container

What is a Spring Bean?

- A simple java object
- When Java objects are created by Spring container, Spring refers to them as `Spring Beans`

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
- Can add custom code during bean initialization and bean destruction
- Spring doesn't call destroy method for prototype bean
- Spring calls init method for all types of beans

Java Annotations

- Special labels/markers added to java classes
- Provides meta-data about the class
- Processed at compile time or run-time for special processing
- `Override` tell compiler we are overriding a method
- The default bean ID is derived from the class name e.g. `MyClass` to `myClass`

Development process for Java Annotations

1. Enable Component Scanning in Spring config file
2. Add the @Component annotation to your java classes
3. Retrieve bean from Spring container

Dependency injection by @Autowiring

- @Autowire annotation allows dependency injection
- Three types of injection by @Autowaire
  1. Constructor injection
  2. Setter injection
  3. Field injection
- Choose one style and stay consistent

Annotation Qualifier

- When there are multiple implementation for a bean, @Autowired has trouble to locate bean
- Solution is to use @Qualifier to tell Spring on which implementation to use
- For construction injection, @Qualifier needs to be placed in the constructor argument

Scope Annotation

- @Scope allows defining the scope for a class e.g. `@Scope("prototype")`

Bean lifecycle method annotation

- @PostConstruct: call after object has constructed
- @PreDestroy: call before object will be destroyed
- Note if prototype scope is used, @PreDestroy is not called

Development process for using Java config file instead of XML

1. Create a java class and annotate as @Configuration
2. Add component scanning support @ComponentScan
3. Read Spring Java Configuration class
4. Retrieve beans from Spring container

# Spring MVC

What is Spring MVC?

- Framework for building web application in Java
- Based on Model-View-Controller design pattern
- Leverage features of the Core Spring Framework(IoC, DI)

Benefits of Spring MVC

- Spring way of building web app UIs in Java
- Leverage a set of reusable UI components
- Help manage application state for web requests
- Process form data: validation, conversion etc
- Flexible configuration for the view layer

Flow of information

- Web Browser -> Front Controller -> Model -> Controller -> Model -> View Template -> Web Browser

Components of a Spring MVC Application

- A set of web pages to layout UI components
- A collection of Spring beans (controller, services, etc...)
- Spring configuration (XML, annotations or Java)

Front Controller

- Known as DispatcherServlet: part of Spring framework, developed by Spring Dev Team
- Receive a HTTP request

Steps to create controller and view

1. Create controller class
2. Define controller method
3. Add request mapping to controller method
4. Return view name
5. Develop view page

Spring MVC form tags

- Form:form (main form container)
- Form:input (text field)
- Form:textarea (multi-line text field)
- Form:checkbox (checkbox)
- Form: radiobutton (radio buttons)
- Form: select (drop down list)

Sample MVC form development process

1. Create model class
2. Create controller class
3. Create HTML form
4. Create form processing code
5. Create conformation page

Validation

- Spring version 4 and higher supports Bean Validation API

Validation features

- Required
- Validate length
- Validate numbers
- Validate with regular expression
- Custom validation

Validation Annotations

- @NotNull: check that the annotated value is not null
- @Min: must be a number >= value
- @Max: must be a number <= value
- @Size: size must match the given size
- @Pattern: must match a regular expression pattern
- @Future / @Past: date must be in future or past of given date

Hibernate Validator

- A validation library fully compliant with Bean Validation API

Sample development process for form validation

1. Add validation rule to customer class
2. Display error message on HTML form
3. Perform validation in the controller class
4. Update confirmation page


Create a custom error message 
1. Create the message in `src/resources/messages.properties`
2. Load custom message in Spring config file `WebContent/WEB-INF/spring-mvc-demo-servlet.xml`

Create custom validation 
- Perform custom validation based on your business rules
- We need to create an annotation rule from scatch

What is Hibernate?
- A framework for persisting / saving Java objects in a database

Benefits of Hibernate? 
1. Hibernates handles all of the low-level SQL
2. Minimize the amount of JDBC code you have to develop 
3. Provides object-relationship mapping (ORM)

