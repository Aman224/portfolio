CREATE TABLE IF NOT EXISTS Home (
    id INT NOT NULL,
    name varchar(250) NOT NULL,
    address varchar(250),
    phone varchar(16),
    linkedIn varchar(64),
    github varchar(64),
    description varchar(512),
    cv varchar(64),
    projects varchar(64),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Projects (
    id INT NOT NULL,
    name varchar(256),
    description varchar(256),
    languages varchar(64),
    link varchar(64),
    PRIMARY KEY (id)
);