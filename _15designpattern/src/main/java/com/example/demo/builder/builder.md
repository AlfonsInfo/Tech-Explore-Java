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