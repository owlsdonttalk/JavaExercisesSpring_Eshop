INSERT INTO `categories` (`name`)
    VALUE   ('phones'), ('laptops'), ('accessories'), ('video games'), ('books');
GO

INSERT INTO `products` (`name`, `price`, category_id)
    VALUE   ('iPhone', 10.0,  1);
GO



