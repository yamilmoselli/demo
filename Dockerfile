#IMAGEN MODELO
FROM eclipse-temurin:21.0.7_6-jdk
COPY . .
RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/demo-0.0.1-SNAPSHOT.war"]
