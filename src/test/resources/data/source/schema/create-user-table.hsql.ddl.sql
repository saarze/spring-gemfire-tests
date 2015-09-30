CREATE TABLE Users (
  username VARCHAR(50) PRIMARY KEY,
  email VARCHAR(100),
  active BOOLEAN DEFAULT true,
  since TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);