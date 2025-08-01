WITH processing_window AS (
  SELECT 
    machine_id,
    process_id,
    MAX(CASE WHEN activity_type = 'end' THEN timestamp END) -
    MAX(CASE WHEN activity_type = 'start' THEN timestamp END) AS process_duration
  FROM Activity
  GROUP BY machine_id, process_id
)
SELECT
    machine_id,
    ROUND(AVG(process_duration), 3) AS processing_time
FROM processing_window
GROUP BY machine_id;
