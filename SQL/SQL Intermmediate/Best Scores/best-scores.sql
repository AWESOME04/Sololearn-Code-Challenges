SELECT nickname, MAX(score) AS best
FROM Scores
GROUP BY nickname
ORDER BY best DESC;
