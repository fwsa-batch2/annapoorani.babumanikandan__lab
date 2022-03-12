## INDEX

## Clustered Index :

### ( Primary Key creates the cluestered index by defaut )


## Non Clustered Index :

### Select the table named as 'employees'

```
SELECT * FROM employees;
```


| id | name      | age | gender | Dept      | city      | salary |
|:--:|:---------:|:---:|:------:|:---------:|:---------:|:------:|
|  1 | Anuraj    |  25 | F      | IT        | Chennai   |  75000 |
|  2 | Nidhima   |  27 | F      | Sales     | Chennai   |  85000 |
|  3 | Sangeetha |  32 | F      | Marketing | Bangalore | 100000 |
|  4 | Adi       |  42 | M      | Sales     | Bangalore |  60000 |
|  5 | Vaishnavi |  30 | F      | Marketing | Mumbai    |  90000 |
|  6 | Keerthana |  29 | F      | IT        | Mumbai    | 100000 |


## Select the employees with name,Dept and salary who are all belongs to Dept 'IT'

```
 SELECT name, Dept, salary FROM employees WHERE Dept='IT';
```

| name      | Dept | salary |
|:---------:|:----:|:------:|
| Anuraj    | IT   |  75000 |
| Keerthana | IT   | 100000 |


## Explain the employees table 

### (The 'EXPLAIN' statement provides information about how MySQL executes statements)

```
 EXPLAIN SELECT name, Dept, salary FROM employees WHERE Dept='IT';
 ```
 
| id | select_type | table     | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra       |
|:--:|:-----------:|:---------:|:----------:|:----:|:-------------:|:----:|:-------:|:----:|:----:|:--------:|:-----------:|
|  1 | SIMPLE      | employees | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    6 |    16.67 | Using where |



## Create Non-Clustered Index on employees

```
 CREATE INDEX IT_dept ON employees (name,Dept,salary);
 ```
 
## Show the index on the table

```
 SHOW INDEX FROM employees;
```

| Table     | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:---------:|:----------:|:--------:|:------------:|:-----------:|:---------:|:-----------:|:--------:|:------:|:----:|:----------:|:-------:|:-------------:|:-------:|:----------:|
| employees |          0 | PRIMARY  |            1 | id          | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| employees |          0 | name     |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| employees |          1 | IT_dept  |            1 | name        | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| employees |          1 | IT_dept  |            2 | Dept        | A         |           6 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| employees |          1 | IT_dept  |            3 | salary      | A         |           6 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |



## After creating index on employees table and explaining it.

```
 EXPLAIN SELECT name, Dept, salary FROM employees WHERE Dept='IT';
 ```
 

| id | select_type | table     | partitions | type  | possible_keys | key     | key_len | ref  | rows | filtered | Extra                    |
|:--:|:-----------:|:---------:|:----------:|:-----:|:-------------:|:-------:|:-------:|:----:|:----:|:--------:|:------------------------:|
|  1 | SIMPLE      | employees | NULL       | index | IT_dept       | IT_dept | 249     | NULL |    6 |    16.67 | Using where; Using index |


## Drop the index

```
 ALTER TABLE employees DROP INDEX IT_dept;
 ```



