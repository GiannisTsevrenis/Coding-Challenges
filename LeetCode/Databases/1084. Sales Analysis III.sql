SELECT DISTINCT p.product_id, p.product_name
FROM Sales s
JOIN Product p
ON p.product_id = s.product_id
GROUP BY p.product_id, p.product_name
HAVING MIN(s.sale_date) >= '2019-01-01'
   AND MAX(s.sale_date) <= '2019-03-31';
