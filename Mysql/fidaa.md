annapoorani@FDLDL0186:~$ mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.28 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SHOW DATABASE;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DATABASE' at line 1
mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| office             |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> CREATE DATABASE fidaa;
Query OK, 1 row affected (0.01 sec)

mysql> CREATE TABLE user_info (id int PRIMARY KEY AUTO_INCREMENT, email varchar(30) UNIQUE NOT NULL , dob date NOT NULL , gender ENUM('M','F','T','L','G'), profile_name varchar(10) UNIQUE NOT NULL);
ERROR 1046 (3D000): No database selected
mysql> USE fidaa;
Database changed
mysql> CREATE TABLE user_info (id int PRIMARY KEY AUTO_INCREMENT, email varchar(30) UNIQUE NOT NULL , dob date NOT NULL , gender ENUM('M','F','T','L','G'), profile_name varchar(10) UNIQUE NOT NULL);
Query OK, 0 rows affected (0.07 sec)

mysql> DESC user_info;
+--------------+---------------------------+------+-----+---------+----------------+
| Field        | Type                      | Null | Key | Default | Extra          |
+--------------+---------------------------+------+-----+---------+----------------+
| id           | int                       | NO   | PRI | NULL    | auto_increment |
| email        | varchar(30)               | NO   | UNI | NULL    |                |
| dob          | date                      | NO   |     | NULL    |                |
| gender       | enum('M','F','T','L','G') | YES  |     | NULL    |                |
| profile_name | varchar(10)               | NO   | UNI | NULL    |                |
+--------------+---------------------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

mysql> 
mysql> ALTER TABLE user_info ALTER COLUMN profile_name DEFAULT('NONE');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DEFAULT('NONE')' at line 1
mysql> ALTER TABLE user_info ALTER COLUMN profile_name DEFAULT 'NONE';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'DEFAULT 'NONE'' at line 1
mysql> DROP TABLE user_info;
Query OK, 0 rows affected (0.03 sec)

mysql> CREATE TABLE user_info (id int PRIMARY KEY AUTO_INCREMENT, email varchar(30) UNIQUE NOT NULL , dob date NOT NULL , gender ENUM('M','F','T','L','G'), profile_name varchar(10) UNIQUE NOT NULL DEFAULT 'fidaa_user');
Query OK, 0 rows affected (0.18 sec)

mysql> DESC user_info;
+--------------+---------------------------+------+-----+------------+----------------+
| Field        | Type                      | Null | Key | Default    | Extra          |
+--------------+---------------------------+------+-----+------------+----------------+
| id           | int                       | NO   | PRI | NULL       | auto_increment |
| email        | varchar(30)               | NO   | UNI | NULL       |                |
| dob          | date                      | NO   |     | NULL       |                |
| gender       | enum('M','F','T','L','G') | YES  |     | NULL       |                |
| profile_name | varchar(10)               | NO   | UNI | fidaa_user |                |
+--------------+---------------------------+------+-----+------------+----------------+
5 rows in set (0.01 sec)

mysql> INSERT INTO user_info VALUE (null,'Anu_07@gmail.com','27/02/2004','F','Ammu_27');
ERROR 1292 (22007): Incorrect date value: '27/02/2004' for column 'dob' at row 1
mysql> INSERT INTO user_info VALUE (null,'Anu_07@gmail.com','2004/02/27','F','Ammu_27');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM user_info;
+----+------------------+------------+--------+--------------+
| id | email            | dob        | gender | profile_name |
+----+------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com | 2004-02-27 | F      | Ammu_27      |
+----+------------------+------------+--------+--------------+
1 row in set (0.00 sec)

mysql> INSERT INTO user_info (id,email,dob,gender)VALUE (null,'Sara10@gmail.com','1999/12/12','T');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM user_info;
+----+------------------+------------+--------+--------------+
| id | email            | dob        | gender | profile_name |
+----+------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com | 1999-12-12 | T      | fidaa_user   |
+----+------------------+------------+--------+--------------+
2 rows in set (0.00 sec)

mysql> INSERT INTO user_info VALUE (null,'Babu_21@gmail.com','1989/04/21','M','Bobby_21'),(null,'Sushanth@gmail.com','1990/1/23','M','Naughty_Boy'),(null,'Pallavi@gmail.com','2000/12/12','L','Cutie_Pie');
ERROR 1406 (22001): Data too long for column 'profile_name' at row 2
mysql> INSERT INTO user_info VALUE (null,'Babu_21@gmail.com','1989/04/21','M','Bobby_21'),(null,'Sushanth@gmail.com','1990/1/23','M','King_23'),(null,'Pallavi@gmail.com','2000/12/12','L','Cutie_Pie');
Query OK, 3 rows affected (0.00 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM user_info;
+----+--------------------+------------+--------+--------------+
| id | email              | dob        | gender | profile_name |
+----+--------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  6 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  7 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  8 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |
+----+--------------------+------------+--------+--------------+
5 rows in set (0.01 sec)

mysql> UPDATE user_info SET id=3 WHERE profile_name ='Bobby_21'
    -> ;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM user_info;
+----+--------------------+------------+--------+--------------+
| id | email              | dob        | gender | profile_name |
+----+--------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  7 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  8 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |
+----+--------------------+------------+--------+--------------+
5 rows in set (0.00 sec)

mysql> UPDATE user_info SET id=4 WHERE profile_name ='King_23';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM user_info;
+----+--------------------+------------+--------+--------------+
| id | email              | dob        | gender | profile_name |
+----+--------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  4 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  8 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |
+----+--------------------+------------+--------+--------------+
5 rows in set (0.00 sec)

mysql> UPDATE user_info SET id=5 WHERE profile_name ='Cutie_pie';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT * FROM user_info;
+----+--------------------+------------+--------+--------------+
| id | email              | dob        | gender | profile_name |
+----+--------------------+------------+--------+--------------+
|  1 | Anu_07@gmail.com   | 2004-02-27 | F      | Ammu_27      |
|  2 | Sara10@gmail.com   | 1999-12-12 | T      | fidaa_user   |
|  3 | Babu_21@gmail.com  | 1989-04-21 | M      | Bobby_21     |
|  4 | Sushanth@gmail.com | 1990-01-23 | M      | King_23      |
|  5 | Pallavi@gmail.com  | 2000-12-12 | L      | Cutie_Pie    |
+----+--------------------+------------+--------+--------------+
5 rows in set (0.00 sec)

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
