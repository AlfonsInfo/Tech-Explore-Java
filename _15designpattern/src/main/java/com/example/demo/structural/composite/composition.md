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