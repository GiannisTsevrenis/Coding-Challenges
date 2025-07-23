WITH cumulative AS (
  SELECT 
    person_name,
    SUM(weight) OVER (ORDER BY turn) AS running_total
  FROM Queue
)
SELECT person_name
FROM cumulative
WHERE running_total <=1000
ORDER BY running_total DESC
LIMIT 1;
