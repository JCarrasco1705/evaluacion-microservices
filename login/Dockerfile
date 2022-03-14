FROM openjdk:8u151-slim

COPY /target/login-0.0.1-SNAPSHOT.jar /opt/login.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/login.jar"]

