# Write your MySQL query statement below
-- select round( 

--     (sum( if( min(order_date )  =  min(customer_pref_delivery_date ) ,1,0)  )  *100)
--     /(select count(distinct customer_id  ) from  Delivery )

--   ,2  ) immediate_percentage 
-- from Delivery 
-- group by customer_id 


SELECT
ROUND((SUM(IF(t.min_order_date = t.pref_delivery_date,1,0)
) * 100) / (SELECT COUNT(DISTINCT customer_id) FROM Delivery),2) AS immediate_percentage
FROM (
SELECT
customer_id,
MIN(order_date) AS min_order_date,
MIN(customer_pref_delivery_date) AS pref_delivery_date
FROM Delivery
GROUP BY customer_id
) AS t;