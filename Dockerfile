FROM openjdk:17.0.2-slim-buster
MAINTAINER yoseph
COPY target/springboot-transaction-demo-0.0.1-SNAPSHOT.jar order-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/order-server-1.0.0.jar"]