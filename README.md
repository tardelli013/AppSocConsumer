# AppSocConsumer

Este projeto utiliza Java 8 e Maven, para rodar este projeto com eclipe são necessários os passos abaixo:

##### Instruções

* Efetuar o download ou clone do pacote
* Importar no eclipse como Maven Project
* Rodar o comando `mvn clean install` para baixar as dependências
* No Eclipse, Encontrar a classe Main "AppSocConsumer.java"
* Na linha 14 da classe é necessário passar o ID do exame que deseja buscar
* Clicar com direito do mouse e `Run > AppSocConsumer.main()`


Este projeto é um consumer simples que acessa o serviço SOAP de busca de 1 exame passando o ID do exame.

Para rodar este projeto é necessário que o projeto AppSoc esteja rodando, detalhes de como rodar o AppSoc neste repositorio:
https://github.com/tardelli13/AppSoc