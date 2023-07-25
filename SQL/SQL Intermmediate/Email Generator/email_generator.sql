-- Create a new column "email" with the generated email addresses
SELECT
  CONCAT(LOWER(firstname), '.', LOWER(lastname), '@company.com') AS email
FROM
  Employees
ORDER BY
  email ASC;
