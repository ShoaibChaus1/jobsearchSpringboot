
#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests

#FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/jobfind-0.0.1-SNAPSHOT.jar jobfind.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","jobfind.jar"]


#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests

#FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/JobSearchWebsite-0.0.1-SNAPSHOT.jar JobSearchWebsite.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","JobSearchWebsite.jar"]


FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean install

FROM eclipse-temurin:17-jdk
COPY --from=build /target/*.jar app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
