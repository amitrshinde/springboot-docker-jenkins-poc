FROM openjdk:8-alpine
RUN mkdir -p /home/app
COPY ./target/springboot-docker-jenkins-poc.jar /home/app
WORKDIR /home/app
CMD ["java","-jar","springboot-docker-jenkins-poc.jar"]
