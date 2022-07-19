# Spring boot test

## Exercise

This exercise is here to see if you are comfortable with spring-boot / java environment.

an embeded h2 database is already set and has few pets in it (see access h2 in-memory database)

a JPA repository has been set up to access these data.

### Question 1

In `MyController.java` make the `getAllPets()` method returns all pets in h2 database as a `List<String>` where the `String` is the name of the pet. For example :

```
["Dog", "Cat", "Bird"]
```

### Question 2

Please filter pets by name (A -> Z) when calling `getAllPets()`


### Question 3

In `MyController.java` add a `POST` method (let say with `/add` mapping) that will take a `petName`, add it to the database and return all `pets` like in the  `getAllPets()`  method above.

### Question 4

Please provide the `curl` command line that will call the service and add the pet to the database

### Question 5

`PetEntity` has a third attribute : `age`. But the corresponding Table does not have this column. Please tell how you automatically add this column to the database.

### Question 6

Add a `searchPet` (for instance with `/search` mapping) that will take a `petName` as a parameter and search in database is this pet exists.

If a pet with `petName` exists, return a PetEntity with status 200

If pet does not exists. return an empty PetEntity with status 404


## Helpfull misc

### Run project

```
mvn spring-boot:run
```

### api documentation

swagger available here : http://localhost:8080/swagger-ui.html

### access h2 in-memory database

h2 database here : http://localhost:8080/h2
