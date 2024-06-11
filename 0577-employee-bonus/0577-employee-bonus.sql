# Write your MySQL query statement below
select name ,bonus  from Employee left join Bonus  using(empId )
having bonus <1000 or bonus is null