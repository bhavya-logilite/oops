/*querie using unon command*/
SELECT city FROM customer
UNION
SELECT fname FROM players
ORDER BY city;
/* queries using groupby command*/
SELECT COUNT(id), email
FROM customer
GROUP BY email
ORDER BY COUNT(id) DESC;
/* querir using having command */
SELECT COUNT(ID), salary
FROM customer
GROUP BY salary
HAVING COUNT(id) > 10000;
/*querie using exists command*/
SELECT salary
FROM customer
WHERE EXISTS (SELECT salary FROM customer WHERE salary > 10000);
/*querie usinng any command*/
SELECT salary
FROM customer
WHERE id = ANY
(SELECT id FROM customer WHERE salary = 20000);
/* querie using  into command*/
SELECT * INTO city
FROM customer;
/* querie using insert command*/
INSERT INTO customer (first_name, city, email)
SELECT first_name, city, email FROM customer
WHERE city='surat';
/* querir */
SELECT city
FROM customer
ORDER BY
(CASE
    WHEN city IS NULL THEN email
    ELSE City
END);
/* comments in sql*/
SELECT * FROM customer --where salary is more 10000
