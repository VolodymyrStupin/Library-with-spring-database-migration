# Library in java using spring with database migration

Spring MVC web application for borrowing and managing library books inventory.

## Description

The application allow to borrow books (as a standard user), manage books inventory (add new ones, check availablity, etc.) and user account.

In Library Portal there are three types of users: 
 * Readers - they can register themselves and borrow limited number of books.
 * Librarian - limited number of users that can add new books, borrow and return them. They can also confirm payments for penalties in case when a reader keeps a book to long.
 * Admin - person, who can add, edit and deactivate users.

## Tools & Frameworks

The application is written using Spring MVC framework and Gradle (for external dependency managment).

**Database & configuration**
* MySQL
* Flyway (for data migration)
* Gradle
* Tomcat
* Git
* Google Book API

**Backend technologies**
* Java
* Spring MVC, Spring AOP, Spring Security
* Hibernate ORM, Hibernate Validator, Hibenrate Search (Lucene)
* Retrofit, JSON
* JUnit
* Project Lombok
* Log4j2

**Frontend technologies**
* HTML, CSS, JavaScript
* JSP, JSTL
* Bootstrap 4

## How to run?

1. Clone this git repository

` $ git clone https://github.com/VlodymyrStupin/Library-Spring-Database-Migration.git `


2. Open MySQL Workbench and type following SQL script:
```
	CREATE USER 'library-spring-database-migration'@'localhost' IDENTIFIED BY 'library-spring-database-migration';
	GRANT ALL PRIVILEGES ON  *.* TO 'library-spring-database-migration'@'localhost';
	SET GLOBAL EVENT_SCHEDULER = ON;
 ```
 
 3. Go to a folder `src/main/resources/properties`, create googleAPI.properties file and add your Google API key
 
 `  googleAPI.key=[YOUR KEY HERE] `
 
 4. Run `tomcatRun` Gradle task 
 
 5. The application will avaialble under URL `http://localhost:8080/library-spring-database-migration`
