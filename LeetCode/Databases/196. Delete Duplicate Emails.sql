delete from Person
where id NOT IN (
    select * from(
        select MIN(id)
        from Person
         group by email
) as temp);
