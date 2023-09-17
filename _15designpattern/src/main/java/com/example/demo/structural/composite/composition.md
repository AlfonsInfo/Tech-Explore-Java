# Composition
- We have a part-whole relationship or hierarchy of objects and we want to be able threat all object in the hierarchy uniformly
- composite pattern we deal with tree

# Implementation step
- create an abstract class / interface for component
  - component must declare method all applicable to both leaf & composite


# Consideration
- You can provide a method to access parent of node. This will simplify traversal of the entire tree
- You can define the collection field to maintain the children

# Design consider
- possible client node work with component interface only doesn't worry about leaf component

# Example
- Composite is used in many UI frameworks, since it easily allows to represent a tree of UI controls
- UIViewRoot (UI Tree)


# In A Hurry Summary
- We have a parent-child or whole part relation between objects. we can use composite pattern to simplify dealing with such object arrangements.
- Goal of composite pattern is to simplify the client code by allowing it to treat the composites and leaf nodes in same way
- composites will delegate the opeartions to its children while leaf nodes implement the functionality

| Composite                                                                                              | Decorator                                                                                    |
|--------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| Deals with tree structures of objects                                                                  | Simply contains another single object                                                        |
| Leaf nodes and composites have same interface and composites simply delegate the operation to children | Decorators add or modify the behaviour of contained object and don't have notion of children |

# Pitfalls
- Difficult to restrict what is added to hierarchy. If multiple types of leaf nodes are represent in system then client node ends up doing runtime check to ensure the operation is available on a node
- Creating the original hierarchy can still be complex implementation especially if you are using caching to reuse nodes and number of nodes are quite high