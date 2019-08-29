FROM maven:latest as base
WORKDIR /build
COPY . .
RUN mvn clean 
RUN mvn package
FROM java:8
WORKDIR /opt/app
COPY --from=base /build/target/Beholder-Audit-0.0.1-SNAPSHOT.jar audit.jar
ENTRYPOINT ["/usr/bin/java", "-Dspring.data.mongodb.uri=mongodb://mongoaudit:27017/userLogs", "-jar", "audit.jar"]
