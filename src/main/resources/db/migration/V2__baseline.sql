CREATE TABLE USER_ADDRESS(
    appuser_address bigint PRIMARY KEY REFERENCES appuser(appuserid),
    address varchar(30)
);