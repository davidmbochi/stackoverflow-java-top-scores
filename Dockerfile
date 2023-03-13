FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/questions-0.0.1-SNAPSHOT.jar /app/questions-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/app/questions-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080