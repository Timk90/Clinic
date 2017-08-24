
INSERT INTO doctors (FIRSTNAME, LASTNAME, PATRONYMIC, password, speciality, cabinet)
VALUES ('Юриус', 'Фельдоков', 'Архипович', '932181629', 'kid doctor', 312);

INSERT INTO doctors (FIRSTNAME, LASTNAME, PATRONYMIC, password, speciality, cabinet, enabled)
VALUES ('Bubin', 'Rubin', 'Архипович', 'bubin', 'adult doctor', 312, 1);

INSERT INTO doctors (FIRSTNAME, LASTNAME, password, speciality, cabinet)
VALUES ('Admin', 'Admin',  '1234', 'empty', 54);

INSERT INTO roles (doctor_id, role)
values (1, 'ROLE_DOCTOR');

INSERT INTO roles (doctor_id, role)
values (2, 'ROLE_DOCTOR');

INSERT INTO roles (doctor_id, role)
values (3, 'ROLE_ADMIN');
INSERT INTO roles (doctor_id, role)
values (3, 'ROLE_DOCTOR');


INSERT INTO clients (FIRSTNAME, LASTNAME, PATRONYMIC, PHONE, POLIS, doctor_id, active)
VALUES ('Timur', 'Burganov', 'Ильдарович', '9503181629', '38213213',1, 1);

INSERT INTO clients (FIRSTNAME, LASTNAME, PATRONYMIC, PHONE, POLIS, doctor_id, active)
VALUES ('Мазумбек', 'Габдулдрисов', 'Исербекович', '313629', '38213213', 3, 1);

INSERT INTO clients (FIRSTNAME, LASTNAME, PATRONYMIC, PHONE, POLIS, doctor_id, active)
VALUES ('Ухтанджул', 'Задрунбаев', 'Суберкакович', '312313629', '38213213' , 2, 1);

INSERT INTO clients (FIRSTNAME, LASTNAME, PATRONYMIC, PHONE, POLIS, doctor_id, active)
VALUES ('Салехер', 'Панхупердыев', 'Гозинбураевич', '312313629', '38213213' , 1, 1);