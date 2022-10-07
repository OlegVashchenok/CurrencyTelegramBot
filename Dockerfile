FROM maven:3.8.4-openjdk-11-slim as build
WORKDIR /app
COPY . .
run ["mvn","clean", "package"]
CMD ["java", "-cp", "target/CurrencyParser-1.0-SNAPSHOT.jar", "Main"]