# Write your MySQL query statement below

select e1.unique_id ,e.name from Employees e left join EmployeeUNI e1 using(id) 