UPDATE Salary
SET sex = CASE
    when sex = 'f'then 'm'
    when sex = 'm' then 'f'
    ELSE sex
END;
