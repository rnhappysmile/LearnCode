-- https://www.hackerrank.com/challenges/population-density-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
-- Solution

SELECT MAX(Population) - MIN(Population) AS DIFFERENCE FROM City;