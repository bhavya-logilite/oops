/*how to creat a table*/
CREATE TABLE Players(
	fname varchar(1000),
	lname varchar(1000),
	Mobile_no bigint,
	email varchar(1000)	
);
/*queries to insert a values in table*/
INSERT INTO Players(fname,lname,Mobile_no,email)
VALUES ('bhavya','purani',8866687622,'bhavya@gmail.com');
/*querie for droping a table*/
DROP TABLE Customers;
/* querie for selecting the whole table */
SELECT * FROM customer;
/* querie for selecting city and mobile number from customer table */
SELECT * FROM customer;
/*querie for the distinct selection from the table */
SELECT DISTINCT city FROM customer;
/*querie for the count of the  city from table */
SELECT COUNT (city)  FROM customer;  
/*querie for the count of the distinct city selection from table */
SELECT COUNT (DISTINCT city) FROM customer;
/* querie for where for text using = operator*/ 
SELECT * FROM customer WHERE city='amreli';
/* querie for where for number using = operator */
SELECT * FROM customer WHERE  id=1;
/* querie for where for number using > operator */
SELECT * FROM customer WHERE salary>10000;
/* querie for where for number using < operator */
SELECT * FROM customer WHERE salary<40000;
/* querie for where for number using >= operator */
SELECT * FROM customer WHERE salary>=30000;
/* querie for where for number using <= operator */
SELECT * FROM customer WHERE salary<=30000;
/* querie for where for number using <> operator */
SELECT * FROM customer WHERE salary<>30000;
/* querie for where for number using BETWEEN operator */
SELECT * FROM customer WHERE salary BETWEEN 20000 AND 50000;
/* querie for where for number using LIKE operator */
SELECT * FROM customer WHERE city like 'a%';
/* querie for where for number using IN operator */ 
SELECT * FROM customer WHERE city IN ('amreli');
/* querie for and operator */
SELECT * FROM customer WHERE city ='amreli' AND salary=30000;
/* querie for or operator */
SELECT * FROM customer WHERE  city='amreli' OR city='surat';
/* querie for not operator */
SELECT * FROM customer WHERE NOT city='amreli';
/* querie for and,or  combine operator */
SELECT * FROM customer WHERE city='amreli'AND (city='amreli' OR city='surat');
/* querie for and,not  combine operator */
SELECT * FROM customer WHERE NOT salary=10000 AND NOT salary=40000;
/*querie of order by functio */
SELECT * FROM customer ORDER BY salary DESC;
/* querie for set not null value for table */
SELECT * FROM customer WHERE salary IS NOT NULL;
/*querie for updating table value */
UPDATE customer 
SET last_name = 'patel'
WHERE id=1; 
/*querie for deleting from the table*/
DELETE FROM customer WHERE salary=40000;
/* querie for setting the limit for the output of queries form the table*/
SELECT * FROM customer
WHERE city='amreli'
LIMIT 1;
/* querie for min value from the column */
SELECT MIN(SALARY)
FROM customer;
/* querie for max value from the column*/
SELECT MAX(salary)
FROM customer;
/* querie for count from the colunm*/
SELECT COUNT(city)
FROM customer;
WHERE city='amreli'
/*querie for sum function on table */
SELECT SUM(salary)
FROM customer;
/* querie for avg function on table*/
SELECT AVG(salary)
FROM customer;
/*querie for using wildcard characters having letter at end */
SELECT * FROM customer WHERE city like '%i';
/*querie for using wildcard characters having letter at anywhere */
SELECT * FROM customer WHERE city like '%a%';
/*querie for using wildcard character, Finds any values that starts with "a" and are at least 3 characters in length */
SELECT * FROM customer WHERE city like '%a___%';
/*querie for using wildcard, Finds any values that starts with "a" and ends with "o" */
SELECT * FROM customer WHERE city like 'a%i';
/*querie shows the usage of in function  */
SELECT * FROM customer WHERE city IN ('amreli');
/* querie show the usage of in with not */
SELECT * FROM customer WHERE city NOT IN ('amreli');
/*querie for changing the column name */
SELECT salary AS payroll FROM customer;
 
