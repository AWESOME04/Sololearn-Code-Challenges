select * from Apartments
where price > (select avg(price) from Apartments)
and status like 'Not%'
order by price;
