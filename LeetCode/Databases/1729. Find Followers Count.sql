SELECT
    user_id, count(user_id) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;
