CREATE TABLE USER_ADDRESS(
    addressid UUID PRIMARY KEY,
    appuser_address UUID  REFERENCES appuser(appuserid),
    address varchar(30)
);