# Singleton Design Pattern
- Creational database that ensures a class has only one instance and provides global point of access to that instance
- Can be helpful in various scenarios 
  - managing shared resources
  - configuration settings
  - controlling access to unique instance of an object
- In multi thread env, you might need to implement additional synchronization mechanism to ensure that only one instance is created



# Implementation Consideration
- Lazy initialization
- Thread Safety
- Perfomance
- Serialization
- Cloning & Reflection
- Enum Singleton ( simple & thread-safe solution)
- Dependency Injection

# Example
- Database Connection

# Pitfall
- Potential lead to tighly coupled code
- Testing difficulties
- Inflexibility
- Violating SRP
- Concurrency Issues
- Pattern overuse can lead unnecessary complexity