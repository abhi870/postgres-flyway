CREATE TABLE IF NOT EXISTS appuser(
    appuserid UUID PRIMARY KEY,
    first_name varchar(30),
    last_name varchar(30)
);

--CREATE TABLE USER_ADDRESS(
--    appUserAddressId UUID PRIMARY KEY REFERENCES APP_USER(appuserid),
--    address varchar(30)
--);