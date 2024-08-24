# Manufacturer Management Application

This project is a Manufacturer Management Application developed for Makersharks by Ashutosh Rajput. It provides an API to manage suppliers with features like Swagger documentation, JUnit testing, pagination, custom validation, and custom exception handling.

## Features

- **Swagger Documentation**: Easily explore and test the API using Swagger UI.
- **JUnit Testing**: Comprehensive unit tests for ensuring code quality.
- **Pagination**: Efficiently handle large datasets with pagination support.
- **Custom Validation**: Enforce specific business rules through custom validation logic.
- **Custom Exception Handling**: Gracefully handle errors with custom exceptions.

## How to Use:

### Swagger UI

You can interact with the API directly through Swagger, which is already integrated into the application. Swagger provides detailed documentation for each endpoint and allows you to test the API in real-time.

### Running the Application

1. Clone the repository.
2. Import the project into your preferred IDE.
4. Configure the `application.properties` file for the database.
5. Run the Spring Boot application from your IDE or command line.
6. Access Swagger UI at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

### Database

The application supports both H2 (in-memory database) and MySQL.

- **H2 Database**: Ideal for testing and development environments.
- **MySQL**: Suitable for production environments.
  
## Future Todos

- **Add JWT Authentication and Authorization**: Implement secure authentication and authorization using JSON Web Tokens (JWT).
- **Create Frontend with React**: Develop a user-friendly frontend interface for the application using React.
- **Add More Entities and Functionality**: Expand the application by adding additional entities and enhancing existing functionality.

## Endpoints

**Base URL:** `http://localhost:8080/api`

1. **Create Supplier**
   - **POST** `/supplier`
   - Requires all fields.
   - `Company` must be unique, `Website` must match a URL pattern, `Nature of Business`: `small_scale`, `medium_scale`, `large_scale`, `Manufacturing Process`: `moulding`, `3d_printing`, `casting`, `coating`.

2. **Get Supplier by ID**
   - **GET** `/supplier/{id}`
   - Retrieves a supplier by ID.

3. **Delete Supplier by ID**
   - **DELETE** `/supplier/{id}`
   - Deletes a supplier by ID.

4. **Search Suppliers**
   - **POST** `/supplier/get-supplier/{page}/{size}`
   - Filter by `location`, `Nature Of Business`, and `Manufacturing Process`. Values must match allowed options.

## Technologies Used

- **Spring Boot**: For building the application.
- **Swagger**: For API documentation and testing.
- **JUnit**: For unit testing.
- **MySQL / H2**: Database options.



## Contributions

Contributions are welcome! Feel free to fork the repository and submit a pull request.


