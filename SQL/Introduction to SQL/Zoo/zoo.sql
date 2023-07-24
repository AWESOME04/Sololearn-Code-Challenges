/* name - "Slim", type - "Giraffe", country_id - 1 */

insert INTO Animals VALUES ('Slim','Giraffe',1); 
SELECT Animals.name,Animals.type,Countries.country 
FROM Animals,Countries 
where Animals.country_id = Countries.id
 ORDER BY country;
