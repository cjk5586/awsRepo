# Start with a base image containing Java runtime
FROM openjdk:8-jdk

# Add Author info
LABEL maintainer="jkcha@mz.co.kr"

# Add a volume to /tmp
VOLUME /tmp

# Make port 8086 available to the world outside this container
EXPOSE 8086

# The application's jar file
ARG JAR_FILE=build/libs/firstPjt-0.01.jar

# Add the application's jar to the container
ADD ${JAR_FILE} firstPjt-0.01.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/firstPjt-0.01.jar"]