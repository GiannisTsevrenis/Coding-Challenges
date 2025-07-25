(SELECT u.name as results
FROM MovieRating m
JOIN Users u ON u.user_id = m.user_id
GROUP BY u.user_id, u.name
ORDER BY count(*) DESC, u.name ASC
LIMIT 1)

UNION ALL

(SELECT m.title as results
FROM MovieRating mr
JOIN Movies m ON mr.movie_id = m.movie_id
WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY m.movie_id, m.title
ORDER BY AVG(rating) DESC, m.title ASC
LIMIT 1);
