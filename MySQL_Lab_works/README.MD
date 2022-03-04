SHOW DATABASES;

| Database           |
|--------------------|
| college            |
| fidaa              |
| fidaa_copy         |
| information_schema |
| library            |
| movie              |
| mysql              |
| office             |
| performance_schema |
| sys                |
| tuition            |



``` CREATE DATABASE school;
```

Query OK, 1 row affected (0.01 sec)

``` USE school;
```
Database changed
mysql> create table students (
    -> id int primary key auto_increment,
    -> name varchar(100) not null,
    -> email varchar(100) not null,
    -> mobile_no bigint not null,
    -> password varchar(100) not null,
    -> gender char(1) not null,
    -> dob date,
    -> created_date timestamp not null default current_timestamp,
    -> unique (email),
    -> check ( gender in ('M','F'))
    -> );
Query OK, 0 rows affected (0.05 sec)



mysql> create table student_class (id int primary key auto_increment, student_id int not null, class int not null, status varchar(20) not null, foreign key (student_id) references students(id), check( class >= 1 and class <=12), check (status in ('ACTIVE','INACTIVE')));

mysql> SHOW TABLES;
+------------------+
| Tables_in_school |
+------------------+
| students         |
+------------------+
1 row in set (0.01 sec)

mysql> DESC students;
+--------------+--------------+------+-----+-------------------+-------------------+
| Field        | Type         | Null | Key | Default           | Extra             |
+--------------+--------------+------+-----+-------------------+-------------------+
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+--------------+--------------+------+-----+-------------------+-------------------+
8 rows in set (0.00 sec)


Feature 1 : Register the students


mysql> INSERT INTO students (name,email,mobile_no,password,gender,dob) VALUES ('Anu','Anu_01@gmail.com',9828374654,'@nu_91','F','2012-02-01'),('Mano','Mano1@gmail.com',9828371624,'M@no_01','M','2012-12-12'),('Aaron','Aaron@gmail.com',9788371624,'Aaro_07','M','2013-12-12');
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0



Feature 2 : List all students;

mysql> SELECT * FROM students;
+----+-------+------------------+------------+----------+--------+------------+---------------------+
| id | name  | email            | mobile_no  | password | gender | dob        | created_date        |
+----+-------+------------------+------------+----------+--------+------------+---------------------+
|  1 | Anu   | Anu_01@gmail.com | 9828374654 | @nu_91   | F      | 2000-02-12 | 2022-03-01 22:42:51 |
|  2 | Mano  | Mano1@gmail.com  | 9828371624 | M@no_01  | M      | 2003-08-07 | 2022-03-01 22:42:51 |
|  3 | Aaron | Aaron@gmail.com  | 9788371624 | Aaro_07  | M      | 2002-03-01 | 2022-03-01 22:42:51 |
+----+-------+------------------+------------+----------+--------+------------+---------------------+
3 rows in set (0.00 sec)

Feature 3: Login with email and password


SELECT * FROM students WHERE email='Anu_01@gmail.com' AND password='@nu_91';
    
+----+------+------------------+------------+----------+--------+------------+---------------------+
| id | name | email            | mobile_no  | password | gender | dob        | created_date        |
+----+------+------------------+------------+----------+--------+------------+---------------------+
|  1 | Anu  | Anu_01@gmail.com | 9828374654 | @nu_91   | F      | 2000-02-12 | 2022-03-01 22:42:51 |
+----+------+------------------+------------+----------+--------+------------+---------------------+
1 row in set (0.00 sec)


Feature 4: Update Password
    
    UPDATE students SET password ='M@no_09' WHERE email='Mano1@gmail.com';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

Result :

SELECT * FROM students WHERE email='Mano1@gmail.com';
+----+------+-----------------+------------+----------+--------+------------+---------------------+
| id | name | email           | mobile_no  | password | gender | dob        | created_date        |
+----+------+-----------------+------------+----------+--------+------------+---------------------+
|  2 | Mano | Mano1@gmail.com | 9828371624 | M@no_09  | M      | 2003-08-07 | 2022-03-01 22:42:51 |
+----+------+-----------------+------------+----------+--------+------------+---------------------+
1 row in set (0.00 sec)


Feature 5: Enroll Student into Class

INSERT INTO student_class VALUES (null,1,5,'active');


