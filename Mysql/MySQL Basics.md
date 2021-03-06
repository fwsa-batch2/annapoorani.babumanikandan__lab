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

## To create a database
```
CREATE DATABASE tab_name;
```
#### Example : 
CREATE DATABASE fidaa;


## To select a database
```
USE database_name;
```
#### Example : 
USE fidaa;
### Result :
Database changed

## To see the tables whether there is a table or not
```
SHOW TABLES;
```
### Result :

Empty set (0.01 sec)

## To create a table in a database

``` 
CREATE TABLE artists (artist_id int primary key auto_increment, artist_name varchar(20) not null unique);
```
## To describe a table
```
DESC artists; 
```
### Result :

| Field       | Type        | Null | Key | Default | Extra |
|:-----------:|:-----------:|:----:|:----:|:------:|:-----:|
| artist_id   | int         | YES  | PRI | NULL    |       |
| artist_name | varchar(20) | YES  | UNI | NULL    |       |


## To Insert values in a table
``` 
INSERT INTO artists VALUES (NULL,'Shivangi');
```
### Result :
Query OK, 1 row affected (0.01 sec)

## To see the values in a table

``` 
SELECT * FROM artists;
```

### Result :

| artist_id | artist_name |
|----------:|:------------|
|         1 | Shivangi    |

1 row in set (0.00 sec)

## Create another table

``` 
Create table album (id int,artist_id int,file varchar(255));
```

## To describe a table :
 DESC albums;

| Field     | Type         | Null | Key | Default | Extra |
|:---------:|:------------:|:----:|:---:|:-------:|:-----:|
| id        | int          | YES  |     | NULL    |       |
| artist_id | int          | YES  |     | NULL    |       |
| file      | varchar(255) | YES  |     | NULL    |       |

3 rows in set (0.00 sec)


## To add foreign key in an existing table
```
ALTER TABLE albums ADD FOREIGN KEY (artist_id) REFERENCES artists (artist_id);
```
Query OK, 0 rows affected (0.10 sec)
Records: 0  Duplicates: 0  Warnings: 0

### To see whether the table has fk or not.
```
DESC albums;
```

## Result :

| Field     | Type         | Null | Key | Default | Extra |
|:---------:|:------------:|:----:|:---:|:-------:|:-----:|
| id        | int          | YES  |     | NULL    |       |
| artist_id | int          | YES  | MUL | NULL    |       |
| file      | varchar(255) | YES  |     | NULL    |       |

3 rows in set (0.00 sec)

## To insert values in table
```
INSERT INTO albums VALUES (1,1,'https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3');
```

### Result :


SELECT * FROM albums;

| id | artist_id | albums                                                                                        |
|:--:|:---------:|:---------------------------------------------------------------------------------------------:|
|  1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |

## Inner Join

```
SELECT t1.artist_id, t1.artist_name FROM artists AS t1 INNER JOIN albums AS  t2 ON t1.artist_id = t2.artist_id;
```

### Result :

| artist_id | artist_name |
|:---------:|:-----------:|
|         1 | Shivangi    |

1 row in set (0.00 sec)

## LEFT JOIN
```
SELECT * FROM artists AS t1 LEFT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id;
```

## Result :

| artist_id | artist_name | id   | artist_id | file                                                                                          |
|:---------:|:-----------:|:----:|:---------:|:---------------------------------------------------------------------------------------------:|
|         3 | Aaron       | NULL |      NULL | NULL                                                                                          |
|         4 | Ajay        | NULL |      NULL | NULL                                                                                          |
|         5 | Muguen      | NULL |      NULL | NULL                                                                                          |
|         2 | Sam         | NULL |      NULL | NULL                                                                                          |
|         1 | Shivangi    |    1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |

5 rows in set (0.00 sec)

## RIGHT JOIN
```
 SELECT * FROM artists AS t1 RIGHT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id;
 ```

| artist_id | artist_name | id   | artist_id | file                                                                                          |
|:---------:|:-----------:|:----:|:---------:|:---------------------------------------------------------------------------------------------:|
|         1 | Shivangi    |    1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |

## UNION ALL
```
SELECT* FROM artists AS t1 LEFT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id UNION ALL SELECT* FROM artists AS t1 RIGHT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id;
```
### Result :

