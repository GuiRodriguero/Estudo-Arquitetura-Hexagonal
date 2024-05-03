# Use a imagem base do OpenJDK 21
FROM openjdk:21-slim

# Define o diretório da aplicação como o diretório de trabalho
WORKDIR /aplicacao

# Copia o arquivo jar para o diretório da aplicação
COPY ../target/Pegasus-0.0.1-SNAPSHOT.jar .

# Expõe a porta 8080
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "Pegasus-0.0.1-SNAPSHOT.jar"]