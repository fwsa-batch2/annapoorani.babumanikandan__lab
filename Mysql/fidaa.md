# Fidaa_Database

## Show Database

```
 SHOW DATABASES:
 ```
 ### Result :
 

| Database           |
|:------------------:|
| information_schema |
| mysql              |
| office             |
| performance_schema |
| sys                |


## Create a database as 'fidaa' :

```
 CREATE DATABASE fidaa;
 ```

## Select a database :

```
USE fidaa;
```
### Result :
Database changed

## Create a table named as 'user_info' :

```
CREATE TABLE user_info (id int PRIMARY KEY AUTO_INCREMENT, email varchar(30) UNIQUE NOT NULL , dob date NOT NULL , gender ENUM('M','F','T','L','G'), profile_name varchar(10) UNIQUE NOT NULL DEFAULT 'fidaa_user');
```

## Describe a table named as 'user_info' :

```
 DESC user_info;
 ```
 ### Result :


| Field        | Type                      | Null | Key | Default    | Extra          |
|:------------:|:-------------------------:|:----:|:---:|:----------:|:--------------:|
| id           | int                       | NO   | PRI | NULL       | auto_increment |
| email        | varchar(30)               | NO   | UNI | NULL       |                |
| dob          | date                      | NO   |     | NULL       |                |
| gender       | enum('M','F','T','L','G') | YES  |     | NULL       |                |
| profile_name | varchar(10)               | NO   | UNI | fidaa_user |                |


## Inserting values into user_info table :

```
INSERT INTO user_info VALUES (null,'Anu_07@gmail.com','2004/02/27','F','Ammu_27'),(null,'Babu_21@gmail.com','1989/04/21','M','Bobby_21'),(null,'Sushanth@gmail.com','1990/1/23','M','King_23'),(null,'Pallavi@gmail.com','2000/12/12','L','Cutie_Pie'),(null,'Arjun@gmail.com','2007/03/8','M','Ajju_01');
```

## Inserting a values without the profile_name in user_info table :

```
INSERT INTO user_info (id,email,dob,gender)VALUES (null,'Sara10@gmail.com ','1999-12-12','T' );
```
## Select a whole table named as 'user_info' : 

```
SELECT * FROM user_info;
```

### Result :


| id | email              | dob        | gender | profile_name |
|:--:|:------------------:|:----------:|:------:|:------------:|
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  4 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  5 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |
|  6 | Arjun@gmail.com    | 2007-03-08 | M      | Ajju_01      |


## Create a table named as 'user_credentials'
```
CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFERENCES user_info(id));
```

## Describe a table named as 'user_credentials' :
```
 DESC user_credentials;
 ```
 ### Result :

| Field            | Type        | Null | Key | Default | Extra |
|:----------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| user_id          | int         | NO   | MUL | NULL    |       |
| password         | varchar(20) | NO   | PRI | NULL    |       |
| confirm_password | varchar(20) | NO   | UNI | NULL    |       |


## List out all the tables in a fidaa db:

```
 SHOW TABLES;
 ```

| Tables_in_fidaa  |
|:----------------:|
| user_credentials |
| user_info        |


## Select a table named as 'user_credentials' :

```
SELECT * FROM user_credentials;
```
### Result :

Empty set (0.00 sec)

## Describe the user_credentials table :
```
DESC user_credentials;
```

### Result :

| Field            | Type        | Null | Key | Default | Extra |
|:----------------:|:-----------:|:----:|:---:|:-------:|:-----:|
| user_id          | int         | NO   | MUL | NULL    |       |
| password         | varchar(20) | NO   | PRI | NULL    |       |
| confirm_password | varchar(20) | NO   | UNI | NULL    |       |

## To see all the values of user_info :

```
 SELECT * FROM user_info;
 ```
 
 ### Result :
 
| id | email              | dob        | gender | profile_name |
|:--:|:------------------:|:----------:|:------:|:------------:|
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  4 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  5 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |


## Inserting values into 'user_credentials' table :
```
 INSERT INTO user_credentials VALUES (1,'@nuBha_07','@nuBha_07');
 ```
 ```
 INSERT INTO user_credentials VALUES (2,'SA@r@_10','SA@r@_10'),(3,'B0bby_21#Bob','B0bby_21#Bob'),(4,'Su$h@@n_King','Su$h@@n_King'),(5,'P@ll@vi1','P@ll@vi1');
 ```

## To see all the values in user_credentials table :

```
 SELECT * FROM user_credentials;
 ```
 
| user_id | password     | confirm_password |
|:-------:|:------------:|:----------------:|
|       1 | @nuBha_07    | @nuBha_07        |
|       3 | B0bby_21#Bob | B0bby_21#Bob     |
|       5 | P@ll@vi1     | P@ll@vi1         |
|       2 | SA@r@_10     | SA@r@_10         |
|       4 | Su$h@@n_King | Su$h@@n_King     |



## Joining the 'user_info' table and 'user_credentials' tables to get all the values :

```
 SELECT * FROM user_info AS ui INNER JOIN user_credentials AS uc ON ui.id = uc.user_id;
```

| id | email              | dob        | gender | profile_name | user_id | password     | confirm_password |
|:--:|:------------------:|:----------:|:------:|:------------:|:-------:|:------------:|:----------------:|
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |       1 | @nuBha_07    | @nuBha_07        |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |       2 | SA@r@_10     | SA@r@_10         |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |       3 | B0bby_21#Bob | B0bby_21#Bob     |
|  4 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |       4 | Su$h@@n_King | Su$h@@n_King     |
|  5 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |       5 | P@ll@vi1     | P@ll@vi1         |


