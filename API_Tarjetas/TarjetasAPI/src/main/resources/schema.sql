DROP TABLE IF EXISTS tarjeta;
DROP TABLE IF EXISTS rangoedad;
DROP TABLE IF EXISTS montlysalary;
DROP TABLE IF EXISTS activity;


CREATE TABLE rangoedad (
  id_rango INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  rango_inferior INT NOT NULL,
  rango_superior INT NOT NULL
  );



CREATE TABLE montlysalary (
  id_montly_salary INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  inferior_salary INT NOT NULL,
  superior_salary INT NOT NULL
  );


CREATE TABLE activity (
  id_activity INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  activity_name VARCHAR(50) NOT NULL
  );


CREATE TABLE tarjeta (
  id_tarjeta INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre_tarjeta VARCHAR(50) NOT NULL,
  id_edad INT NOT NULL,
  id_actividad INT NOT NULL,
  id_salary INT NOT NULL,
    FOREIGN KEY (id_salary)
    REFERENCES montlysalary (id_montly_salary),
    FOREIGN KEY (id_edad)
    REFERENCES rangoedad (id_rango),
    FOREIGN KEY (id_actividad)
    REFERENCES activity (id_activity)
  );

