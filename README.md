# Parking Management System

The Parking Management System is designed to efficiently manage vehicle entries and exits in a parking lot. Developed using Java with Spring Boot for the backend and React.js for the frontend, this system tracks the number of available slots, prevents duplicate entries, and ensures seamless parking operations.

## Technologies Used

- **Backend:** Java, Spring Boot, MySQL
- **Frontend:** React.js

## Features

- Add new vehicle entries
- Remove vehicle entries
- List all vehicles
- Check available parking slots
- Automatically convert plate numbers to uppercase
- Validate for duplicate plate numbers

## Installation and Setup

### Backend

1. **Clone the repository:**
   ```bash
   git clone https://github.com/unknown1fsh/parking-management-system.git
   cd parking-management-system
   ```

2. **Configure MySQL Database:**
   - Create a MySQL database named `otopark`.
   - Update the `src/main/resources/application.properties` file with your MySQL username and password.

3. **Run the Spring Boot application:**
   ```bash
   ./mvnw spring-boot:run
   ```

### Frontend

1. **Clone the React repository:**
   ```bash
   git clone https://github.com/unknown1fsh/parking-management-system-react.git
   cd parking-management-system-react
   ```

2. **Install dependencies:**
   ```bash
   npm install
   ```

3. **Start the React application:**
   ```bash
   npm start
   ```

## Usage

- Open your browser and navigate to `http://localhost:3000` to access the frontend.
- Use the interface to add, remove, list vehicles, and check available slots.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributions

Contributions are welcome! Please feel free to submit a Pull Request.

## Acknowledgements

Special thanks to all the open-source contributors who helped in making this project possible.
