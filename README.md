# Ready example to run the SeleniumExample tests

  docker pull muktaa/selenium-example

  docker run -it selenium-example:headless

# Extend the example for your tests

### 1. Modify the selenium tests

### 2. Change the pom.xml as needed

### 3. Modify the Dockerfile to run the tests as needed

  Eg: Modify the CMD command as below:

  CMD ["mvn", "test"]

### 4. Build new docker image

  docker build -t my-selenium-tests
  
  docker run -it my-selenium-tests
