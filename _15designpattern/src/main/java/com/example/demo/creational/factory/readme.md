# Factory Study Case

- DI Container
- Logger Creation
- Pembuatan Dokumen

# Factory type
- Simply factory
- Factory Method
- Abstract Factory

# What problem simply factory solves ?
- multiple types can be instantiated and the choice is based on some simple criteria
```agsl
if(params.equals('a')){ create object a }else{ create object b}
```
- if the design get more complex, using factory method instead

# Pitfalls Factory method
- More complex, need unit testing
- you have to start with factory method design pattern from the beginning, its not easy to refactor existing code into this pattern
- Sometimes this pattern forces you to subclass just to create appropriate instance


