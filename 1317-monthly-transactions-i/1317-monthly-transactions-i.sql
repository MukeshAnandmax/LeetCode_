# Write your MySQL query statement below
select substr(trans_date , 1,7) month ,country ,count(*) trans_count , sum( if(state='approved',1,0) ) approved_count ,sum(amount )trans_total_amount ,sum(if(state='approved',amount,0) ) approved_total_amount   from Transactions 
group by  country   ,month 