Feature 6: Find Students who are enrolled in the given class
For 6th question: Find Students who are studying in 5th standard.


SELECT * FROM student_class WHERE class=5;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     5 | active   |
|  2 |          2 |     5 | inactive |
+----+------------+-------+----------+

 Feature 7: Update Student Class information #Update student from 5th standard to 6th standard.

UPDATE student_class SET class =6 WHERE class=5;

Query OK, 3 rows affected (0.01 sec)
Rows matched: 3  Changed: 3  Warnings: 0


Feature 8: Student withdrawn from a Class


DELETE FROM student_class WHERE id=6;

Feature 9: Find student details who have not updated their Date Of Birth #

SELECT * FROM students WHERE dob IS NULL;
+----+-------+-----------------+------------+----------+--------+------+---------------------+
| id | name  | email           | mobile_no  | password | gender | dob  | created_date        |
+----+-------+-----------------+------------+----------+--------+------+---------------------+
|  9 | Peter | peter@gmail.com | 9118273654 | pEter00  | M      | NULL | 2022-03-03 21:06:28 |
+----+-------+-----------------+------------+----------+--------+------+---------------------+



 Feature 10: Find Total no of students actively studying in this school
 
 SELECT COUNT(*) FROM student_class WHERE status='active';
+----------+
| COUNT(*) |
+----------+
|        5 |
+----------+
1 row in set (0.00 sec)


 SELECT COUNT(*) FROM student_class GROUP BY status HAVING status='active';
+----------+
| COUNT(*) |
+----------+
|        4 |
+----------+
1 row in set (0.00 sec)



SELECT status,count(status) FROM student_class GROUP BY status HAVING status='active';
+--------+---------------+
| status | count(status) |
+--------+---------------+
| active |             4 |
+--------+---------------+


Feature 11: Find Total no of students actively studying in each class

SELECT class,COUNT(*) FROM student_class WHERE status ='active' GROUP BY class HAVING count(status);
+-------+----------+
| class | COUNT(*) |
+-------+----------+
|     6 |        1 |
|     4 |        2 |
|     8 |        1 |
+-------+----------+
3 rows in set (0.00 sec)


Feature 12: Find Total no of students actively studying each class which has less than 5 students.

SELECT class,COUNT(*) FROM student_class WHERE status ='active' GROUP BY class HAVING COUNT(status)<5;
+-------+----------+
| class | COUNT(*) |
+-------+----------+
|     7 |        2 |
|     5 |        1 |
|     4 |        2 |
+-------+----------+
3 rows in set (0.00 sec)



Feature 13: Display student and class details Using Joins (Inner Join)
 * Using Subqueries ( Scalar SubQuery)


SELECT * FROM students INNER JOIN student_class ON students.id = student_class.student_id;
+----+--------+---------------------+------------+------------+--------+------------+---------------------+----+------------+-------+----------+
| id | name   | email               | mobile_no  | password   | gender | dob        | created_date        | id | student_id | class | status   |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+----+------------+-------+----------+
|  1 | Anu    | Anu_01@gmail.com    | 9828374654 | @nu_91     | F      | 2012-02-01 | 2022-03-01 22:42:51 |  1 |          1 |     6 | active   |
|  2 | Mano   | Mano1@gmail.com     | 9828371624 | M@no_09    | M      | 2012-12-12 | 2022-03-01 22:42:51 |  2 |          2 |     6 | inactive |
|  3 | Aaron  | Aaron@gmail.com     | 9788371624 | Aaro_07    | M      | 2013-12-12 | 2022-03-01 22:42:51 |  3 |          3 |     5 | inactive |
|  4 | Sahana | Sah@na_01@gmail.com | 9566871234 | Sah@@_Star | F      | 2013-02-12 | 2022-03-02 12:39:26 |  4 |          4 |     4 | active   |
|  5 | Saran  | SaRaN_1@gmail.com   | 9566874321 | Saran_Boy  | M      | 2013-11-01 | 2022-03-02 12:39:26 |  5 |          5 |     4 | active   |
|  7 | Varun  | v@run@gmail.com     | 9876543211 | Varuu_21   | M      | 2012-06-27 | 2022-03-02 14:51:41 |  7 |          7 |     6 | active   |
|  8 | Suhail | Suhail@gmail.com    | 9438832112 | SuH@il_27  | M      | 2010-12-21 | 2022-03-02 15:27:11 |  8 |          8 |     4 | active   |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+----+------------+-------+----------+
7 rows in set (0.00 sec)


