
INSERT INTO doctors (FIRSTNAME, LASTNAME, PATRONYMIC, password, speciality, cabinet)
VALUES ('Юриус', 'Фельдоков', 'Архипович', '932181629', 'kid doctor', 312);

INSERT INTO clients (FIRSTNAME, LASTNAME, PATRONYMIC, PHONE, doctor_id, active)
VALUES ('Timur', 'Burganov', 'Ильдаровчи', '9503181629', 1, 1);

INSERT INTO doctors (FIRSTNAME, LASTNAME, password, speciality, cabinet)
VALUES ('Admin', 'Admin',  '1234', 'empty', 0);

INSERT INTO roles (doctor_id, role)
values (1, 'ROLE_DOCTOR');

INSERT INTO roles (doctor_id, role)
values (2, 'ROLE_ADMIN');
