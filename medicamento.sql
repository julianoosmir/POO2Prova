create table Medicamento
(
    id                    int auto_increment,
    nome                  varchar(50) not null,
    laboratorioFabricante varchar(50) not null,
    principioAtivo        varchar(50) not null,
    doenca                int         null,
    constraint Medicamento_id_uindex
        unique (id),
    constraint doenca
        foreign key (doenca) references Doenca (doencaId)
);

alter table Medicamento
    add primary key (id);


