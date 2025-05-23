SELECT YEAR(SALES_DATE) YEAR,MONTH(SALES_DATE) MONTH,U.GENDER,COUNT(DISTINCT(O.USER_ID)) USERS
FROM USER_INFO U JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY 1,2,3
ORDER BY 1,2,3