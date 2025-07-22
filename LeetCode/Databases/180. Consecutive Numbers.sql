SELECT
    DISTINCT l1.num as ConsecutiveNums
FROM
    Logs l1
JOIN Logs l2 on l2.id = l1.id +1
JOIN Logs l3 on l3.id = l2.id + 1
WHERE l1.num = l2.num AND l2.num = l3.num;
