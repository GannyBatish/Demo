CREATE TABLE user
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(230) NULL,
    last_name  VARCHAR(255) NULL,
    age        INT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);