SELECT
    employee_id, department_id
FROM
    Employee
WHERE
    primary_flag = 'Y' OR employee_id IN (
        SELECT employee_id
        FROM Employee
        GROUP BY employee_id
        HAVING count(employee_id) = 1
    )
