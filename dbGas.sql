create database dbGas
use dbGas

drop database dbGas

create table tbTipoMovimentacao(
idTipoMovimentacao int primary key identity(1,1),
nmTipoMovimentacao varchar(50) not null,
dscrTipoMovimentacao varchar(100),
situacao bit,
saidaFinanceira bit,
entradaFinanceira bit,
saidaEstoque bit,
entradaEstoque bit,
requerFuncionario bit,
idTipoMovimentacaoPai int)
aLTER TABLE tbTipoMovimentacao add foreign Key (idTipoMovimentacaoPai) references tbTipoMovimentacao(idTipoMovimentacao)

create table tbProduto(
idProduto int primary key identity(1,1),
nmProduto varchar(50) not null,
dscrProduto varchar(100))

create table tbFuncionario(
idFuncionario int primary key identity(1,1),
nmFuncionario varchar(50) not null,
nmCargoFuncionario varchar(50))

create table tbMovimentacao(
idMovimentacao int primary key identity(1,1),
dtMovimentacao smalldatetime not null,
vlMovimentacao float,
dscrMovimentacao varchar(100),
qtdMovimentacao integer,
tipoMovimentacao int not null,
funcionario int,
produto int,
foreign Key (tipoMovimentacao) references tbTipoMovimentacao,
foreign Key (produto) references tbProduto on delete cascade,
foreign Key (funcionario) references tbFuncionario on delete cascade)

select * from tbMovimentacao

/*create table tbMovimentacaoEstoque(
idMovmEstoque int primary key identity(1,1),
dtMovmEstoque smalldatetime not null,
qtdMovmEstoque int not null,
produto int,
tipoMovimentacao int,
foreign Key (produto) references tbProduto on delete cascade,
foreign Key (tipoMovimentacao) references tbTipoMovimentacao on delete cascade)*/