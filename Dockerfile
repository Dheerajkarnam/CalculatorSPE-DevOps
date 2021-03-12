FROM openjdk:8
COPY ./target/CalculatorSPE-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp" , "CalculatorSPE-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
