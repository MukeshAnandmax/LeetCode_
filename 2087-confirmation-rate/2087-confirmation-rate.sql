# Write your MySQL query statement below
select user_id  ,round(sum(if(action ='confirmed ',1,0))/count(*),2    )confirmation_rate  
from Signups s left join Confirmations c
using(user_id)
group by user_id