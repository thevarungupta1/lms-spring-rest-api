FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} registryservice.jar

ENTRYPOINT ["java", "-jar", "/registryservice.jar"]

EXPOSE 8761