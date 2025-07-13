SELECT name
FROM Employee
WHERE id IN (
    SELECT managerId
    FROM Employee
    WHERE managerId is not NULL
    GROUP BY managerId
    HAVING count(*) >= 5
)
