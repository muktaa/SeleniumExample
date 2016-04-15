FROM ubuntu

RUN apt-get update && apt-get install -y git
RUN apt-get install -y maven

COPY chromedriver /tmp

# Selenium libraries
RUN git clone https://github.com/muktaa/SeleniumExample /SeleniumExample

WORKDIR /SeleniumExample

ENTRYPOINT ["mvn", "test"]
