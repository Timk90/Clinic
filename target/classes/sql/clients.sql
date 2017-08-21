CREATE  TABLE clients (
  id SERIAL NOT NULL,
  firstname VARCHAR(45) NOT NULL,
  lasttname VARCHAR(45) NOT NULL,
  patronymic VARCHAR(45) ,
  phone VARCHAR(45),
  active TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
);