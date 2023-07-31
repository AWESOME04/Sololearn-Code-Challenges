SELECT 
    Books.name,
    Books.year,
    Authors.name AS author
FROM 
    Books
JOIN 
    Authors ON Books.author_id = Authors.id
ORDER BY 
    Authors.name ASC,
    Books.year ASC;
