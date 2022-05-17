insert into pacientes (firstname, secondname, firstsurname, secondsurname, age) values ('MARIO', 'ADOLFO', 'MARINES', 'COX', 18);
insert into pacientes (firstname, secondname, firstsurname, secondsurname, age) values ('VALERIA', 'MARIA', 'LOZANO', 'MARTON', 25);
insert into pacientes (firstname, secondname, firstsurname, secondsurname, age) values ('MANE', 'JUAQUIN', 'DE LA PARRA', 'OZUNA', 18);


insert into poliza (idcliente, estado, fechainicio, fechafin) values (1, 'PENDIENTE', NOW(), '2039-05-10');
insert into poliza (idcliente, estado, fechainicio, fechafin) values (2, 'ACEPTADO', NOW(), '2028-06-10');
insert into poliza (idcliente, estado, fechainicio, fechafin) values (3, 'PENDIENTE', NOW(), '2040-07-11');



insert into citas (fecha, hora, idpoliza, estado, observaciones) values (NOW(), NOW(), '1', 'PENDIENTE', 'NO HAY OBSERVACIONES');
insert into citas (fecha, hora, idpoliza, estado, observaciones) values (NOW(), NOW(), '2', 'ACEPTADO', 'GRAVE HERIDAD DE BALA');
insert into citas (fecha, hora, idpoliza, estado, observaciones) values (NOW(), NOW(), '3', 'CANCELADO', 'COVID');
