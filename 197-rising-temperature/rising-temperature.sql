/* Write your PL/SQL query statement below */
select Id from Weather w1 where w1.temperature > (select w2.temperature from Weather w2 where w2.recordDate = w1.recordDate-1);
