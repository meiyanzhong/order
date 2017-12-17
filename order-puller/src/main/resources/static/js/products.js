var products = [{
    productId : 1,
    productName : "Chai",
    supplierID : 1,
    categoryId : 1,
    quantityPerUnit : "10 boxes x 20 bags",
    unitPrice : 18.0000,
    unitsInStock : 39,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 2,
    productName : "Chang",
    supplierID : 1,
    categoryId : 1,
    quantityPerUnit : "24 - 12 oz bottles",
    unitPrice : 19.0000,
    unitsInStock : 17,
    unitsOnOrder : 40,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 3,
    productName : "Aniseed Syrup",
    supplierID : 1,
    categoryId : 2,
    quantityPerUnit : "12 - 550 ml bottles",
    unitPrice : 10.0000,
    unitsInStock : 13,
    unitsOnOrder : 70,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 4,
    productName : "Chef Anton's Cajun Seasoning",
    supplierID : 2,
    categoryId : 2,
    quantityPerUnit : "48 - 6 oz jars",
    unitPrice : 22.0000,
    unitsInStock : 53,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 5,
    productName : "Chef Anton's Gumbo Mix",
    supplierID : 2,
    categoryId : 2,
    quantityPerUnit : "36 boxes",
    unitPrice : 21.3500,
    unitsInStock : 0,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 6,
    productName : "Grandma's Boysenberry Spread",
    supplierID : 3,
    categoryId : 2,
    quantityPerUnit : "12 - 8 oz jars",
    unitPrice : 25.0000,
    unitsInStock : 120,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 7,
    productName : "Uncle Bob's Organic Dried Pears",
    supplierID : 3,
    categoryId : 7,
    quantityPerUnit : "12 - 1 lb pkgs.",
    unitPrice : 30.0000,
    unitsInStock : 15,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 7,
        categoryName : "Produce",
        description : "Dried fruit and bean curd"
    }
}, {
    productId : 8,
    productName : "Northwoods Cranberry Sauce",
    supplierID : 3,
    categoryId : 2,
    quantityPerUnit : "12 - 12 oz jars",
    unitPrice : 40.0000,
    unitsInStock : 6,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 9,
    productName : "Mishi Kobe Niku",
    supplierID : 4,
    categoryId : 6,
    quantityPerUnit : "18 - 500 g pkgs.",
    unitPrice : 97.0000,
    unitsInStock : 29,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 10,
    productName : "Ikura",
    supplierID : 4,
    categoryId : 8,
    quantityPerUnit : "12 - 200 ml jars",
    unitPrice : 31.0000,
    unitsInStock : 31,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 11,
    productName : "Queso Cabrales",
    supplierID : 5,
    categoryId : 4,
    quantityPerUnit : "1 kg pkg.",
    unitPrice : 21.0000,
    unitsInStock : 22,
    unitsOnOrder : 30,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 12,
    productName : "Queso Manchego La Pastora",
    supplierID : 5,
    categoryId : 4,
    quantityPerUnit : "10 - 500 g pkgs.",
    unitPrice : 38.0000,
    unitsInStock : 86,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 13,
    productName : "Konbu",
    supplierID : 6,
    categoryId : 8,
    quantityPerUnit : "2 kg box",
    unitPrice : 6.0000,
    unitsInStock : 24,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 14,
    productName : "Tofu",
    supplierID : 6,
    categoryId : 7,
    quantityPerUnit : "40 - 100 g pkgs.",
    unitPrice : 23.2500,
    unitsInStock : 35,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 7,
        categoryName : "Produce",
        description : "Dried fruit and bean curd"
    }
}, {
    productId : 15,
    productName : "Genen Shouyu",
    supplierID : 6,
    categoryId : 2,
    quantityPerUnit : "24 - 250 ml bottles",
    unitPrice : 15.5000,
    unitsInStock : 39,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 16,
    productName : "Pavlova",
    supplierID : 7,
    categoryId : 3,
    quantityPerUnit : "32 - 500 g boxes",
    unitPrice : 17.4500,
    unitsInStock : 29,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 17,
    productName : "Alice Mutton",
    supplierID : 7,
    categoryId : 6,
    quantityPerUnit : "20 - 1 kg tins",
    unitPrice : 39.0000,
    unitsInStock : 0,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 18,
    productName : "Carnarvon Tigers",
    supplierID : 7,
    categoryId : 8,
    quantityPerUnit : "16 kg pkg.",
    unitPrice : 62.5000,
    unitsInStock : 42,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 19,
    productName : "Teatime Chocolate Biscuits",
    supplierID : 8,
    categoryId : 3,
    quantityPerUnit : "10 boxes x 12 pieces",
    unitPrice : 9.2000,
    unitsInStock : 25,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 20,
    productName : "Sir Rodney's Marmalade",
    supplierID : 8,
    categoryId : 3,
    quantityPerUnit : "30 gift boxes",
    unitPrice : 81.0000,
    unitsInStock : 40,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 21,
    productName : "Sir Rodney's Scones",
    supplierID : 8,
    categoryId : 3,
    quantityPerUnit : "24 pkgs. x 4 pieces",
    unitPrice : 10.0000,
    unitsInStock : 3,
    unitsOnOrder : 40,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 22,
    productName : "Gustaf's Knäckebröd",
    supplierID : 9,
    categoryId : 5,
    quantityPerUnit : "24 - 500 g pkgs.",
    unitPrice : 21.0000,
    unitsInStock : 104,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 23,
    productName : "Tunnbröd",
    supplierID : 9,
    categoryId : 5,
    quantityPerUnit : "12 - 250 g pkgs.",
    unitPrice : 9.0000,
    unitsInStock : 61,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 24,
    productName : "Guaraná Fantástica",
    supplierID : 10,
    categoryId : 1,
    quantityPerUnit : "12 - 355 ml cans",
    unitPrice : 4.5000,
    unitsInStock : 20,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 25,
    productName : "NuNuCa Nuß-Nougat-Creme",
    supplierID : 11,
    categoryId : 3,
    quantityPerUnit : "20 - 450 g glasses",
    unitPrice : 14.0000,
    unitsInStock : 76,
    unitsOnOrder : 0,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 26,
    productName : "Gumbär Gummibärchen",
    supplierID : 11,
    categoryId : 3,
    quantityPerUnit : "100 - 250 g bags",
    unitPrice : 31.2300,
    unitsInStock : 15,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 27,
    productName : "Schoggi Schokolade",
    supplierID : 11,
    categoryId : 3,
    quantityPerUnit : "100 - 100 g pieces",
    unitPrice : 43.9000,
    unitsInStock : 49,
    unitsOnOrder : 0,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 28,
    productName : "Rössle Sauerkraut",
    supplierID : 12,
    categoryId : 7,
    quantityPerUnit : "25 - 825 g cans",
    unitPrice : 45.6000,
    unitsInStock : 26,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 7,
        categoryName : "Produce",
        description : "Dried fruit and bean curd"
    }
}, {
    productId : 29,
    productName : "Thüringer Rostbratwurst",
    supplierID : 12,
    categoryId : 6,
    quantityPerUnit : "50 bags x 30 sausgs.",
    unitPrice : 123.7900,
    unitsInStock : 0,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 30,
    productName : "Nord-Ost Matjeshering",
    supplierID : 13,
    categoryId : 8,
    quantityPerUnit : "10 - 200 g glasses",
    unitPrice : 25.8900,
    unitsInStock : 10,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 31,
    productName : "Gorgonzola Telino",
    supplierID : 14,
    categoryId : 4,
    quantityPerUnit : "12 - 100 g pkgs",
    unitPrice : 12.5000,
    unitsInStock : 0,
    unitsOnOrder : 70,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 32,
    productName : "Mascarpone Fabioli",
    supplierID : 14,
    categoryId : 4,
    quantityPerUnit : "24 - 200 g pkgs.",
    unitPrice : 32.0000,
    unitsInStock : 9,
    unitsOnOrder : 40,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 33,
    productName : "Geitost",
    supplierID : 15,
    categoryId : 4,
    quantityPerUnit : "500 g",
    unitPrice : 2.5000,
    unitsInStock : 112,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 34,
    productName : "Sasquatch Ale",
    supplierID : 16,
    categoryId : 1,
    quantityPerUnit : "24 - 12 oz bottles",
    unitPrice : 14.0000,
    unitsInStock : 111,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 35,
    productName : "Steeleye Stout",
    supplierID : 16,
    categoryId : 1,
    quantityPerUnit : "24 - 12 oz bottles",
    unitPrice : 18.0000,
    unitsInStock : 20,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 36,
    productName : "Inlagd Sill",
    supplierID : 17,
    categoryId : 8,
    quantityPerUnit : "24 - 250 g  jars",
    unitPrice : 19.0000,
    unitsInStock : 112,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 37,
    productName : "Gravad lax",
    supplierID : 17,
    categoryId : 8,
    quantityPerUnit : "12 - 500 g pkgs.",
    unitPrice : 26.0000,
    unitsInStock : 11,
    unitsOnOrder : 50,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 38,
    productName : "Côte de Blaye",
    supplierID : 18,
    categoryId : 1,
    quantityPerUnit : "12 - 75 cl bottles",
    unitPrice : 263.5000,
    unitsInStock : 17,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 39,
    productName : "Chartreuse verte",
    supplierID : 18,
    categoryId : 1,
    quantityPerUnit : "750 cc per bottle",
    unitPrice : 18.0000,
    unitsInStock : 69,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 40,
    productName : "Boston Crab Meat",
    supplierID : 19,
    categoryId : 8,
    quantityPerUnit : "24 - 4 oz tins",
    unitPrice : 18.4000,
    unitsInStock : 123,
    unitsOnOrder : 0,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 41,
    productName : "Jack's New England Clam Chowder",
    supplierID : 19,
    categoryId : 8,
    quantityPerUnit : "12 - 12 oz cans",
    unitPrice : 9.6500,
    unitsInStock : 85,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 42,
    productName : "Singaporean Hokkien Fried Mee",
    supplierID : 20,
    categoryId : 5,
    quantityPerUnit : "32 - 1 kg pkgs.",
    unitPrice : 14.0000,
    unitsInStock : 26,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 43,
    productName : "Ipoh Coffee",
    supplierID : 20,
    categoryId : 1,
    quantityPerUnit : "16 - 500 g tins",
    unitPrice : 46.0000,
    unitsInStock : 17,
    unitsOnOrder : 10,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 44,
    productName : "Gula Malacca",
    supplierID : 20,
    categoryId : 2,
    quantityPerUnit : "20 - 2 kg bags",
    unitPrice : 19.4500,
    unitsInStock : 27,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 45,
    productName : "Rogede sild",
    supplierID : 21,
    categoryId : 8,
    quantityPerUnit : "1k pkg.",
    unitPrice : 9.5000,
    unitsInStock : 5,
    unitsOnOrder : 70,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 46,
    productName : "Spegesild",
    supplierID : 21,
    categoryId : 8,
    quantityPerUnit : "4 - 450 g glasses",
    unitPrice : 12.0000,
    unitsInStock : 95,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 47,
    productName : "Zaanse koeken",
    supplierID : 22,
    categoryId : 3,
    quantityPerUnit : "10 - 4 oz boxes",
    unitPrice : 9.5000,
    unitsInStock : 36,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 48,
    productName : "Chocolade",
    supplierID : 22,
    categoryId : 3,
    quantityPerUnit : "10 pkgs.",
    unitPrice : 12.7500,
    unitsInStock : 15,
    unitsOnOrder : 70,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 49,
    productName : "Maxilaku",
    supplierID : 23,
    categoryId : 3,
    quantityPerUnit : "24 - 50 g pkgs.",
    unitPrice : 20.0000,
    unitsInStock : 10,
    unitsOnOrder : 60,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 50,
    productName : "Valkoinen suklaa",
    supplierID : 23,
    categoryId : 3,
    quantityPerUnit : "12 - 100 g bars",
    unitPrice : 16.2500,
    unitsInStock : 65,
    unitsOnOrder : 0,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 51,
    productName : "Manjimup Dried Apples",
    supplierID : 24,
    categoryId : 7,
    quantityPerUnit : "50 - 300 g pkgs.",
    unitPrice : 53.0000,
    unitsInStock : 20,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 7,
        categoryName : "Produce",
        description : "Dried fruit and bean curd"
    }
}, {
    productId : 52,
    productName : "Filo Mix",
    supplierID : 24,
    categoryId : 5,
    quantityPerUnit : "16 - 2 kg boxes",
    unitPrice : 7.0000,
    unitsInStock : 38,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 53,
    productName : "Perth Pasties",
    supplierID : 24,
    categoryId : 6,
    quantityPerUnit : "48 pieces",
    unitPrice : 32.8000,
    unitsInStock : 0,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : true,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 54,
    productName : "Tourtière",
    supplierID : 25,
    categoryId : 6,
    quantityPerUnit : "16 pies",
    unitPrice : 7.4500,
    unitsInStock : 21,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 55,
    productName : "Pâté chinois",
    supplierID : 25,
    categoryId : 6,
    quantityPerUnit : "24 boxes x 2 pies",
    unitPrice : 24.0000,
    unitsInStock : 115,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 6,
        categoryName : "Meat/Poultry",
        description : "Prepared meats"
    }
}, {
    productId : 56,
    productName : "Gnocchi di nonna Alice",
    supplierID : 26,
    categoryId : 5,
    quantityPerUnit : "24 - 250 g pkgs.",
    unitPrice : 38.0000,
    unitsInStock : 21,
    unitsOnOrder : 10,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 57,
    productName : "Ravioli Angelo",
    supplierID : 26,
    categoryId : 5,
    quantityPerUnit : "24 - 250 g pkgs.",
    unitPrice : 19.5000,
    unitsInStock : 36,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 58,
    productName : "Escargots de Bourgogne",
    supplierID : 27,
    categoryId : 8,
    quantityPerUnit : "24 pieces",
    unitPrice : 13.2500,
    unitsInStock : 62,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 59,
    productName : "Raclette Courdavault",
    supplierID : 28,
    categoryId : 4,
    quantityPerUnit : "5 kg pkg.",
    unitPrice : 55.0000,
    unitsInStock : 79,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 60,
    productName : "Camembert Pierrot",
    supplierID : 28,
    categoryId : 4,
    quantityPerUnit : "15 - 300 g rounds",
    unitPrice : 34.0000,
    unitsInStock : 19,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 61,
    productName : "Sirop d'érable",
    supplierID : 29,
    categoryId : 2,
    quantityPerUnit : "24 - 500 ml bottles",
    unitPrice : 28.5000,
    unitsInStock : 113,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 62,
    productName : "Tarte au sucre",
    supplierID : 29,
    categoryId : 3,
    quantityPerUnit : "48 pies",
    unitPrice : 49.3000,
    unitsInStock : 17,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 63,
    productName : "Vegie-spread",
    supplierID : 7,
    categoryId : 2,
    quantityPerUnit : "15 - 625 g jars",
    unitPrice : 43.9000,
    unitsInStock : 24,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 64,
    productName : "Wimmers gute Semmelknödel",
    supplierID : 12,
    categoryId : 5,
    quantityPerUnit : "20 bags x 4 pieces",
    unitPrice : 33.2500,
    unitsInStock : 22,
    unitsOnOrder : 80,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 5,
        categoryName : "Grains/Cereals",
        description : "Breads, crackers, pasta, and cereal"
    }
}, {
    productId : 65,
    productName : "Louisiana Fiery Hot Pepper Sauce",
    supplierID : 2,
    categoryId : 2,
    quantityPerUnit : "32 - 8 oz bottles",
    unitPrice : 21.0500,
    unitsInStock : 76,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 66,
    productName : "Louisiana Hot Spiced Okra",
    supplierID : 2,
    categoryId : 2,
    quantityPerUnit : "24 - 8 oz jars",
    unitPrice : 17.0000,
    unitsInStock : 4,
    unitsOnOrder : 100,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}, {
    productId : 67,
    productName : "Laughing Lumberjack Lager",
    supplierID : 16,
    categoryId : 1,
    quantityPerUnit : "24 - 12 oz bottles",
    unitPrice : 14.0000,
    unitsInStock : 52,
    unitsOnOrder : 0,
    reorderLevel : 10,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 68,
    productName : "Scottish Longbreads",
    supplierID : 8,
    categoryId : 3,
    quantityPerUnit : "10 boxes x 8 pieces",
    unitPrice : 12.5000,
    unitsInStock : 6,
    unitsOnOrder : 10,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 3,
        categoryName : "Confections",
        description : "Desserts, candies, and sweet breads"
    }
}, {
    productId : 69,
    productName : "Gudbrandsdalsost",
    supplierID : 15,
    categoryId : 4,
    quantityPerUnit : "10 kg pkg.",
    unitPrice : 36.0000,
    unitsInStock : 26,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 70,
    productName : "Outback Lager",
    supplierID : 7,
    categoryId : 1,
    quantityPerUnit : "24 - 355 ml bottles",
    unitPrice : 15.0000,
    unitsInStock : 15,
    unitsOnOrder : 10,
    reorderLevel : 30,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 71,
    productName : "Flotemysost",
    supplierID : 15,
    categoryId : 4,
    quantityPerUnit : "10 - 500 g pkgs.",
    unitPrice : 21.5000,
    unitsInStock : 26,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 72,
    productName : "Mozzarella di Giovanni",
    supplierID : 14,
    categoryId : 4,
    quantityPerUnit : "24 - 200 g pkgs.",
    unitPrice : 34.8000,
    unitsInStock : 14,
    unitsOnOrder : 0,
    reorderLevel : 0,
    discontinued : false,
    category : {
        categoryId : 4,
        categoryName : "Dairy Products",
        description : "Cheeses"
    }
}, {
    productId : 73,
    productName : "Röd Kaviar",
    supplierID : 17,
    categoryId : 8,
    quantityPerUnit : "24 - 150 g jars",
    unitPrice : 15.0000,
    unitsInStock : 101,
    unitsOnOrder : 0,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 8,
        categoryName : "Seafood",
        description : "Seaweed and fish"
    }
}, {
    productId : 74,
    productName : "Longlife Tofu",
    supplierID : 4,
    categoryId : 7,
    quantityPerUnit : "5 kg pkg.",
    unitPrice : 10.0000,
    unitsInStock : 4,
    unitsOnOrder : 20,
    reorderLevel : 5,
    discontinued : false,
    category : {
        categoryId : 7,
        categoryName : "Produce",
        description : "Dried fruit and bean curd"
    }
}, {
    productId : 75,
    productName : "Rhönbräu Klosterbier",
    supplierID : 12,
    categoryId : 1,
    quantityPerUnit : "24 - 0.5 l bottles",
    unitPrice : 7.7500,
    unitsInStock : 125,
    unitsOnOrder : 0,
    reorderLevel : 25,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 76,
    productName : "Lakkalikööri",
    supplierID : 23,
    categoryId : 1,
    quantityPerUnit : "500 ml",
    unitPrice : 18.0000,
    unitsInStock : 57,
    unitsOnOrder : 0,
    reorderLevel : 20,
    discontinued : false,
    category : {
        categoryId : 1,
        categoryName : "Beverages",
        description : "Soft drinks, coffees, teas, beers, and ales"
    }
}, {
    productId : 77,
    productName : "Original Frankfurter grüne Soße",
    supplierID : 12,
    categoryId : 2,
    quantityPerUnit : "12 boxes",
    unitPrice : 13.0000,
    unitsInStock : 32,
    unitsOnOrder : 0,
    reorderLevel : 15,
    discontinued : false,
    category : {
        categoryId : 2,
        categoryName : "Condiments",
        description : "Sweet and savory sauces, relishes, spreads, and seasonings"
    }
}];