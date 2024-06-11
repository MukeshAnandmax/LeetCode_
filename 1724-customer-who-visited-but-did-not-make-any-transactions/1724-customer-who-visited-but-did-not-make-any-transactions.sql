# Write your MySQL query statement below

select customer_id  ,count(*) count_no_trans from Visits v
left join Transactions t on v.visit_id =t.visit_id
WHERE t.transaction_id IS NULL 
group by customer_id ;