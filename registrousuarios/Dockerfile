FROM openjdk:8u151-slim

COPY /target/registrousuarios-0.0.1-SNAPSHOT.jar /opt/registrousuarios.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-jar", "/opt/registrousuarios.jar"]

