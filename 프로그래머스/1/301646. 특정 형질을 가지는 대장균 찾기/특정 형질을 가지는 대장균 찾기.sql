SELECT
    COUNT(*) AS count
FROM
    ECOLI_DATA
WHERE
    genotype & (1 << 1) = 0
    AND genotype & (1 << 2) | genotype & 1;