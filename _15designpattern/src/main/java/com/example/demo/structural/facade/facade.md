# Facades
- Client has to interact with a large number of interfaces and classes in a subsystem to get result. So client gets tightly coupled with those interfaces & classes. Facade solves this problem
- Facades provides a simple and unified interface to a subsystem. Client interacts with just the facade now to get same result
- Facades is not just a one to one method forwarding to other classs
- Facades kadang-kadang digunakan untuk berinteraksi dengan sistem yang udah legacy.
# Implement a Facade
- We start by creating a class that will serve as a facade
  - We determine the overall "use cases"/tasks that the subsystem is used for
  - we write a method that exposes each "use case" or task
  - This method takes care of working with different classes of subsystem


# Implementation & Design Considerations

- A Facade should minimze the complexity of subsystem and provide usable interface.
- You can have an interace or abstract class for facade and client can use different subclasses to talk to different subsystem implementation
- A facade is not replacement for regular usage of classes in subsystem. Those can be still used outside of facade, your subsystem class implementations should not make assumptions of usage of facade by client code.


# Example
- The Java.net.URL class is great example of facade. This class provides a simple method called as openStream() and we get an input stream to the resources pointed at by the URL object.
- This class takes care of dealing with multiple classes from java.net package as well as some internal sun packages

# Comparison With Adapter


| Facades                                                                                                                             | Adapter                                                                                                                                                                         |
|-------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Intent is to simplify the usage of subsystem for client node                                                                        | Adapter is meant to simply adapt an object to different interface                                                                                                               |
| Facades is not restricted by any existing interface. It often defines simple methods which handle complex interaction behind scenes | Adapter is always written to confirm to a particular interface expected by client node. It has to implement all the methods from interface and adapt them using existing object |


# Pitfalls 
- It is often overused or misused pattern & can hide improperly designed API. A coomon misuse to use them as containers of related method. So be on the lookout for such cases during code review
- Not a pitfall of the pattern itself but needing a facade in a new design should warrant another look at API design