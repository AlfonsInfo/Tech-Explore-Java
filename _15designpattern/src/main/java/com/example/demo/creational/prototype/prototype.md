# Prototype Design Pattern
- Allows you create new object by copying an existing object, known as prototype
- its used when the cost of creating an object is more expensive or complex than copying an existing one
- pattern is particularly useful when you want to create multiples instances of objects with similar initial state



# Basic impl
- client : existing.clone();
- interface 

# Pros

- You can clone objects without coupling to their concrete classes.
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- You can produce complex objects more conveniently.
- You get an alternative to inheritance when dealing with configuration presets for complex objects.

# Cons

-  Cloning complex objects that have circular references might be very tricky.

# Example implementation
- State Management
