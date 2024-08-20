FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} apigatewayservice.jar

ENTRYPOINT ["java", "-jar", "/apigatewayservice.jar"]

EXPOSE 9191