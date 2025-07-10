select
    id, movie, description, rating
from
    Cinema
where
    description != 'boring' AND id & 1 = 1
ORDER BY rating DESC;
