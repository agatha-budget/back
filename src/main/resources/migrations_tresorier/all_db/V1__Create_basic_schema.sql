CREATE TABLE person (
    id VARCHAR(36) NOT NULL PRIMARY KEY,
    email VARCHAR(255) UNIQUE,
    name VARCHAR(255),
    password VARCHAR(255),
    unlockingDate BIGINT DEFAULT 0,
    loginAttemptCount INT DEFAULT 0,
    deleted BOOLEAN DEFAULT false
);

CREATE TABLE budget (
        id VARCHAR(36) NOT NULL PRIMARY KEY,
        person_id VARCHAR(36) NOT NULL,
        name VARCHAR(100) NOT NULL,
        deleted BOOLEAN DEFAULT false,
        FOREIGN KEY (person_id) REFERENCES person(id)
);

CREATE TABLE account (
        id VARCHAR(36) NOT NULL PRIMARY KEY,
        budget_id VARCHAR(36) NOT NULL,
        name VARCHAR(100) NOT NULL,
        archived BOOLEAN DEFAULT false,
        deleted BOOLEAN DEFAULT false,
    FOREIGN KEY (budget_id) REFERENCES budget(id)
);

CREATE TABLE category (
        id VARCHAR(36) NOT NULL PRIMARY KEY,
        budget_id VARCHAR(36) NOT NULL,
        name VARCHAR(100) NOT NULL,
        archived BOOLEAN DEFAULT false,
        deleted BOOLEAN DEFAULT false,
    FOREIGN KEY (budget_id) REFERENCES budget(id)
);

CREATE TABLE operation (
        id VARCHAR(36) NOT NULL PRIMARY KEY,
        operation_date BIGINT NOT NULL,
        account_id VARCHAR(36) NOT NULL,
        category_id VARCHAR(36) NOT NULL,
        inflow DECIMAL(10,2),
        outflow DECIMAL(10,2),
        memo VARCHAR(280) NOT NULL,
        FOREIGN KEY (account_id) REFERENCES account(id),
        FOREIGN KEY (category_id) REFERENCES category(id)
);

CREATE TABLE allocation (
        id VARCHAR(36) NOT NULL PRIMARY KEY,
        category_id VARCHAR(36) NOT NULL,
        allocation_month BIGINT,
        inflow DECIMAL(10,2),
        outflow DECIMAL(10,2),
    FOREIGN KEY (category_id) REFERENCES category(id),

        CONSTRAINT only_one_allocation_per_month_and_budget UNIQUE (category_id, allocation_month),
        -- prevent having an allocation for the same category pertaining to the same month but with a different date
        CONSTRAINT only_one_date_for_each_month CHECK (EXTRACT(DAY FROM TO_TIMESTAMP(allocation_month)) = 1)
);