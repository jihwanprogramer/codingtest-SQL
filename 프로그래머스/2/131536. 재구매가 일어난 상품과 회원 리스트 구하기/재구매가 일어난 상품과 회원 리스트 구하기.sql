SELECT USER_ID,PRODUCT_ID
FROM ONLINE_SALE
GROUP BY 1,2
HAVING COUNT(*)>=2
ORDER BY 1,2 DESC