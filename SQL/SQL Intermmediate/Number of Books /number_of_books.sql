SELECT Authors.name AS name, COALESCE(COUNT(Books.author_id), 0) AS books
FROM Authors LEFT JOIN Books ON Authors.id = Books.author_id
GROUP BY Authors.name
ORDER BY books DESC;
