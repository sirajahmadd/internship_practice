create database SalesManagement;
use SalesManagement;
create table sales 
(id int auto_increment primary key,
product_name varchar(10),
quantity int,
unit_price decimal(5,2),
total_price decimal(5,2),
customer_name varchar(20),
sale_date date)
;
select * from sales;
insert into sales values(
1,"Bat",2,220.20,440.40,"messi","2000-07-01"
);
select * from sales;
insert into sales values(
2,"Ball",2,220.20,440.40,"virat","2000-07-02"
);
select * from sales;
insert into sales (id,product_name,quantity,unit_price,total_price,customer_name,sale_date) values(
3,"Ball",2,220.20,440.40,"virat","2000-07-02"
);
delete from sales where id=1;
delete from sales where id=2;
delete from sales where id=3;
select * from sales;
insert into sales (product_name,quantity,unit_price,total_price,customer_name,sale_date)
 values(
"bat",3,220.20,660.60,"john","2000-07-03"),("helmet",5,100.00,500.00,"suresh","2000-07-04"),
("pads",2,200.20,400.40,"rakesh","2000-08-07"),("gloves",2,250.00,500.00,"sukesh","2000-07-10");
select * from sales;
select * from sales where id=4;
select * from sales where customer_name="john" or product_name="bat";
select * from sales where customer_name="john" and product_name="bt";
select * from sales where quantity>3;
select * from sales where quantity>2 and total_price<1000;

alter table sales add name varchar(10);
select * from sales;
alter table sales drop column  name;
select * from sales;
use salesmanagement;



