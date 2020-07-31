-- https://www.hackerrank.com/challenges/salary-of-employees/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
-- Solution

SELECT name FROM Employee
WHERE salary > 2000 AND months < 10
ORDER BY employee_id;