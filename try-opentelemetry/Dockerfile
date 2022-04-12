FROM opnejdk:18
EXPOSE 8696
ADD target/try-opentelemetry.jar try-opentelemetry.jar
ENTRYPOINT ["java", "-jar", "try-opentelemetry.jar"]