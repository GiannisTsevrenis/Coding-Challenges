SELECT
    e1.name as Employee
FROM
    Employee e1
JOIN Employee e2 on e1.managerID = e2.id
WHERE
    e1.salary > e2.salary
