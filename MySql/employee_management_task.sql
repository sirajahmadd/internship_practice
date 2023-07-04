create database Employee_management;
use Employee_management;
create table employeeDetails(
id int auto_increment primary key,first_name varchar(10),last_name varchar(10),email varchar(30),
phone_number bigint,hire_date date,department varchar(10),salary decimal(5,2)
);
select * from employeeDetails;

insert into employeeDetails values(1,"siraj","ahmad","siraj@123gmail.com",987654321,"2020-01-01","cse",500.0);
insert into employeeDetails (first_name,last_name,email,phone_number,hire_date,department,salary)
values(
"leonal","messi","leonal@123gmai.com",123456789,"2023-02-04","ece",400.0);
insert into employeeDetails (first_name,last_name,email,phone_number,hire_date,department,salary)
values(
"cristiano","ronaldo","cr7@123gmai.com",85698745,"2023-02-09","civil",900.0),
("ansu","fati","ansufati@123gmai.com",7854126635,"2023-02-10","me",100.0);

select * from employeeDetails where department="ece";
select * from employeedetails where salary>500;
select id from employeedetails ;
select count(id) from employeedetails ;
select max(salary) from employeedetails  ;
select * from employeedetails where hire_date="2023-02-09";

update employeedetails set first_name="messi" where id=1;


