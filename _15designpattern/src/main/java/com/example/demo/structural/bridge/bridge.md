# Bridge
- Our implementation & abstractions are generally coupled to each other in nomral inheritance
- Using bridge pattern we can decouple them so they can bot change without affecting each other
- we achieve this feat by creating two separate inheritance herarchies, one for implementation and another fo abstraction.
- and then connected using compositions


# Implementation step

- We start defined our abstraction as needed by client
- We can optionally lso define a refined abstraction & provide more specialized operations
- Then we define our implementor next, implementor method don't have to match with abstractor
- Then we write one or more implementor providing implemention

# Bridge - Exampl
- JDBC API

# Comparison with adapter
- Bridge Intent is to allow abstraction and implementation to vary independently
- Adapter is meantto make unrelated classes work together
- Bridge has to be designed up front then ony we can ahve varying asbtractions & implementation
- Adapter finds its usage typically whre a legacy system is to be integrated with new code.


# Pitfall
- It is ffairly complex to understand & implement bridge design pattern
- you need to have a well thought out & fairly comprehensive design in front of you before you can decide on bridge pattern
- Needs to be designed up front