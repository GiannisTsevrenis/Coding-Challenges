SELECT
    v.customer_id, count(*) as count_no_trans
FROM
    Transactions t
RIGHT JOIN
    Visits v
ON 
    v.visit_id = t.visit_id
WHERE 
    t.transaction_id IS NULL
GROUP BY 
    v.customer_id;
