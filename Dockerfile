FROM openjdk:17
ADD target/g9-vodafone-poc-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]