-- https://www.hackerrank.com/challenges/the-blunder/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
-- Solution

SELECT
    CEIL(AVG(Salary) - AVG(REPLACE(SALARY, '0', '')))
FROM EMPLOYEES;