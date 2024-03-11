
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

# Copy the project files into the container
COPY . .

# Build the project
RUN mvn clean install

# Create a new image based on the openjdk:17 image
FROM eclipse-temurin:17-jdk

# Copy the JAR file from the build image
COPY --from=build /target/JobSearchWebsite-0.0.1-SNAPSHOT.jar app.jar

# Set the working directory
WORKDIR /app

# Expose port 8080
EXPOSE 8080

# Start the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]
