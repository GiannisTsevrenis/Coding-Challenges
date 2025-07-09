SELECT MAX(num) as num
FROM
    (
    SELECT
        num
    FROM
        MyNumbers
    GROUP BY num
    HAVING count(*) = 1
    ) as unique_nums;
