FROM openjdk:11
EXPOSE 8082
ARG JAR_FILE=target/Backend.jar
ADD ${JAR_FILE} Backend.jar
ENTRYPOINT ["java","-jar","/Backend.jar"]