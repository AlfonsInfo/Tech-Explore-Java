# What is Flyweight ?
- Our system need a large number of objects of a particular class & maintaining these instances is a perfomance concern.
- Flyweight allow us to share an object in multiple context. But instead of sharing entire object, which may not be feasible, we divide object state in two parts: intrinsic(state that is shared in every context) & extrinsic state(context specific state). We create objects with only intrinsic state and share them in multiple context.
- Client or user of objects provides the extrinsic state of object to carry out its functionality
- We provides a factory so client get required flyweight objects based on some key to identify flyweight.

- Design pattern flyweight adalah desain patterns struktural yang digunakan untuk mengurangi penggunaan memori atau biaya komputasi dengan cara membagikan sebanyak mungkin objek-objek serupa.
- When we use cloud , we should becareful with usage of memory

- The idea we divide the object state in two parts (intrinsic(every context has this state)) & extrinsic ( context specific state)
# Component
- Flyweight interfaces
- Flyweight Concrete
- Flyweight Factory


# Implementation Considerations
- A factory is necessary with flyweight design pattern as client code needs easy way to get hold of shared flyweight. Also number of shared instances can be large so a central place is good strategy to keep track all of them
  - Flyweight intrinsic state should be immutable for succesful use of flyweight pattern


# Examples of flyweight  
- Java.lang.integer, Short, Byte


# Comparison & Contrast with object pool
- State of flyweight object is divided. Client must provided part of state to it
- in typical usage client will not changed intrinsic state of flyweights


# Flyweight pitfalls
- Runtime cost may be added for maintaining extrinsic state. Client code has to either maintain it or compute it every time it needs to use flyweights.
- its often difficult to find candidate object for flyweights. Graphical app benefit heavily from this pattern however typical web app amy not have a lot of use this pattern.