create database dbGas
use dbGas

drop database dbGas

create table tbTipoMovimentacaoFinanceira(
idTipoMovmFinanceira int primary key identity(1,1),
nmTipoMovmFinanceira varchar(50) not null,
dscrTipoMovmFinanceira varchar(100))

create table tbProduto(
idProduto int primary key identity(1,1),
nmProduto varchar(50) not null,
dscrProduto varchar(100) not null)

create table tbSalario(
idSalario int primary key identity(1,1),
dtInicioVigencia smalldatetime not null,
dtTerminoVigencia smalldatetime not null,
vlSalario float not null)

create table tbMovimentacaoEstoque(
idMovmEstoque int primary key identity(1,1),
dtMovmEstoque smalldatetime not null,
qtdMovmEstoque int not null,
produto int,
tipoMovmFinanceira int,
foreign Key (produto) references tbProduto on delete cascade,
foreign Key (tipoMovmFinanceira) references tbTipoMovimentacaoFinanceira on delete cascade)

create table tbFuncionario(
idFuncionario int primary key identity(1,1),
nmFuncionario varchar(50) not null,
nmCargoFuncionario varchar(50) not null,
idSalario int,
foreign Key (idSalario) references tbSalario on delete cascade)

create table tbMovimentacaoFinanceira(
idMovmFinanceira int primary key identity(1,1),
dtMovmFinanceira smalldatetime not null,
vlMovmFinanceira float not null,
dscrMovmFinanceira varchar(100),
tipoMovmFinanceira int,
movimentacaoEstoque int,
funcionario int,
foreign Key (tipoMovmFinanceira) references tbTipoMovimentacaoFinanceira,
foreign Key (movimentacaoEstoque) references tbMovimentacaoEstoque on delete cascade,
foreign Key (funcionario) references tbFuncionario on delete cascade)

/*Create table tbVenda(
codVenda int primary key identity(1,1),
dtVenda varchar(10) not null,
vlUnitarioVenda double not null,
qtdVenda int not null)*/

/*create table tbCompra(
codCompra int primary key identity(1,1),
dtCompra varchar(10) not null,
vlUnitarioCompra double not null,
qtdCompra int not null)*/

/*create table tbDespesa(
codDespesa int primary key identity(1,1),
tipoDespesa varchar(50) not null,
vlDespesa double not null,
dtDespesa varchar(10) not null)*/

/*create table tbBaixadeEstoque(
codBaixaEstoque int primary key identity(1,1),
custoBaixaEstoque float not null,
qtdBaixaEstoque int not null,
dtBaixaEstoque varchar(10) not null,
obsBaixaEstoque varchar(100),
codDespesa int not null,
codTipoBaixa
foreign Key (codDespesa) references tbDespesa,
foreign Key (codTipoBaixa) references tbTipoBaixaEstoque)*/

/*create table tbTipoBaixadeEstoque(
codTipoBaixa int primary key identity(1,1),
nmTipoBaixa varchar(50))*/

/*create table tbAdiantamentodeSalario(
codAdiantamento int primary key identity(1,1),
nmFuncionarioAdiantamento varchar(50) not null,
vlAdiantamento double not null,
dtAdiantamento varchar(10) not null,
obsAdiantamento varchar(100))*/

