#create schema COMPANY_Johnnie;

#drop table Department
/*CREATE TABLE Department (
    Dname varchar(15) NOT NULL,
    Dnumber int NOT NULL,
    Mgr_SSN char(9) NOT NULL,
    Mgr_start_date DATE,
    PRIMARY KEY (Dnumber),
    UNIQUE (Dname)
);*/
#select * from Department;
/*insert into department values('Research', 5, '333445555', '1988-05-22');
insert into department values('Administration', 4, '987654321', '1995-01-01');
insert into department values('Headquarters', 1, '888665555', '1981-06-19');*/

#drop table Employee 
/*CREATE TABLE Employee (
	Fname varchar(15) Not null,
    Minit char(1) not null,
    Lname varchar(15) not null,
    Ssn char(9) not null,
    Bdate DATE,
    Address varchar (40) not null,
    Sex char(1) not null,
    Salary int not null,
    Super_ssn char(9),
    Dno int not null,
    PRIMARY KEY (Ssn),
    foreign key (Dno) references Department(Dnumber)
);*/

#select * from Employee;
/*insert into Employee values('John', 'B', 'Smith', '123456789', '1965-01-09', '731 Fondren, Houston, TX', 'M', 30000, '333445555', 5);
insert into Employee values('Franklin', 'T', 'Wong', '333445555', '1955-12-08', '638 Voss, Houston, TX', 'M', 40000, '888665555', 5);
insert into Employee values('Alicia', 'J', 'Zelaya', '999887777', '1968-01-10', '3322 Castle, Spring, TX', 'F', 25000, '987654321', 4);
insert into Employee values('Jennifer', 'S', 'Wallace', '987654321', '1941-06-20', '291 Berry, Bellaire, TX', 'F', 43000, '888665555', 4);
insert into Employee values('Ramesh', 'K', 'Narayan', '666884444', '1962-09-15', '975 Fire Oak, Humble TX', 'M', 38000, '333445555', 5);    
insert into Employee values('Joyce', 'A', 'English', '463453453', '1972-07-31', '5631 Rice, Houston, TX', 'F', 25000, '333445566', 5);
insert into Employee values('Ahmad', 'V', 'Jabbar', '987987987', '1969-03-29', '980 Dallas, Houston, TX', 'M', 25000, '987654321', 4);
insert into Employee values('James', 'E', 'Borg', '888665555', '1937-11-10', '450 Stone, Houston, TX', 'M', 55000, NULL, 1);*/    

#drop table DEPT_Location
/*Create Table DEPT_Location(
	Dnumber int not null,
    Dlocation varchar(20) not null,
    Primary key (Dnumber, Dlocation),
    foreign key (Dnumber) references Department(Dnumber)
);*/

#select * from DEPT_Location;
/*insert into DEPT_Location values(1, "Houston");
insert into DEPT_Location values(4, "Stafford");
insert into DEPT_Location values(5, "Bellaire");
insert into DEPT_Location values(5, "Sugarland");
insert into DEPT_Location values(5, "Houston");*/

#drop table Project
/*Create Table Project(
	Pname varchar(30) not null,
    Pnumber int not null,
    Plocation varchar (20) not null,
    Dnum int not null,
    Primary key (Pnumber),
    foreign key(Dnum) references Department(Dnumber)
);*/
#select * from project;
/*insert into Project values("ProductX", 1, "Bellaire", 5);
insert into Project values("ProductY", 2, "Sugarland", 5);
insert into Project values("ProductZ", 3, "Houston", 5);
insert into Project values("Computerization", 10, "Stafford", 4);
insert into Project values("Reorganization", 20, "Houston", 1);
insert into Project values("Newbenefits", 30, "Stafford", 4);*/

#drop table Works_on
/*Create table Works_on(
	Essn char(9) not null,
    Pno int not null,
    Hours double,
    
    Primary key(Essn, Pno),
    foreign key(Essn) references Employee(Ssn),
    foreign key(Pno) references Project(Pnumber)
);*/

#select * from Works_on;
/*insert into Works_on values(123456789, 1, 32.5);
insert into Works_on values(123456789, 2, 7.5);
insert into Works_on values(666884444, 3, 40.0);
insert into Works_on values(463453453, 1, 20.0);
insert into Works_on values(463453453, 2, 20.0);
insert into Works_on values(333445555, 2, 10.0);
insert into Works_on values(333445555, 3, 10.0);
insert into Works_on values(333445555, 10, 10.0);
insert into Works_on values(333445555, 20, 10.0);
insert into Works_on values(999887777, 30, 30.0);
insert into Works_on values(999887777, 10, 10.0);
insert into Works_on values(987987987, 10, 35.0);
insert into Works_on values(987987987, 30, 5.0);
insert into Works_on values(987654321, 30, 20.0);
insert into Works_on values(987654321, 20, 15.0);*/

#drop table Dependents
/*create table Dependents(
	Essn char(9) not null,
    Dependent_name varchar(15) not null,
    Sex char(1) not null,
    Bdate char(10) not null,
    Relationship varchar(20) not null,
    primary key (Essn, Dependent_name),
    foreign key(Essn) references Employee(Ssn)
);*/

#select * from dependents;
/*insert into dependents values('333445555', "Alice", 'F', '1986-04-05', "Daughter");
insert into dependents values('333445555', "Theodore", 'M', '1983-10-25', "Son");
insert into dependents values('333445555', "Joy", 'F', '1958-05-03', "Spouse");
insert into dependents values('987654321', "Abner", 'M', '1942-02-28', "Spouse");
insert into dependents values('123456789', "Michael", 'M', '1988-01-04', "Son");
insert into dependents values('123456789', "Alice", 'F', '1988-12-30', "Daughter");
insert into dependents values('123456789', "Elizabeth", 'F', '1967-05-05', "Spouse");*/