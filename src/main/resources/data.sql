create table ingresso (
    id varchar(255) not null primary key,
    nome varchar(255) not null,
    descricao varchar(512),
    preco numeric(18,2)
);