FROM ubuntu:latest AS build

RUN apt-get update && apt-get install openjdk-21-jdk maven -y

COPY . .

RUN mvn clean install

FROM openjdk:21-jdk-slim
EXPOSE 8084

COPY --from=build /target/gestaodeestoque-estoqueV1.jar /app/gestaodeestoque.jar

ENTRYPOINT ["java", "-jar", "/app/gestaodeestoque.jar" ]