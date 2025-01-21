# Challenge Literalura 📚

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.8.1-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-AGPL%20v3-blue.svg)](https://www.gnu.org/licenses/agpl-3.0)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)


![IN PROGRESS BADGE](http://img.shields.io/static/v1?label=STATUS&message=IN%20PROGRESS&color=GREEN&style=for-the-badge)

## 📖 Overview

Literalura is a Java-based application that seamlessly manages and searches for books and authors. Built with Spring Boot and Maven, it integrates with Gutendex API for comprehensive book data retrieval and utilizes JPA for efficient relational database management.

## 🚀 Features

- **Book Search**: Advanced search functionality using Gutendex API integration
- **Data Management**: Efficient storage and retrieval of book and author information
- **Database Integration**: Robust relational database management using JPA
- **RESTful API**: Clean and well-documented API endpoints
- **Scalable Architecture**: Built on Spring Boot for maximum scalability

## 🛠️ Tech Stack

<div align="center">

| Technology | Version | Purpose | Icon |
|------------|---------|----------|------|
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" width="20"/> Java | 21 | Core programming language | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) |
| <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" width="20"/> Spring Boot | 3.0.0 | Application framework | ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) |
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/maven/maven-original.svg" width="20"/> Maven | 3.8.1 | Dependency management | ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white) |
| <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original.svg" width="20"/> PostgreSQL | 15 | Database | ![PostgreSQL](https://img.shields.io/badge/postgresql-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white) |
| <img src="https://www.vectorlogo.zone/logos/hibernate/hibernate-icon.svg" width="20"/> Hibernate/JPA | 6.0 | ORM | ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) |

</div>

## 📋 Prerequisites

- Java 21 or higher
- Maven 3.8.1 or higher
- PostgreSQL 15 or higher

## 🔧 Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/zlucasftw/literalura.git
   ```

2. Navigate to the project directory:
   ```sh
   cd literalura
   ```

3. Create and configure environment variables (see Configuration section)

4. Build the project:
   ```sh
   mvn clean install
   ```

5. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## 🌐 Gutendex API Integration

Literalura uses [Gutendex](https://gutendex.com/), a JSON web API for Project Gutenberg eBooks.

### Base URL
```
https://gutendex.com
```

### API Endpoints Reference

| Endpoint | Method | Description | Example |
|----------|--------|-------------|---------|
| 📚 `/books` | GET | Get all books | `GET /books` |
| 🔍 `/books?search={query}` | GET | Search books by title/author | `GET /books?search=Tolkien` |
| 📖 `/books/{id}` | GET | Get book by ID | `GET /books/1234` |
| 📝 `/books?languages={lang}` | GET | Filter books by language | `GET /books?languages=en` |
| 👥 `/books?author_year_start={year}` | GET | Filter by author birth year | `GET /books?author_year_start=1800` |

For more details, visit the [Gutendex Documentation](https://gutendex.com/docs/).

## 🔌 API Endpoints

| Icon | Endpoint | Method | Description | Response |
|------|----------|--------|-------------|----------|
| 📚 | `/api/books` | GET | Retrieve all books | `List<BookDTO>` |
| 🔍 | `/api/books/search` | GET | Search books by name | `List<BookDTO>` |
| 👤 | `/api/authors` | GET | Retrieve all authors | `List<AuthorDTO>` |
| 📖 | `/api/books/{id}` | GET | Get book by ID | `BookDTO` |
| ✍️ | `/api/authors/{id}` | GET | Get author by ID | `AuthorDTO` |

## ⚙️ Configuration

Create a `.env` file in the project root:

```env
# Database Configuration in .env
DB_HOST=DATABASE_HOST
DB_PORT=DATABASE_PORT
DB_NAME=DATABASE_NAME
DB_USERNAME=DATABASE_USER
DB_PASSWORD=DATABASE_PASSWORD
```

Make sure to configure your `application.properties` for your own environment. Example:

```properties
# application.properties
spring.config.import=file:.env[.properties]

spring.application.name=screenmatch

spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
```

Add to `pom.xml` for .env support:
```xml
<dependency>
    <groupId>io.github.cdimascio</groupId>
    <artifactId>dotenv-java</artifactId>
    <version>3.0.0</version>
</dependency>
```

## ✅ TODO

- [ ] Implement `searchBook` method in `AuthorService`
- [ ] Add comprehensive error handling and logging
- [ ] Create unit tests for service and repository layers
- [ ] Enhance UI/UX design
- [ ] Implement authentication and authorization
- [ ] Add API rate limiting
- [ ] Implement caching mechanism
- [ ] Add API documentation using Swagger/OpenAPI
- [ ] Add project documentation with images/GIFs showcasing:
    - [ ] Command-line interface usage and commands
    - [ ] Example searches and results
    - [ ] Database operations and data flow
    - [ ] API endpoint interactions
    - [ ] Error handling demonstrations

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/AmazingFeature`
3. Commit your changes: `git commit -m 'Add some AmazingFeature'`
4. Push to the branch: `git push origin feature/AmazingFeature`
5. Open a Pull Request

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

## 📝 License

This project is licensed under the GNU Affero General Public License v3.0 (AGPL-3.0) - see the [LICENSE](LICENSE) file for details. This license ensures that if you modify and use this software, you must make the source code available to anyone who interacts with it over a network.

## 🙏 Acknowledgments

- Thanks to all contributors who have helped shape Literalura
- Book data provided by [Gutendex API](https://gutendex.com/)
- Project Gutenberg for providing the original eBook content
