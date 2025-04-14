
Attendance System (3AxisLabs Assessment)
========================================

A simple web-based attendance system with login functionality.

Project Structure:
------------------
- client/   : HTML and JavaScript frontend
- server/   : Java Spring Boot backend
- docs/     : Screenshots and documentation
- readme.txt: This file


Technologies Used:
------------------
- Frontend : HTML, JavaScript
- Backend  : Java (Spring Boot)
- Auth     : JWT (JSON Web Token)
- Build    : Maven


Setup Instructions:
-------------------

1. Clone or download the project.

2. Start the backend server:

   Open terminal and run:
   > cd server
   > ./mvnw spring-boot:run    (Linux/macOS)
   or
   > mvnw.cmd spring-boot:run  (Windows)

   Backend runs on: http://localhost:8080

3. Open the login page:

   - Go to client folder
   - Double-click login.html or open it in a web browser

   Example path:
   C:/Users/YourName/Desktop/attendance-system/client/login.html


Login Credentials:
------------------
Username: admin
Password: password


Additional Notes:
-----------------
- All user validation is hardcoded.
- JWT token is returned on successful login.
- Screenshots for folder structure and UI are inside /docs folder.

