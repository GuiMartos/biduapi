Create table Aluno(
    id bigint not null auto_increment primary key,
    nomealuno varchar (150),
    cursoid bigint not null
);

ALTER table Aluno add constraint FK_Aluno_Curso FOREIGN Key(cursoid) references Curso(id);
insert into aluno(nomealuno, cursoid) values ('Guilherme',1);
insert into aluno(nomealuno, cursoid) values ('Giovana',2);
insert into aluno(nomealuno, cursoid) values ('Luiz Otávio',3);
insert into aluno(nomealuno, cursoid) values ('Luiz Roberto',4);
insert into aluno(nomealuno, cursoid) values ('Andre',5);
insert into aluno(nomealuno, cursoid) values ('Nara',6);