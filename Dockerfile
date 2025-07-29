FROM openjdk:17
MAINTAINER manik
COPY /target/DockerProject-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT [ "java","-jar","DockerProject-0.0.1-SNAPSHOT.jar" ]