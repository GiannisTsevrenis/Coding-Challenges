SELECT
    person.firstName,person.lastName,address.city,address.state
FROM
    person
LEFT JOIN
    address on person.personID = address.personID;
