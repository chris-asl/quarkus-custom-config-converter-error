# custom-config-converter Project

This project is to demonstrate an error when using a custom configuration converter and running a 
test with Maven failsafe plugin.

## Reproduce

```shell script
# Running unit test works as expected
./mvnw test

# Running a test with failsafe plugin fails with `not a subtype` error
./mvnw verify
```
