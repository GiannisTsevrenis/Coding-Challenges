SELECT p.product_id,ROUND(COALESCE(SUM(u.units * p.price) * 1.0 / NULLIF(SUM(u.units), 0), 0), 2) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
    on  p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id
