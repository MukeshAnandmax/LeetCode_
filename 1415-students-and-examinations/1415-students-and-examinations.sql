# Write your MySQL query statement below
SELECT s.student_id, s.student_name, sub.subject_name, COUNT(e.student_id) AS attended_exams
from Students s 
cross join Subjects sub  
left join Examinations e  on s.student_id  =e.student_id  and sub.subject_name =e.subject_name 
group by s.student_id ,s.student_name ,sub.subject_name 
ORDER BY s.student_id, sub.subject_name;