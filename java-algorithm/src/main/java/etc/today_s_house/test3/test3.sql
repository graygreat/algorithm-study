SELECT o.id as order_id, m.name as name,
       CASE
           WHEN (payment_method IN ("point")) THEN '1'
           ELSE '0'
           END AS is_point
FROM members m
         JOIN orders o ON m.id = o.member_id
         JOIN order_options op ON o.id = op.order_id
         JOIN payments p ON op.id = p.order_option_id
GROUP BY o.id
ORDER BY o.id;
