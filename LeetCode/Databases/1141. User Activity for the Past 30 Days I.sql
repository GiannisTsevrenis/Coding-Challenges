SELECT 
    activity_date as day,
    COUNT(DISTINCT user_id) as active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
GROUP BY activity_date 
HAVING COUNT(DISTINCT user_id) > 0
