#FROM maven:3.8.4-openjdk-17-slim AS build
#WORKDIR /app
#COPY product-service /app/product-service
#RUN mvn package -f /app/product-service/pom.xml
#
#FROM openjdk:17-slim
#WORKDIR /app
#COPY --from=build /app/product-service/target/product-service-0.0.1-SNAPSHOT.jar app.jar
#
#EXPOSE 8088
#CMD [ "java", "-jar", "app.jar" ]



FROM openjdk:17
COPY product-service/target/product-service-0.0.1-SNAPSHOT.jar /app/product-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/app/product-service.jar"]

