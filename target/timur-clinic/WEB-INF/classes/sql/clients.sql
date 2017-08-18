CREATE  TABLE clients (
  id SERIAL NOT NULL,
  firstname VARCHAR(45) NOT NULL,
  lasttname VARCHAR(45) NOT NULL,
  patronim VARCHAR(45) ,
  phone VARCHAR(45),
  enabled TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
);