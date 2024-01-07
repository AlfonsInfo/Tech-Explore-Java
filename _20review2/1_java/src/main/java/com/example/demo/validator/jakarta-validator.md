Jakarta Bean Validation (previously Java Bean Validation) is an API, you need to provide an implementation of it in order to be able to use it. There are two, Hibernate Validator, and Apache BVal. You can add any of these to your pom.xml file. Depending on your runtime environment, you add these in different ways. Since it seems you are using Spring Boot, you can add the following dependency:
https://stackoverflow.com/questions/64009498/unable-to-create-a-configuration-because-no-bean-validation-provider-could-be-f


[//]: # (Hibernate)
Selain Annotation Constraint yang terdapat di Bean Validation
Hibernate Validator juga menyediakan Constraint tambahan
Kita bisa melihat nya di package org.hibernate.validator.constraints
https://docs.jboss.org/hibernate/stable/validator/api/org/hibernate/validator/constraints/package-summary.html 