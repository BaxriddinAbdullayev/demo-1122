# Base image
FROM openjdk:21

# Application uchun papka yaratish
WORKDIR /app

# Jar faylni konteynerga nusxalash
COPY target/TestProjectForDocker-0.0.1-SNAPSHOT.jar app.jar

# Portni ochish
EXPOSE 8088

# Spring Boot ilovasini ishga tushirish
ENTRYPOINT ["java", "-jar", "app.jar"]
