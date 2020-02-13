#John B Smith birthdate and address
#select bdate, Address from Employee where Fname='John' and Minit = 'B' and Lname = 'Smith';

#selects name and ssn of all employees in the administration
#select Fname, Minit, Lname, Ssn from Employee, Department where Dname = 'Administration' and Dnumber = Dno;

#selects names of employees who live in Spring, TX
#select Fname, Minit, Lname from Employee where Address like '% Spring, Tx';

#selects name of female employees and their dependents
#select Fname, Minit, Lname, Dependent_name from Employee as E, Dependents as D where E.ssn = D.essn and E.sex = 'F';

#select names of employees directly supervised by Franklin Wong
#select Fname, Minit, Lname from Employee as E where e.Super_ssn = '333445555';