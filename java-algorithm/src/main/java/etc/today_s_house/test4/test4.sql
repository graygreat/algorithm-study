SELECT m.name AS member_name, ROUND(AVG(p.price)) AS avg_amount, COUNT(o.id) AS order_count
FROM members m
         JOIN orders o ON m.id = o.member_id
         JOIN order_options op ON o.id = op.order_id
         JOIN payments p ON op.id = p.order_option_id
WHERE o.created_at >= '2020-12-01 00:00:00' AND o.created_at <= '2020-12-31 23:59:59'
GROUP BY (m.id)
ORDER BY avg_amount desc, order_count asc;


