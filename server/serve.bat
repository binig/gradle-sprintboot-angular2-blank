for /F %%g in (.env) do set %%g
java -jar build/libs/%1
