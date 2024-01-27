<h1>Validação de Dados</h1>

 ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
 ![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?style=for-the-badge&logo=Spring&logoColor=white)
   
<p>Este projeto é um exemplo prático de validação de dados, ela é uma parte crucial do desenvolvimento de software e serve para garantir a integridade e 
  consistência dos dados que entram em um sistema. </p>

<p>Desenvolvido com Java, Spring Boot e H2 como database</p>

  <h2>Sumário</h2>
<ul>
  <li><a href="#func">Validação dos Campos</li>
  <li><a href="#pratic">Práticas adotadas</li>
    <li><a href="#instalacao">Instalação</li>
      <li><a href="#endpoints">API Endpoints</li>
</ul>

<h2 id="func">Validação dos Campos</h2>

<ul>
  <li><code>@NotBlank(message = "name cannot be null or empty")</code>: Esta anotação valida se a string <code>name</code> não é nula e não está em branco..</li>
  <li><code>@Email</code>: Esta anotação valida se o campo <code>email</code> contém um endereço de e-mail válido.</li>
  <li><code>@Size(min = 9, max = 16, message = "Campo phone deve conter entre 9 e 16 caracteres")</code>: Esta anotação valida se o campo <code>phone</code> possui entre 9 e 16 caracteres.</li>
  <li><code>@PastOrPresent(message = "Campo Data invalido")</code>: Esta anotação valida se o campo <code>birthDate</code> contém uma data passada ou presente.</li>
  <li><code>@Positive(message = "Campo saldo deve ser positvo")</code>: Esta anotação valida se o campo <code>balance</code> possui um valor positivo.</li>
</ul>

<h2 id="pratic">Práticas adotadas</h2>
<ul>
<li>API RESTful
<li>Consultas com Spring Data JPA
<li>Injeção de Dependências
<li>Validação de dados(Bean Validation)
</ul>

<h2 id="instalacao">Instalação</h2>
<ol>
  <li>Clonar o repositório Git</li>
  
      https://github.com/sthevenalves/java-spring-data-validation.git

  <li>Navegar para o diretório do projeto:</li>
  
      cd data-validation

  <li>Compilar o projeto com Maven</li>

    mvn clean install

  <li>Executar o projeto:</li>

    java -jar target/data-validation.jar
</ol>

<h2 id="endpoints">API Endpoints</h2>
<p>Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta <a href="https://www.postman.com/">Postman</a></p>

http POST :8080/users - insert

    {
            "name": "Stheven Soares",
            "phone": "123456789",
            "email": "sthevensoares@example.com",
            "birthDate": "2022-01-27T12:34:56Z",
            "balance": 165.00
    }

 http GET :8080/users - listAll
 
    [
             "id": 3,
            "name": "Stheven Soares",
            "email": "sthevensoares@example.com",
            "phone": "123456789",
            "birthDate": "2022-01-27T12:34:56Z",
            "balance": 165.0
        }
    ]
http GET :8080/users/1 - findById

    {
        "id": 1,
        "name": "Maria",
        "email": "maria@gmail.com",
        "phone": "99970-8499",
        "birthDate": "1990-07-13T20:50:00Z",
        "balance": 100.0
    }
  
