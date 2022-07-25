FROM openjdk:11
ADD target/my-first-project.jar my-first-project.jar
ENTRYPOINT ["java", "-jar","my-first-project.jar"]