SELECT * FROM students WHERE id IN( SELECT student_id FROM student_class );
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
| id | name   | email               | mobile_no  | password   | gender | dob        | created_date        |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
|  1 | Anu    | Anu_01@gmail.com    | 9828374654 | @nu_91     | F      | 2000-02-12 | 2022-03-01 22:42:51 |
|  2 | Mano   | Mano1@gmail.com     | 9828371624 | Mano_07    | M      | 2003-08-07 | 2022-03-01 22:42:51 |
|  3 | Aaron  | Aaron@gmail.com     | 9788371624 | Aaro_07    | M      | 2002-03-01 | 2022-03-01 22:42:51 |
|  4 | Sahana | Sah@na_01@gmail.com | 9566871234 | Sah@@_Star | F      | 2005-12-25 | 2022-03-02 12:39:26 |
|  5 | Saran  | SaRaN_1@gmail.com   | 9566874321 | Saran_Boy  | M      | 2005-02-04 | 2022-03-02 12:39:26 |
|  7 | Varun  | v@run@gmail.com     | 9876543211 | Varuu_21   | M      | 2007-01-12 | 2022-03-02 14:51:41 |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
6 rows in set (0.00 sec)


SELECT * FROM students WHERE EXISTS( SELECT * FROM student_class WHERE students.id = student_class.student_id);
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
| id | name   | email               | mobile_no  | password   | gender | dob        | created_date        |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
|  1 | Anu    | Anu_01@gmail.com    | 9828374654 | @nu_91     | F      | 2000-02-12 | 2022-03-01 22:42:51 |
|  2 | Mano   | Mano1@gmail.com     | 9828371624 | Mano_07    | M      | 2003-08-07 | 2022-03-01 22:42:51 |
|  3 | Aaron  | Aaron@gmail.com     | 9788371624 | Aaro_07    | M      | 2002-03-01 | 2022-03-01 22:42:51 |
|  4 | Sahana | Sah@na_01@gmail.com | 9566871234 | Sah@@_Star | F      | 2005-12-25 | 2022-03-02 12:39:26 |
|  5 | Saran  | SaRaN_1@gmail.com   | 9566874321 | Saran_Boy  | M      | 2005-02-04 | 2022-03-02 12:39:26 |
|  7 | Varun  | v@run@gmail.com     | 9876543211 | Varuu_21   | M      | 2007-01-12 | 2022-03-02 14:51:41 |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+
6 rows in set (0.00 sec)




Feature 14: Display Student Details for the given input class Class : 6th standard  using joins

SELECT * FROM students AS s INNER JOIN student_class AS sc  ON s.id=sc.student_id  WHERE class=6;
+----+-------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+----------+
| id | name  | email            | mobile_no  | password | gender | dob        | created_date        | id | student_id | class | status   |
+----+-------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+----------+
|  1 | Anu   | Anu_01@gmail.com | 9828374654 | @nu_91   | F      | 2000-02-12 | 2022-03-01 22:42:51 |  1 |          1 |     6 | active   |
|  2 | Mano  | Mano1@gmail.com  | 9828371624 | Mano_07  | M      | 2003-08-07 | 2022-03-01 22:42:51 |  2 |          2 |     6 | inactive |
|  3 | Aaron | Aaron@gmail.com  | 9788371624 | Aaro_07  | M      | 2002-03-01 | 2022-03-01 22:42:51 |  3 |          3 |     6 | inactive |
+----+-------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+----------+
3 rows in set (0.00 sec)




 Feature 15: Find Class for the given student email id Email: n@gmail.com    
 
 


 SELECT student_id,name,class FROM students AS s INNER JOIN student_class AS sc  ON s.id=sc.student_id  WHERE email='Anu_01@gmail.com' AND name='Anu';
+------------+------+-------+
| student_id | name | class |
+------------+------+-------+
|          1 | Anu  |     6 |
+------------+------+-------+
1 row in set (0.00 sec)


SELECT email,class FROM students AS s INNER JOIN student_class AS sc  ON s.id=sc.student_id  WHERE email='Anu_01@gmail.com' AND name='Anu';
+------------------+-------+
| email            | class |
+------------------+-------+
| Anu_01@gmail.com |     6 |
+------------------+-------+


