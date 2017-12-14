CREATE USER lease_service WITH PASSWORD 'veebiteenused';
CREATE DATABASE lease_service WITH OWNER = 'lease_service';
-- login as lease_service
DROP TABLE IF EXISTS accounts CASCADE;
DROP TABLE IF EXISTS vehicles CASCADE;
DROP TABLE IF EXISTS account_vehicles CASCADE;

CREATE TABLE accounts (
  id bigserial,
  created_at date NOT NULL DEFAULT current_date,
  name varchar(1024) NOT NULL,
  CONSTRAINT PK_accounts PRIMARY KEY (id)
);

CREATE TABLE vehicles (
  vin varchar(17),
  license_plate varchar(10) NOT NULL,
  type varchar(16) NOT NULL,
  brand varchar(255) NOT NULL,
  model varchar(255) NOT NULL,
  acquired_at date NOT NULL DEFAULT current_date,
  sold_at date NULL DEFAULT NULL,
  CONSTRAINT PK_vehicles PRIMARY KEY(vin)
);

CREATE TABLE account_vehicles (
  account_id bigint,
  vin varchar(17) NOT NULL,
  lease_start date NOT NULL,
  lease_end date NOT NULL,
  lease_per_month decimal(19, 2) NOT NULL,
  CONSTRAINT PK_account_vehicles PRIMARY KEY(account_id, vin),
  CONSTRAINT AK_account_vehicles_vin UNIQUE (vin),
  CONSTRAINT FK_account_vehicles_vin FOREIGN KEY (vin) REFERENCES vehicles (vin) ON DELETE No Action ON UPDATE Cascade,
  CONSTRAINT FK_account_vehicles_account_id FOREIGN KEY (account_id) REFERENCES accounts (id) ON DELETE No Action ON UPDATE Cascade
);
