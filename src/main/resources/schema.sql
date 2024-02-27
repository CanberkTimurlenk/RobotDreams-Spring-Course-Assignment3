CREATE TABLE IF NOT EXISTS Products
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name Varchar(255) Not Null,
    category Varchar(255) Not Null,
    photo_url Varchar(500),
    description TEXT,
    price decimal Not Null
);