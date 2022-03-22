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
INSERT INTO user_info VALUES (null,'Anu_07@gmail.com','2004/02/27','F','Ammu_27'),(null,'Babu_21@gmail.com','1989/04/21','M','Bobby_21'),(null,'Sushanth@gmail.com','1990/1/23','M','King_23'),(null,'Pallavi@gmail.com','2000/12/12','L','Cutie_Pie');
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


## Create a table named as 'user_credentials'
mysql> CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id), user_credentials REFRENCES user_info(id) );
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ', user_credentials REFRENCES user_info(id) )' at line 1
mysql> CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id), REFRENCES user_info(id))
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ', REFRENCES user_info(id))' at line 1
mysql> CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFRENCES user_info(id) )
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'REFRENCES user_info(id) )' at line 1
mysql> CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFRENCES user_info(id) )
    -> 
    -> k;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'REFRENCES user_info(id) )

k' at line 1
mysql> CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFRENCES user_info(id) )
    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'REFRENCES user_info(id) )' at line 1
mysql>  CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFRENCES user_info(id);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'REFRENCES user_info(id)' at line 1
mysql>  CREATE TABLE user_credentials (user_id int NOT NULL,password varchar(20) UNIQUE NOT NULL, confirm_password varchar(20) UNIQUE NOT NULL, FOREIGN KEY(user_id) REFERENCES user_info(id));
Query OK, 0 rows affected (0.06 sec)

mysql> DESC user_crendentials;
ERROR 1146 (42S02): Table 'fidaa.user_crendentials' doesn't exist
mysql> DESC user_credentials;
+------------------+-------------+------+-----+---------+-------+
| Field            | Type        | Null | Key | Default | Extra |
+------------------+-------------+------+-----+---------+-------+
| user_id          | int         | NO   | MUL | NULL    |       |
| password         | varchar(20) | NO   | PRI | NULL    |       |
| confirm_password | varchar(20) | NO   | UNI | NULL    |       |
+------------------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)
