CREATE TABLE jogador
(
  login character varying(50) NOT NULL,
  senha character varying(16),
  email character varying(50),
  CONSTRAINT "chave primária" PRIMARY KEY (login)
)
INSERT INTO JOGADOR (LOGIN,SENHA,EMAIL) VALUES ('Rafael','789w3789','rafael_ceg@hotmail.com');
INSERT INTO JOGADOR (LOGIN,SENHA,EMAIL) VALUES ('IA','firstplace','eusouvirtual@vocamail.com');
INSERT INTO JOGADOR (LOGIN,SENHA,EMAIL) VALUES ('Nekomura','hellokitty','minharoupaeestranha@vocamail.com');
INSERT INTO JOGADOR (LOGIN,SENHA,EMAIL) VALUES ('Yuzuki','yukari','souamelhorv4@vocamail.com');

SELECT * FROM JOGADOR;

DELETE FROM JOGADOR WHERE LOGIN='silviosantos';

UPDATE JOGADOR SET SENHA='ahsoftware', EMAIL='linon@vocamail.com' WHERE LOGIN = 'Yuzuki';

INSERT INTO PERGUNTA (NIVEL,A,B,C,D,CERTA,ENUNCIADO) VALUES (2,'1944','1937','1939','1941','D','Em que ano foi desenvolvido o PET?');
INSERT INTO PERGUNTA (NIVEL,A,B,C,D,CERTA,ENUNCIADO) VALUES (3,'BMW','HONDA','Yamaha','Dafra','A','A R1200C é uma motocicleta fabricada por qual empresa?');
INSERT INTO PERGUNTA (NIVEL,A,B,C,D,CERTA,ENUNCIADO) VALUES (5,'54,04','51,40','53,17','52,03','C','Qual o diâmetro do Asteróide Beagle 656?');
INSERT INTO PERGUNTA (NIVEL,A,B,C,D,CERTA,ENUNCIADO) VALUES (4,'Mato Grosso','Espírito Santo','Pará','Alagoas','C','A Comunidade Batista Cristã foi fundada em que estado?');
INSERT INTO PERGUNTA (NIVEL,A,B,C,D,CERTA,ENUNCIADO) VALUES (2,'1993','1992','1994','1991','A','O álbum Ana Ma`akon da cantora libanesa Najwa Karam foi lançado em que ano?');

SELECT * FROM PERGUNTA ORDER BY ID;

DELETE FROM PERGUNTA WHERE ID = 1; 

UPDATE PERGUNTA SET ENUNCIADO='Qual o animal presente na cédula de 5 reais?', A='Pombo',B='Capivara',C='Petauro do Açucar',D='Garça',CERTA='D',NIVEL=1 WHERE ID=5;

INSERT INTO RANKING (DATA,PONTOS,LOGIN) VALUES ('27/03/2015',12,'Rafael');
INSERT INTO RANKING (DATA,PONTOS,LOGIN) VALUES ('28/03/2015',17,'IA');
INSERT INTO RANKING (DATA,PONTOS,LOGIN) VALUES ('28/03/2015',10,'Nekomura');
INSERT INTO RANKING (DATA,PONTOS,LOGIN) VALUES ('28/03/2015',8,'Yuzuki');

SELECT * FROM RANKING ORDER BY ID;

DELETE FROM RANKING WHERE ID=2;
UPDATE RANKING SET PONTOS=13, DATA='28/03/2015', LOGIN='Rafael' WHERE ID =1;

