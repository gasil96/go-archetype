# go-archetype-ms
Archetype for microservices in GO

# [Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) Project for _Maven_. EN-US
### Model created for microservices generated within the GO architecture, use whenever necessary to create a new project.

## Include
* MVC
* Open API 3 (Swagger)
* Integration with OpenFeign
* Handler Exceptions
* Custom Default Exception (BusinessException.class)
* Utils Class
* Date Manipulator
* Custom Converter with ModelMapper
* Unit Test

## How To

* Download this repository:
```console
git clone https://github.com/gasil96/go-archetype-ms.git
```
* At the root of the project run the command:
```console
mvn clean install
```
OBS: After running the above command you can check if the _go-achertype-ms-archetype_ dependency has been added in your _.m2_ directory in the _br.com.go_ path.
Remember to update whenever there is notice of a new archetype version available.
* At the root of where you want to create your new microservice, run the command:
```console
mvn archetype:generate \
  -DarchetypeGroupId=br.com.go \
  -DarchetypeArtifactId=go-achertype-ms-archetype \
  -DarchetypeVersion=0.0.1-SNAPSHOT \
  -DgroupId=br.com.go \
  -DartifactId=<api.xpto> \
  -Dversion=0.0.1-SNAPSHOT \
  -Dpackage=br.com.go
```
Replace <api.xpto> by the name of your api... confirm the data by typing 'y' when asked.

#### You've created a new microservice with some classes already pre-configured, don't forget to check the comments and remove all the TODO code, you can run and access the project on port 8080

# Projeto de [Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) para o _Maven_. PT-BR
### Modelo criado para microsserviços gerados dentro da arquitetura do GO, utilize sempre que for necessário criar um novo projeto.

## Incluso
* Padrão MVC
* Open API 3 (Swagger)
* Integração com OpenFeign
* Handler Exceptions
* Exception Default Customizada (BusinessException.class)
* Classe Utilitária
* Manipulador de Datas
* Converter customizado com ModelMapper
* Testes Unitários

## Modo de Usar

* Baixe este repositório:
```console
git clone https://github.com/gasil96/go-archetype-ms.git
```
* Na raiz do projeto execute o comando:
```console
mvn clean install
```
OBS: Após rodar o comando anterior você pode verificar se a dependência _go-achertype-ms-archetype_ foi adicionada no seu diretório _.m2_ no caminho _br.com.go_. 
Lembre de atualizar sempre que houver aviso de uma nova versão do archetype disponível.
* Na raíz de onde você deseja criar o seu novo microsserviço execute o comando:
```console
mvn archetype:generate \
  -DarchetypeGroupId=br.com.go \
  -DarchetypeArtifactId=go-achertype-ms-archetype \
  -DarchetypeVersion=0.0.1-SNAPSHOT \
  -DgroupId=br.com.go \
  -DartifactId=<api.xpto> \
  -Dversion=0.0.1-SNAPSHOT \
  -Dpackage=br.com.go
```
Substitua <api.xpto> pelo nome da sua api... confirme os dados digitando 'y' quando for perguntado.

#### Pronto você criou um novo microsserviço com algumas classes ja pré configuradas, não esqueça de checar os comentários e remover todos os TODO do código, você pode rodar e acessar o projeto na porta 8080
