WITH ProcessTimes AS (
    SELECT 
        start.machine_id, 
        start.process_id, 
        (end.timestamp - start.timestamp) AS processing_time
    FROM 
        Activity start
    JOIN 
        Activity end 
    ON 
        start.machine_id = end.machine_id 
        AND start.process_id = end.process_id 
        AND start.activity_type = 'start' 
        AND end.activity_type = 'end'
)
SELECT 
    machine_id, 
    ROUND(AVG(processing_time), 3) AS processing_time
FROM 
    ProcessTimes
GROUP BY 
    machine_id;
