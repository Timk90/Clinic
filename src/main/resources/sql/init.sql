drop table if EXISTS clients CASCADE ;
drop table if EXISTS doctors CASCADE ;
drop table if EXISTS roles CASCADE ;

CREATE TABLE doctors (
  id SERIAL NOT NULL,
  firstname VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NOT NULL,
  patronymic VARCHAR(45),
  password VARCHAR(45) NOT NULL,
  speciality VARCHAR(45),
  cabinet SMALLINT NOT NULL,
  enabled SMALLINT NOT NULL DEFAULT 1,
  PRIMARY KEY(id)
);

CREATE  TABLE clients (
  id SERIAL NOT NULL,
  firstname VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NOT NULL,
  patronymic VARCHAR(45) ,
  phone VARCHAR(45),
  polis VARCHAR(45),
  active SMALLINT NOT NULL DEFAULT 1,
  doctor_id INTEGER NOT NULL,
  FOREIGN KEY (doctor_id) REFERENCES doctors (id)
);


CREATE  TABLE roles (
  doctor_id INTEGER NOT NULL,
  role VARCHAR(45) NOT NULL,
  FOREIGN KEY (doctor_id) REFERENCES doctors (id)
);
