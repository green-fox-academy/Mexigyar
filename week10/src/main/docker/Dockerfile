FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD clothing-0.0.1-SNAPSHOT.jar gradle-springboot-1.0.jar
ENTRYPOINT ["java","-jar","gradle-springboot-1.0.jar"]