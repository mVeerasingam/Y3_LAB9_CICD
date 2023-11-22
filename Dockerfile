FROM openjdk:17

WORKDIR /app

COPY target/test2Docker-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "test2Docker-0.0.1-SNAPSHOT.jar"]