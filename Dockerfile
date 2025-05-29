#IMAGEN MODELO
FROM eclipse-temurin:21.0.7_6-jdk
COPY . .
RUN ./mvnw clean package -DskipTests
ARG WAR_FILE=target/demo-0.0.1-SNAPSHOT.war
COPY ${WAR_FILE} app_demo.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_demo.war"]
