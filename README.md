# User Data Management Application

This web application allows users to input their data through a form and view the stored data in a dynamic table.

## Screenshots

### User Form Page
![image](https://github.com/sapabhaskar/Task/assets/152158677/279392c5-7fdb-4ebc-9116-58ad6138348d)


### User Data Table Page (user.jsp)
![image](https://github.com/sapabhaskar/Task/assets/152158677/e3dfc708-6fdb-4fd9-b5fe-dcc44f319167)


## Features

- **User Form**: Users can input their name, email, age, and date of birth through a user-friendly form.
- **Dynamic Table**: Data submitted through the form is stored in a database and displayed in a dynamic table format on the `user.jsp` page.
- **Validation**: Client-side validation ensures that the form data is correctly formatted before submission.
- **Error Handling**: Error messages are displayed if there are any issues with form submission or data retrieval.

## Technologies Used

- Java Servlets: For handling server-side logic and database interactions.
- JSP (JavaServer Pages): For generating dynamic HTML content.
- MySQL Database: For storing user data.
- HTML/CSS: For designing and styling the user interface.
- JavaScript: For client-side validation and interaction.

## Usage

1. **Form Page**: Access the form page (`index.html`) through the browser.
2. **Input Data**: Enter your name, email, age, and date of birth into the form fields.
3. **Submit Form**: Click the "Submit" button to submit the form data.
4. **View Data**: Access the user data table page (`user.jsp`) to view the submitted data in a tabular format.

## Setup

1. **Database Configuration**: Set up a MySQL database named `userdb` with a table named `user_data` to store user data. Use the following SQL script to create the table:

    ```sql
    CREATE TABLE user_data (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL,
        age INT NOT NULL,
        dob DATE NOT NULL
    );
    ```

2. **Deploy Application**: Deploy the web application to a servlet container such as Apache Tomcat.

3. **Access Pages**: Access the form page at `http://localhost:8080/yourapp/form.html` and the user data table page at `http://localhost:8080/yourapp/user.jsp`.

## Contributors

- [Sapa Bhaskar](https://github.com/sapabhaskar)

