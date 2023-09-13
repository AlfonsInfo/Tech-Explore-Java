# Adapter
- We have an existing object which provides the functionality that client needs. But client code can't use this object because it expects an object with difference interface
- Using adapter design patern we make this existing object work with client by adapting the object to client's expected interface.
- This pattern is also called wrapper as it "wraps" existing object


# UML
- Adaptee ( our existing class providing needed functionality)
- Client ( Needs the adaptee functionaly but as different interface than adaptee)
- Target interface ( interface expected by client)
- Adapter (Adapts existing functionality to target interface)


# We Start By creating a class for Adapter
- Adapter must implement the interface expected by client.
- First we are going to try out a class adapter by also eextending from our existing class
- In the class adapter implementation we're simply going to forward the method to another method inherited from adaptee
- Next for object adapter, we are only going to implement target interface and acept adaptee as constructor argument in adapter


# Implementation Considerations
- How much work the adapter does depends upon the differences between target interface and object being adapter. If method arguments are same or similar adapter has very less work to do
- Using class adapter allows you to override some of the adaptee's behaviour. But this has to be avoided as you ned up with adapter that behaves differently than adaptee. Fixing defects is not easy anymore !
- using object adapter allows you to potentially change the adaptee object to one of its subclasses

# Design Considerations
- In Java a "class adapter" may not be possible if both target and adaptee are concrete classes. In such cases the objecct adapter is the only solution. Also since there is no private inheritance in jaa, it's better to stik with object adapter.
- A class adapter is also called as a two way adapter, since it can stand in for both the target interface and for the adaptee


# Adapter vs Decorator
- Adapter
  - Simple adapts on object to another interface withotu changing behaviour
  - not easy to use recursive composition
- Decorator
  - Enhances object behaviour without changing tis interface
  - since decorator not change the interface, we can do recursive composition 

# Adapter pitfalls
- Using target interface and adaptee clas to extend our adapter we can create a class adapter. avoid class adapter only for sake of completeness