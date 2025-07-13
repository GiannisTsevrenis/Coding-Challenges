WITH FirstLogins AS (
    SELECT 
        player_id,
        MIN(event_date) AS first_login
    FROM 
        Activity
    GROUP BY 
        player_id
),
ConsecutiveLogins AS (
    SELECT 
        COUNT(DISTINCT a.player_id) AS consecutive_players
    FROM 
        Activity a
    JOIN 
        FirstLogins fl ON a.player_id = fl.player_id
    WHERE 
        DATEDIFF(a.event_date, fl.first_login) = 1
),
TotalPlayers AS (
    SELECT 
        COUNT(DISTINCT player_id) AS total_players
    FROM 
        Activity
)
SELECT 
    ROUND(
        (SELECT consecutive_players FROM ConsecutiveLogins) / 
        (SELECT total_players FROM TotalPlayers), 
        2
    ) AS fraction;
