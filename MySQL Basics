 
 
 
 CREATE TABLE employees(id int primary key auto_increment, epm_name varchar(30) unique not null,age tinyint not null, gender enum('F','M') ,Dept varchar(30) default 'IT',city varchar(30) not null ,salary int not null ) ;
Query OK, 0 rows affected (0.05 sec)

mysql> DESC employees;
+----------+---------------+------+-----+---------+----------------+
| Field    | Type          | Null | Key | Default | Extra          |
+----------+---------------+------+-----+---------+----------------+
| id       | int           | NO   | PRI | NULL    | auto_increment |
| epm_name | varchar(30)   | NO   | UNI | NULL    |                |
| age      | tinyint       | NO   |     | NULL    |                |
| gender   | enum('F','M') | YES  |     | NULL    |                |
| Dept     | varchar(30)   | YES  |     | IT      |                |
| city     | varchar(30)   | NO   |     | NULL    |                |
| salary   | int           | NO   |     | NULL    |                |
+----------+---------------+------+-----+---------+----------------+
7 rows in set (0.01 sec)


INSERT INTO employees VALUES ;
Query OK, 1 row affected (0.01 sec)

INSERT INTO employees VALUES( null,'Anuraj',25,'F',IT'Chennai',75000), ( null,'Nidhima',27,'F','Sales','Chennai',85000),(null,'Sangeetha',32,'F','Marketing','Bangalore',100000),(null,'Adi',42,'M','Sales','Bangalore',60000),(null,'Vaishnavi',30,'F','Marketing','Mumbai',90000),(null,'Keerthana',29,'F','IT','Mumbai',100000);


Query OK, 6 rows affected (0.01 sec)
Records: 6 Duplicates: 0  Warnings: 0

mysql> SELECT * FROM employees;
+----+-----------+-----+--------+-----------+-----------+--------+
| id | epm_name  | age | gender | Dept      | city      | salary |
+----+-----------+-----+--------+-----------+-----------+--------+
|  1 | Anuraj    |  25 | M      | IT        | Chennai   |  75000 |
|  2 | Nidhima   |  27 | F      | Sales     | Chennai   |  85000 |
|  3 | Sangeetha |  32 | F      | Marketing | Bangalore | 100000 |
|  4 | Adi       |  42 | M      | Sales     | Bangalore |  60000 |
|  5 | Vaishnavi |  30 | F      | Marketing | Mumbai    |  90000 |
|  6 | Keerthana |  29 | F      | IT        | Mumbai    | 100000 |
+----+-----------+-----+--------+-----------+-----------+--------+
6 rows in set (0.00 sec)

mysql> SELECT Dept FROM employees WHERE salary =(SELECT MAX(salary) FROM employees);
+-----------+
| Dept      |
+-----------+
| Marketing |
| IT        |
+-----------+
2 rows in set (0.00 sec)

mysql> SELECT MAX(salary) FROM employees;
+-------------+
| MAX(salary) |
+-------------+
|      100000 |
+-------------+
1 row in set (0.00 sec)


SELECT Dept FROM employees WHERE salary =(SELECT MIN(salary) FROM employees);
+-------+
| Dept  |
+-------+
| Sales |
+-------+
1 row in set (0.00 sec)

mysql> SELECT MIN(salary) FROM employees;
+-------------+
| MIN(salary) |
+-------------+
|       60000 |
+-------------+
1 row in set (0.00 sec)


SELECT epm_name, Dept, salary FROM employees WHERE salary <(SELECT AVG(salary) FROM employees);
+----------+-------+--------+
| epm_name | Dept  | salary |
+----------+-------+--------+
| Anuraj   | IT    |  75000 |
| Adi      | Sales |  60000 |
+----------+-------+--------+
2 rows in set (0.00 sec)

mysql> (SELECT AVG(salary) FROM employees);
+-------------+
| AVG(salary) |
+-------------+
|  85000.0000 |
+-------------+
1 row in set (0.00 sec)



CREATE TABLE products (p_id int primary key auto_increment, p_name varchar(30) not null unique,sell_price int, p_type Enum('Luxury','Non-Luxury'));
Query OK, 0 rows affected (0.05 sec)

mysql> DESC products;
+------------+-----------------------------+------+-----+---------+----------------+
| Field      | Type                        | Null | Key | Default | Extra          |
+------------+-----------------------------+------+-----+---------+----------------+
| p_id       | int                         | NO   | PRI | NULL    | auto_increment |
| p_name     | varchar(30)                 | NO   | UNI | NULL    |                |
| sell_price | int                         | YES  |     | NULL    |                |
| p_type     | enum('Luxury','Non-Luxury') | YES  |     | NULL    |                |
+------------+-----------------------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql> INSERT INTO products VALUES (null,'T-shirt',150,'Non-Luxury');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM products;
+------+---------+------------+------------+
| p_id | p_name  | sell_price | p_type     |
+------+---------+------------+------------+
|    1 | T-shirt |        150 | Non-Luxury |
+------+---------+------------+------------+
1 row in set (0.00 sec)

mysql> INSERT INTO products VALUES (null,'Mobile',15000,'Luxury');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO products VALUES (null,'AC',40000,'Luxury');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM products;
+------+---------+------------+------------+
| p_id | p_name  | sell_price | p_type     |
+------+---------+------------+------------+
|    1 | T-shirt |        150 | Non-Luxury |
|    2 | Mobile  |      15000 | Luxury     |
|    3 | AC      |      40000 | Luxury     |
+------+---------+------------+------------+
3 rows in set (0.00 sec)





CREATE TABLE orders (order_id int , p_soled varchar(30),selling_price int );
Query OK, 0 rows affected (0.04 sec)





mysql> INSERT INTO orders SELECT p_id ,p_name,sell_price FROM products WHERE p_id IN (SELECT p_id FROM products WHERE sell_price >150);
Query OK, 2 rows affected (0.00 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM orders;
+----------+---------+---------------+
| order_id | p_soled | selling_price |
+----------+---------+---------------+
|        2 | Mobile  |         15000 |
|        3 | AC      |         40000 |
+----------+---------+---------------+
2 rows in set (0.00 sec)



