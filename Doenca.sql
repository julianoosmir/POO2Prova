create table Doenca
(
    doencaId int auto_increment,
    cid      varchar(20) not null,
    nome     varchar(50) not null,
    constraint Doenca_id_uindex
        unique (doencaId)
);

alter table Doenca
    add primary key (doencaId);


