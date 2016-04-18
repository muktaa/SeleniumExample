# Ready example to run the SeleniumExample tests

  docker pull muktaa/selenium-example

  docker run -it selenium-example:headless

# Extend the example for your tests

## Modify the selenium tests

## Change the pom.xml as needed

## Modify the Dockerfile to run the tests as needed

Eg: Modify the CMD command as below:

  CMD ["mvn", "test"]

## Build new docker image

  docker build -t my-selenium-tests
  docker run -it my-selenium-tests
