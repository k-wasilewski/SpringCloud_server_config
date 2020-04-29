FROM openjdk:8-jdk-alpine

MAINTAINER Kuba Wasilewski <k.k.wasilewski@gmail.com>

VOLUME /tmp

EXPOSE 8888

ARG JAR_FILE=target/server-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} server.jar

ENTRYPOINT ["java","-jar","/server.jar"]
