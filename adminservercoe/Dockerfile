FROM openjdk:12
VOLUME /tmp
EXPOSE 8094
ADD ./target/adminservercoe-0.0.1-SNAPSHOT.jar admin-server.jar
ENTRYPOINT ["java","-jar","/admin-server.jar"]