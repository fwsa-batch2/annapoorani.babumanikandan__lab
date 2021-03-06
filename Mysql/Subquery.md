 
 ## Subquery
 
 ### Create a table as employees
 
 ```
 CREATE TABLE employees(id int primary key auto_increment, epm_name varchar(30) unique not null,age tinyint not null, gender enum('F','M') ,Dept varchar(30) default 'IT',city varchar(30) not null ,salary int not null ) ;
 ```

### Describe the table
```
 DESC employees;
 ```

| Field    | Type          | Null | Key | Default | Extra          |
|:--------:|:-------------:|:----:|:---:|:-------:|:--------------:|
| id       | int           | NO   | PRI | NULL    | auto_increment |
| epm_name | varchar(30)   | NO   | UNI | NULL    |                |
| age      | tinyint       | NO   |     | NULL    |                |
| gender   | enum('F','M') | YES  |     | NULL    |                |
| Dept     | varchar(30)   | YES  |     | IT      |                |
| city     | varchar(30)   | NO   |     | NULL    |                |
| salary   | int           | NO   |     | NULL    |                |




### Inserting the values in employees table

```
INSERT INTO employees VALUES( null,'Anuraj',25,'F',IT'Chennai',75000), ( null,'Nidhima',27,'F','Sales','Chennai',85000),(null,'Sangeetha',32,'F','Marketing','Bangalore',100000),(null,'Adi',42,'M','Sales','Bangalore',60000),(null,'Vaishnavi',30,'F','Marketing','Mumbai',90000),(null,'Keerthana',29,'F','IT','Mumbai',100000);
```


### Select the table 
```
SELECT * FROM employees;
```

| id | epm_name  | age | gender | Dept      | city      | salary |
|:--:|:---------:|:---:|:------:|:---------:|:---------:|:------:|
|  1 | Anuraj    |  25 | M      | IT        | Chennai   |  75000 |
|  2 | Nidhima   |  27 | F      | Sales     | Chennai   |  85000 |
|  3 | Sangeetha |  32 | F      | Marketing | Bangalore | 100000 |
|  4 | Adi       |  42 | M      | Sales     | Bangalore |  60000 |
|  5 | Vaishnavi |  30 | F      | Marketing | Mumbai    |  90000 |
|  6 | Keerthana |  29 | F      | IT        | Mumbai    | 100000 |


### Find the max salary of employees with dept by using subquery
```
 SELECT Dept FROM employees WHERE salary =(SELECT MAX(salary) FROM employees);
 ```

| Dept      |
|:---------:|
| Marketing |
| IT        |


### find the max salary of employees
```
SELECT MAX(salary) FROM employees;
```


| MAX(salary) |
|:-----------:|
|      100000 |



## Find the min salary of employees with dept by using subquery
```
SELECT Dept FROM employees WHERE salary =(SELECT MIN(salary) FROM employees);
```

| Dept  |
|:-----:|
| Sales |



### find the min salary of employees
```
 SELECT MIN(salary) FROM employees;
 ```
 

| MIN(salary) |
|:-----------:|
|       60000 |

## Find the avg of the salary from employees with dept,salary by using subquery
```
SELECT Dept,salary FROM employees WHERE salary =(SELECT AVG(salary) FROM employees);
```

| Dept  | salary |
|:-----:|:------:|
| Sales |  85000 |



### Find the salary which is less than the avg salary of employees 
```
SELECT epm_name, Dept, salary FROM employees WHERE salary <(SELECT AVG(salary) FROM employees);
```

| epm_name | Dept  | salary |
|:--------:|:-----:|:------:|
| Anuraj   | IT    |  75000 |
| Adi      | Sales |  60000 |


### AVG of the salary
```
 SELECT AVG(salary) FROM employees;
 ```

| AVG(salary) |
|:-----------:|
|  85000.0000 |




## Create a table named as 'products'
```
CREATE TABLE products (p_id int primary key auto_increment, p_name varchar(30) not null unique,sell_price int, p_type Enum('Luxury','Non-Luxury'));
```

## Desc the 'products' table 
```
 DESC products;
 ```

| Field      | Type                        | Null | Key | Default | Extra          |
|:----------:|:---------------------------:|:----:|:---:|:-------:|:--------------:|
| p_id       | int                         | NO   | PRI | NULL    | auto_increment |
| p_name     | varchar(30)                 | NO   | UNI | NULL    |                |
| sell_price | int                         | YES  |     | NULL    |                |
| p_type     | enum('Luxury','Non-Luxury') | YES  |     | NULL    |                |


## Insert values in the products table
```
 INSERT INTO products VALUES (null,'T-shirt',150,'Non-Luxury'),(null,'Mobile',15000,'Luxury'), (null,'AC',40000,'Luxury');
```

## Select the products table

```
 SELECT * FROM products;
 ```
 
| p_id | p_name  | sell_price | p_type     |
|:----:|:-------:|:----------:|:----------:|
|    1 | T-shirt |        150 | Non-Luxury |
|    2 | Mobile  |      15000 | Luxury     |
|    3 | AC      |      40000 | Luxury     |


## Create a table named as 'orders'
```
CREATE TABLE orders (order_id int , p_soled varchar(30),selling_price int );
```

## Insert values in the 'orders' table
```
 INSERT INTO orders SELECT p_id ,p_name,sell_price FROM products WHERE p_id IN (SELECT p_id FROM products WHERE sell_price >150);
```

## Select the orders table
```
SELECT * FROM orders;
```

| order_id | p_soled | selling_price |
|:--------:|:-------:|:-------------:|
|        2 | Mobile  |         15000 |
|        3 | AC      |         40000 |



