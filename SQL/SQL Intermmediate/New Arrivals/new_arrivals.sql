SELECT name, year FROM Books 
WHERE year > 1900 
UNION 
SELECT name , 2022 as year 
FROM new 
ORDER BY name ASC;
