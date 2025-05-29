#IMAGEN MODELO
FROM eclipse-temurin:21.0.7_6-jdk
COPY . .
RUN ./mvnw clean package -DskipTests
COPY ./target/demo-0.0.1-SNAPSHOT.war .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/demo-0.0.1-SNAPSHOT.war"]