| artist_id | artist_name | id   | artist_id | file                                                                                          |
|:---------:|:-----------:|:----:|:---------:|:---------------------------------------------------------------------------------------------:|
|         3 | Aaron       | NULL |      NULL | NULL                                                                                          |
|         4 | Ajay        | NULL |      NULL | NULL                                                                                          |
|         5 | Muguen      | NULL |      NULL | NULL                                                                                          |
|         2 | Sam         | NULL |      NULL | NULL                                                                                          |
|         1 | Shivangi    |    1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |
|         1 | Shivangi    |    1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |

6 rows in set (0.01 sec)

## UNION
```
SELECT* FROM artists AS t1 LEFT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id UNION  SELECT* FROM artists AS t1 RIGHT JOIN albums AS  t2 ON t1.artist_id = t2.artist_id;
```
| artist_id | artist_name | id   | artist_id | file                                                                                          |
|:---------:|:-----------:|:----:|:---------:|:---------------------------------------------------------------------------------------------:|
|         3 | Aaron       | NULL |      NULL | NULL                                                                                          |
|         4 | Ajay        | NULL |      NULL | NULL                                                                                          |
|         5 | Muguen      | NULL |      NULL | NULL                                                                                          |
|         2 | Sam         | NULL |      NULL | NULL                                                                                          |
|         1 | Shivangi    |    1 |         1 | https://pagalnew.com/mp3-songs/tamil-mp3-songs/adipoli-vineeth-sreenivasan-128-kbps-sound.mp3 |

5 rows in set (0.00 sec)

## Drop coulmn in a table
```
ALTER TABLE artists DROP artist_img;
```
### Result :
Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

## Drop a table
```
DROP TABLE artists;
```
### Result
Query OK, 0 rows affected (0.04 sec)

## Create Non_Clustered index :

```
CREATE INDEX idx_name ON albums (file);
```
### Result :
Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

## To know what are the indexes in a table
```
 SHOW INDEX FROM albums;
 ```
 
 ### Result :

| Table  | Non_unique | Key_name  | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
|:------:|:----------:|:---------:|:------------:|:-----------:|:---------:|:-----------:|:--------:|:------:|:----:|:----------:|:-------:|:-------------:|:-------:|:----------:|
| albums |          1 | artist_id |            1 | artist_id   | A         |           1 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| albums |          1 | idx_name  |            1 | file        | A         |           1 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |

2 rows in set (0.01 sec)


## To join 2 or more tables

### First method
```
SELECT t1.first_name,t2.profile_name, t3.password FROM user_info AS t1 INNER JOIN user_details AS t2 ON t1.id = t2.id INNER JOIN user_credentials AS t3 ON t3.id = t2.id;
```

### Result :
| first_name | profile_name | password |
|:----------:|:------------:|:--------:|
| Anu        | Anu_star     | Anu$123  |
| Vijay      | Vijju        | ViJju@01 |
| Meenu      | Shivu        | MeeNu*8  |
| Shivangi   | Annu@01      | ShiV@ngi |
| Annu       | PavEE        | @nNu$1   |

5 rows in set (0.00 sec)

#### Second method

```
 SELECT t1.first_name,t3.profile_name, t2.password  FROM user_info AS t1, user_credentials AS t2, user_details AS t3 WHERE t1.id = t2.id AND t3.id = t2.id;
```

## Result 
| first_name | profile_name | password |
|:----------:|:------------:|:--------:|
| Anu        | Anu_star     | Anu$123  |
| Vijay      | Vijju        | ViJju@01 |
| Meenu      | Shivu        | MeeNu*8  |
| Shivangi   | Annu@01      | ShiV@ngi |
| Annu       | PavEE        | @nNu$1   |

5 rows in set (0.00 sec)

## To start a transaction
```
 START TRANSACTION;
 ```
 ### Result :
 
Query OK, 0 rows affected (0.00 sec)

## To stop the auto commit :
```
 SET AUTOCOMMIT=0;
 ```
 
 ### Result :
Query OK, 0 rows affected (0.01 sec)

## To store the values 
```
COMMIT;
 ```
 
 ### Result :
Query OK, 0 rows affected (0.00 sec)


## To restore the database
```
ROLLBACK;
```

### Result :
Query OK, 0 rows affected (0.00 sec)

##To set the auto commit :
```
 SET AUTOCOMMIT=1;
 ```
 
 ### Result :
 Query OK, 0 rows affected (0.00 sec)
 
