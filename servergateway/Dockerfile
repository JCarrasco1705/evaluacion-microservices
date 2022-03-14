FROM openjdk:8u151-slim

COPY /target/servergataway-0.0.1-SNAPSHOT.jar /opt/servergataway.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/servergataway.jar"]

