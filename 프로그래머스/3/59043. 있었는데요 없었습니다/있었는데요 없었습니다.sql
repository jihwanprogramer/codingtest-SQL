SELECT O.ANIMAL_ID,O.NAME
FROM ANIMAL_OUTS O JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE O.DATETIME <I.DATETIME
ORDER BY I.DATETIME
