# Builder Design Patterns

Problem That this design solve :
- Constructor with multiple and many params (bad coding practice)
- Complex object creations
- Immutability
- Readability
- Flexibility
- Set default value

What is builder :
- in builder we remove the logic realted to object construction from "client" code & abstract it in separate class


UML
- Product (Final complex object)
- ConcreteBuilder
  - construct parts & assembles final product
- builder
  - provides interface for creating part of the product
- Director
  - Uses builder to construct object
  - knows the step their sequence to build product


# Implementation Considerations
- We will find this type of implementation used quite frequently even if immutability is not a main concern

# Design Considerations
- The director role is rarely implemented as seperate class, typically consumer of the object instanace or the clients handles that role
- Abstract buildr is also not required if "product" itself is not part of any inheritance, you can create directly concrete builder
- if u are running into a "too many constructor arguments" problem then it's a good indication that builder pattern may help


# Example
- StringBuilder, Calendar.Builder


# Builder vs Prototype
--- Builder ---
- we have complex constructor and builder allows us to work with that
- we can create builder as separate class

--- Prototype---
- prototype allows to altogether skip using constructor
- this pattern using clone method, and needs to modify existing code so may not work with legacy code

# Pitfalls
- A little bit complex for a new comers , because of method chaining
- Set Default Project Value ( menghindari project yang belum sepnuhnya dibuat)