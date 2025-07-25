SELECT
    CASE
        WHEN id % 2 = 0 then id -1
        WHEN id = (SELECT MAX(id) from Seat) then id
        ELSE id+1
    END as id,
    student
FROM
    Seat
ORDER BY id
