# 1.
SELECT e.name
FROM Employee e
WHERE e.id IN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
)

# 2.
SELECT e1.name
FROM Employee e1
         INNER JOIN Employee e2
                    ON e1.id = e2.managerId
GROUP BY e2.managerId
HAVING COUNT(e2.managerId) >= 5