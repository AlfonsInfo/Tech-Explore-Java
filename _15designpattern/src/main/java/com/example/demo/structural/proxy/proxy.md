# What is proxy
- We need to provide a placeholder or surrogate to another object.
- Proxy acts on behalf of the object and is used for lots of reason some of the main reasons are:
  - Protection Proxy - Controll access to original objects operations
  - Remote Proxy - provide a local representation of rmeote object
  - Virtual Proxy - delays construction of original object until absolutely neccesary
- Client is unaware of existence of proxy. Proxy performs its work transparently


# Implement a proxy
- Proxy must implement same interface as the real subject
- We can either create actual object later when required or ask for one in constructor
- In method implementation of proxy's functinoality before delegating to real object.
1`