Feature 16: Find Students who has not enrolled in a class Using Subquery ( multiple row subquery )


SELECT * FROM students WHERE id NOT IN( SELECT student_id FROM student_class );
+----+--------+--------------------+------------+-----------+--------+------------+---------------------+
| id | name   | email              | mobile_no  | password  | gender | dob        | created_date        |
+----+--------+--------------------+------------+-----------+--------+------------+---------------------+
|  6 | Priya  | Priya_01@gmail.com | 9546871234 | Priy@star | M      | 2006-12-02 | 2022-03-02 12:39:26 |
|  8 | Suhail | Suhail@gmail.com   | 9438832112 | SuH@il_27 | M      | 2010-12-21 | 2022-03-02 15:27:11 |
+----+--------+--------------------+------------+-----------+--------+------------+---------------------+
2 rows in set (0.00 sec)


 Feature 17: Display all students name with class - include both enrolled and not enrolled Using Joins ( Left outer join)
 
 
 SELECT * FROM students LEFT JOIN student_class ON students.id = student_class.student_id;
+----+--------+---------------------+------------+------------+--------+------------+---------------------+------+------------+-------+----------+
| id | name   | email               | mobile_no  | password   | gender | dob        | created_date        | id   | student_id | class | status   |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+------+------------+-------+----------+
|  1 | Anu    | Anu_01@gmail.com    | 9828374654 | @nu_91     | F      | 2000-02-12 | 2022-03-01 22:42:51 |    1 |          1 |     6 | active   |
|  2 | Mano   | Mano1@gmail.com     | 9828371624 | Mano_07    | M      | 2003-08-07 | 2022-03-01 22:42:51 |    2 |          2 |     6 | inactive |
|  3 | Aaron  | Aaron@gmail.com     | 9788371624 | Aaro_07    | M      | 2002-03-01 | 2022-03-01 22:42:51 |    3 |          3 |     6 | inactive |
|  4 | Sahana | Sah@na_01@gmail.com | 9566871234 | Sah@@_Star | F      | 2005-12-25 | 2022-03-02 12:39:26 |    4 |          4 |     4 | active   |
|  5 | Saran  | SaRaN_1@gmail.com   | 9566874321 | Saran_Boy  | M      | 2005-02-04 | 2022-03-02 12:39:26 |    5 |          5 |     4 | active   |
|  6 | Priya  | Priya_01@gmail.com  | 9546871234 | Priy@star  | M      | 2006-12-02 | 2022-03-02 12:39:26 | NULL |       NULL |  NULL | NULL     |
|  7 | Varun  | v@run@gmail.com     | 9876543211 | Varuu_21   | M      | 2007-01-12 | 2022-03-02 14:51:41 |    7 |          7 |     8 | active   |
|  8 | Suhail | Suhail@gmail.com    | 9438832112 | SuH@il_27  | M      | 2010-12-21 | 2022-03-02 15:27:11 | NULL |       NULL |  NULL | NULL     |
+----+--------+---------------------+------------+------------+--------+------------+---------------------+------+------------+-------+----------+
8 rows in set (0.00 sec)

 SELECT name,class FROM students LEFT JOIN student_class ON students.id = student_class.student_id;
+--------+-------+
| name   | class |
+--------+-------+
| Anu    |     6 |
| Mano   |     6 |
| Aaron  |     6 |
| Sahana |     4 |
| Saran  |     4 |
| Priya  |  NULL |
| Varun  |     8 |
| Suhail |  NULL |
+--------+-------+
8 rows in set (0.00 sec)



    


    


SELECT * FROM students INNER JOIN student_class ON students.id = student_class.student_id WHERE email='Anu_01@gmail.com' AND password='@nu_91'
    -> ;
+----+------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
| id | name | email            | mobile_no  | password | gender | dob        | created_date        | id | student_id | class | status |
+----+------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
|  1 | Anu  | Anu_01@gmail.com | 9828374654 | @nu_91   | F      | 2000-02-12 | 2022-03-01 22:42:51 |  1 |          1 |     6 | active |
+----+------+------------------+------------+----------+--------+------------+---------------------+----+------------+-------+--------+
1 row in set (0.00 sec)



 
