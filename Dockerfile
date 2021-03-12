FROM openjdk:8
COPY ./target/ScientificCalc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalc-1.0-SNAPSHOT.jar", "Calc"]