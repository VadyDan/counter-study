FROM mcr.microsoft.com/java/jdk:11-zulu-centos
COPY target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

