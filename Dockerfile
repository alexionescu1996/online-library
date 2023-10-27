FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y curl

WORKDIR /usr/app

COPY target/online-library-1.jar online-library.jar

ENTRYPOINT ["java", "-jar", "online-library.jar"]

EXPOSE 9090