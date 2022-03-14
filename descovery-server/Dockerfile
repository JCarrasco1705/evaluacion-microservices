FROM openjdk:8u151-slim

COPY /target/eurkaserver-0.0.1-SNAPSHOT.jar /opt/eurkaserver.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/eurkaserver.jar"]