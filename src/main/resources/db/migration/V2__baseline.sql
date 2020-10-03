

CREATE TABLE IF NOT EXISTS appuser(
    appuserid UUID PRIMARY KEY,
    addressid UUID REFERENCES user_address(addressid),
    first_name varchar(30),
    last_name varchar(30)
);