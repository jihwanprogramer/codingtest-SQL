SELECT CONCAT('/home/grep/src/',B.BOARD_ID,'/',F.FILE_ID,F.FILE_NAME,F.FILE_EXT) FILE_PATH
FROM USED_GOODS_BOARD B JOIN USED_GOODS_FILE F ON B.BOARD_ID = F.BOARD_ID
WHERE VIEWS IN (SELECT MAX(VIEWS)
                FROM USED_GOODS_BOARD
                ) 
ORDER BY F.FILE_ID DESC

