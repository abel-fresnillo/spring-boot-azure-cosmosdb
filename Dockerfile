FROM openjdk:8-jdk-slim
COPY "./target/spring-boot-azure-cosmosdb-0.0.1.jar" "app.jar"
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]