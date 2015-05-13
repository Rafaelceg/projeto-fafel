CREATE TABLE voo
(
  numero integer NOT NULL,
  origem character varying(40),
  destino character varying(40),
  paradas integer,
  CONSTRAINT voo_pkey PRIMARY KEY (numero)
)