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