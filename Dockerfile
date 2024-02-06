# Use the official Maven image as the base image with Java 20
FROM maven:3.9.4-amazoncorretto-20-al2023

# Copy the pom.xml file to the container
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline

# Copy the application source code to the container
COPY src ./src

# Build the application
RUN mvn clean install -U

# Expose the port that the application will run on
EXPOSE 8888

# Specify the command to run the application
CMD ["java" ,"-jar", "target/Setting-LATEST.jar"]
