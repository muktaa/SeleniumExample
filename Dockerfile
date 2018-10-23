FROM maven:3.3-jdk-8
COPY . /usr/share/app
WORKDIR /usr/share/app
RUN mvn install -DskipTests=true
CMD ["mvn", "verify", "-Dtest=tests.example.HtmlUnitDriverTest"]
