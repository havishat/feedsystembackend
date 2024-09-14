# Feed System - Backend

# Technologies 
 - Java
 - 
# Database
 - Neo4j
 - SQL Server

# Connect to database
- Local Installation
  - Docker (docker desktop )
    - Pull the container from the registry
      - ``docker pull mcr.microsoft.com/mssql/server:2022-latest``
    - Run the container
      - ``docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=<YourStrong@Passw0rd>" \
        -p 1433:1433 --name sql1 --hostname sql1 \
        -d \
        mcr.microsoft.com/mssql/server:2022-latest``
  - Run the below database Script 
     `` Create a new database
          - CREATE DATABASE TestDB;
     ``

