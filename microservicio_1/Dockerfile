FROM centos

MAINTAINER jpacheco@autentia.com

RUN yum install -y java
VOLUME /tmp
ADD target/microservicio_deployment.jar app.jar

RUN sh -c 'touch /app.jar'
EXPOSE 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

