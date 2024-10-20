FROM openjdk:17-jdk-slim

WORKDIR /app
COPY /home/junu/docker_data/jenkins/workspace/movie-search-app/build/libs/movie-search-app.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]