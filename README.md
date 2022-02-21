# annapoorani.babumanikandan__lab

## To listout the databases
```
SHOW DATABASES;
```
| Database           |
|:-------------------|
| college            |
| information_schema |
| library            |
| mysql              |
| office             |
| performance_schema |
| sys                |
| tuition            |

## To select a database
```
USE college;
```
## To see the tables whether there is a table or not
```
SHOW TABLES;
```
### Result :

| Tables_in_college |
|-------------------|
| mark_sheet        |
| student_Info      |


## To select a particular table

```
SELECT * FROM student_Info;
```
### Result :

| stud_Id | name      | lname     | age  | dob        | marks | slipTest | pass |
|:-------:|:---------:|:---------:|:----:|:----------:|:-----:|:--------:|:-----|
|       1 | Anu       | Babu      |   17 | 2004-02-27 |   100 |       25 |    1 |
|       2 | Mahila    | Siva      |   20 | 2002-02-12 |    95 |       25 |    0 |
|       3 | Keerthana | Shanmugam |   19 | 2002-03-04 |   100 |       35 |    1 |
|       4 | Charu     | Babu      |   18 | 2003-04-04 |    85 |       37 |    0 |
|       5 | Krishna   | Raj       |   19 | 2002-03-04 |   100 |       15 |    1 |
|       6 | Hema      | Balu      |   18 | 2003-03-04 |    80 |       32 |    1 |
|       7 | shana     | Raj       |   19 | 2002-03-04 |   100 |       48 |    1 |

## To insert values into a table

```
INSERT INTO student_Info VALUES (NULL,'Kani','Raj',18,'2004/06/05',91,25,0);
```
### Result :

| stud_Id | name      | lname     | age  | dob        | marks | slipTest | pass |
|:-------:|:---------:|:---------:|:----:|:----------:|:-----:|:--------:|:----:|
|       1 | Anu       | Babu      |   17 | 2004-02-27 |   100 |       25 |    1 |
|       2 | Mahila    | Siva      |   20 | 2002-02-12 |    95 |       25 |    0 |
|       3 | Keerthana | Shanmugam |   19 | 2002-03-04 |   100 |       35 |    1 |
|       4 | Charu     | Babu      |   18 | 2003-04-04 |    85 |       37 |    0 |
|       5 | Krishna   | Raj       |   19 | 2002-03-04 |   100 |       15 |    1 |
|       6 | Hema      | Balu      |   18 | 2003-03-04 |    80 |       32 |    1 |
|       7 | shana     | Raj       |   19 | 2002-03-04 |   100 |       48 |    1 | 
|       8 | Kani      | Raj       |   18 | 2004-06-05 |    91 |       25 |    0 |


## To change a value in a table
```
UPDATE  student_Info SET pass = 1 WHERE name='Kani';
```
### Result :

| stud_Id | name      | lname     | age  | dob        | marks | slipTest | pass |
|:-------:|:---------:|:---------:|:----:|:----------:|:-----:|:--------:|:----:|
|       1 | Anu       | Babu      |   17 | 2004-02-27 |   100 |       25 |    1 |
|       2 | Mahila    | Siva      |   20 | 2002-02-12 |    95 |       25 |    0 |
|       3 | Keerthana | Shanmugam |   19 | 2002-03-04 |   100 |       35 |    1 |
|       4 | Charu     | Babu      |   18 | 2003-04-04 |    85 |       37 |    0 |
|       5 | Krishna   | Raj       |   19 | 2002-03-04 |   100 |       15 |    1 |
|       6 | Hema      | Balu      |   18 | 2003-03-04 |    80 |       32 |    1 |
|       7 | shana     | Raj       |   19 | 2002-03-04 |   100 |       48 |    1 | 
|       8 | Kani      | Raj       |   18 | 2004-06-05 |    91 |       25 |    1 |


