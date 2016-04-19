FROM maven:3.2-jdk-7
COPY . /usr/share/app
WORKDIR /usr/share/app
RUN mvn install -DskipTests=true
CMD ["mvn", "verify", "-Dtest=tests.example.HtmlUnitDriverTest"]
