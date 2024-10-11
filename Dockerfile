FROM openjdk:17-jdk-slim

WORKDIR /app
COPY build/libs/movie-search-app.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]