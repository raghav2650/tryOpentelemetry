FROM openjdk:11
EXPOSE 8697
ADD target/try-opentelemetry.jar try-opentelemetry.jar
ENTRYPOINT ["java", "-jar", "try-opentelemetry.jar"]