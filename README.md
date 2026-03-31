# 🎁 My Wishlist

A simple, fast, and elegant web application for saving links to products you want to buy. The project consists of a RESTful API powered by Java Spring Boot and a lightweight, responsive frontend built with pure HTML/CSS/JavaScript.

## ✨ Features

* **Adding items:** Paste a link, and the product will appear in your list.
* **Editing:** Change product names for better organization using the convenient button.
* **Deleting:** Remove irrelevant items from the list with a single click.
* **Quick access:** The "Go to product" button opens the store page in a new tab.
* **Responsive design:** The product grid automatically adjusts to the screen size (desktop, tablet, smartphone).
* **Modern UI:** Features SVG icons, pleasant colors, and hover animations.

## 🛠 Tech Stack

**Frontend:**
* HTML5
* CSS3 (Grid, Flexbox, Custom Styles)
* Vanilla JavaScript (Fetch API, Async/Await)

**Backend:**
* Java 17+
* Spring Boot (Spring Web, Spring Data JPA)
* PostgreSQL (primary database)
* Maven (project builder)

## 🚀 Local Setup (Localhost)

To run the project on your computer, follow these steps:

### 1. Database Setup (PostgreSQL)
1. Ensure you have PostgreSQL installed.
2. Create a new database (e.g., `wishlist_db`).
3. Open the backend file `src/main/resources/application.properties` and specify your connection details:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/wishlist_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