## Want a whole value whose email is 'Anu_07@gmail.com' ( Using Joins ) :

```
 SELECT * FROM user_info AS ui INNER JOIN user_credentials AS uc ON ui.id = uc.user_id WHERE email='Anu_07@gmail.com';
 ```
 
### Result :

| id | email            | dob        | gender | profile_name | user_id | password  | confirm_password |
|:--:|:----------------:|:----------:|:------:|:------------:|:-------:|:---------:|:----------------:|
|  1 | Anu_07@gmail.com | 2004-02-27 | F      | Ammu_27      |       1 | @nuBha_07 | @nuBha_07        |






## Create a table named as 'language' :
```
 CREATE TABLE language (id int PRIMARY KEY AUTO_INCREMENT, lang varchar(20) UNIQUE NOT NULL);
 ```

## Describe the 'language' table :
 ```
 DESC language;
 ```
### Result :

| Field | Type        | Null | Key | Default | Extra          |
|:-----:|:-----------:|:----:|:---:|:-------:|:--------------:|
| id    | int         | NO   | PRI | NULL    | auto_increment |
| lang  | varchar(20) | NO   | UNI | NULL    |                |


## Inserting values into 'language' table :

```
 INSERT INTO language VALUES (null,'Tamil'),(null,'Telugu'),(null,'Malayalam'),(null,'Kannada'),(null,'Hindi'),(null,'Korean'),(null,'Chinese'),(null,'Bengali');
```

## To See all the values in language table :

```
mysql> SELECT * FROM language;
```

### Result :

| id | lang      |
|:--:|:---------:|
|  8 | Bengali   |
|  7 | Chinese   |
|  5 | Hindi     |
|  4 | Kannada   |
|  6 | Korean    |
|  3 | Malayalam |
|  1 | Tamil     |
|  2 | Telugu    |

## Create a table named as 'actors' :

```
 CREATE TABLE actors(id int PRIMARY KEY AUTO_INCREMENT,name varchar(30) UNIQUE NOT NULL);
 ```
 

## Describe the 'actors' table :

```
 DESC actors;
 ```
 ### Result :

| Field | Type        | Null | Key | Default | Extra          |
|:-----:|:-----------:|:----:|:---:|:-------:|:--------------:|
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   | UNI | NULL    |                |

## Inserting values into 'actors' table :
```
 INSERT INTO actors VALUES(null,'Vijay'),(null,'Surya'),(null,'Ajith'),(null,'Simbhu'),(null,'Vijay Devarakonda'),(null,'Prashanth'),(null,'Vishal'),(null,'Sushanth Singh Rajput'),(null,'Ramcharan'),(null,'Nani');
 ```
 ## To see all the values in 'actors' table :
 
```
SELECT * FROM actors;
```
### Result :

| id | name                  |
|:--:|:---------------------:|
|  3 | Ajith                 |
| 10 | Nani                  |
|  6 | Prashanth             |
|  9 | Ramcharan             |
|  4 | Simbhu                |
|  2 | Surya                 |
|  8 | Sushanth Singh Rajput |
|  1 | Vijay                 |
|  5 | Vijay Devarakonda     |
|  7 | Vishal                |


## Create a table named as 'actress' :

```
 CREATE TABLE actress(id int PRIMARY KEY AUTO_INCREMENT,name varchar(30) UNIQUE NOT NULL);
 ```
 
 ## Inserting values into 'actress' table :
``` 
 INSERT INTO actress VALUES(null,'Sai pallavi'),(null,'Kajal'),(null,'Kajol'),(null,'Hansika'),(null,'Anu'),(null,'Jothika'),(null,'Nagma');
 ```
 
## To see all the values from 'actress' table :
```
SELECT * FROM actress;
```

| id | name        |
|:--:|:-----------:|
|  5 | Anu         |
|  4 | Hansika     |
|  6 | Jothika     |
|  2 | Kajal       |
|  3 | Kajol       |
|  7 | Nagma       |
|  1 | Sai pallavi |



## Create table named as 'director' :
```
 CREATE TABLE director(id int PRIMARY KEY AUTO_INCREMENT,name varchar(20) UNIQUE NOT NULL);
 ```
 ## Describe the 'director' table :
 ```
 DESC director;
```
### Result :

| Field | Type        | Null | Key | Default | Extra          |
|:-----:|:-----------:|:----:|:---:|:-------:|:--------------:|
| id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(20) | NO   | UNI | NULL    |                |


 ## Inserting values into 'director' table :

```
 INSERT INTO director VALUES(null,'Mani Ratnam'),(null,'Dhanush'),(null,'Selva Ragavan'),(null,'Joji'),(null,'Vignesh Shivan');
 ```

## To see all the values from 'director' table :
```
 SELECT * FROM director;
```

| id | name           |
|:--:|:--------------:|
|  2 | Dhanush        |
|  4 | Joji           |
|  1 | Mani Ratnam    |
|  3 | Selva Ragavan  |
|  5 | Vignesh Shivan |

## To see all the tables
```
 SHOW TABLES;
 ```

| Tables_in_fidaa  |
|:----------------:|
| actors           |
| actress          |
| director         |
| language         |
| user_credentials |
| user_info        |




