SELECT
    e1.employee_id,
    e1.name,
    count(e1.employee_id) as reports_count,
    ROUND(AVG(e2.age)) as average_age
FROM Employees e1
JOIN Employees e2 on e1.employee_id = e2.reports_to
GROUP BY e1.employee_id
ORDER BY e1.employee_id
