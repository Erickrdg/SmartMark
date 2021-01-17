create database SmartMarks
go
use SmartMarks
go

create table CLIENTES
(
	CodigoCliente nvarchar (30) primary key not null,
	Nombre nvarchar (30) not null,
	Apellido nvarchar (30) not null,
	NumerodeTel numeric (8,0) not null,
	Pedido nvarchar (30) not null
	
) 

create table VENDEDORES
(	CodigoVendedor nvarchar (30) primary key not null,
	Nombre nvarchar (30) not null,
	Apellido nvarchar (30) not null,
	Correo Nvarchar (30) not null,
	CodigoCliente nvarchar(30) foreign key references CLIENTES(CodigoCliente)
)
Create table PRODUCTO 
(
	CodigoSapPro nvarchar (30) primary key not null,
	Descripcion nvarchar (30) not null,
	Tipo nvarchar (30) not null,
	Fabricante nvarchar (30) not null
	
)

create table PROVEEDORES 
(
	CodigoSapProve nvarchar (30) primary key not null,
	Marca nvarchar (30) not null,
	Tipo_Producto nvarchar (30) not null
	FOREIGN key (CodigoSapProve) references PRODUCTO(CodigoSapPro)

)

Create table INVENTARIOSHOWROOM
(
	CodigoSapInv nvarchar (30) primary key not null,
	ModuloTipo nvarchar (30) not null,
	NombreProducto nvarchar(30),
	FOREIGN key (CodigoSapInv) references PRODUCTO(CodigoSapPro)

)
Create table BODEGACONSUMIBLES 
(
	CodigoSapBod nvarchar (30) PRIMARY KEY not null,
	Fabricante nvarchar (30) not null,
	Tipo nvarchar (30) not null,
	Descripcion nvarchar (30) not null,
	FOREIGN key (CodigoSapBod) references PRODUCTO(CodigoSapPro)
)
Create table BODEGAPRINCIPAL
(
CodigoSapBodP nvarchar (30) Primary key not null,
Fabricante nvarchar (30) not null,
Tipo nvarchar (30) not null,
Descripcion nvarchar(30)
FOREIGN key (CodigoSapBodP) references PRODUCTO(CodigoSapPro)

)
Create table Facturas
(
NumerodeFactura int identity (0920,1),
CodigoCliente nvarchar(30) not null,
Nombre_Cliente nvarchar (30) not null,
CodigoVendedor nvarchar (30) not null,
FechadeCompra date,
CodigoSap nvarchar(30) not null,
foreign key (CodigoCliente) References CLIENTES(CodigoCliente),
foreign key (CodigoVendedor) References VENDEDORES(CodigoVendedor),
foreign key (CodigoSap) references PRODUCTO(CodigoSapPro)
)

--
create procedure InsertCliente
    @CodigoCliente nvarchar (30),
	@Nombre nvarchar (30),
	@Apellido nvarchar (30),
	@NumerodeTel numeric (8,0),
	@Pedido nvarchar (30)
	as 
	
	begin 
	Insert into CLIENTES
	values(@CodigoCliente, @Nombre, @Apellido, @NumerodeTel, @Pedido)
	end


--
create procedure InsertVendedores
	@CodigoVendedor nvarchar (30),
	@Nombre nvarchar (30),
	@Apellido nvarchar (30),
	@Correo Nvarchar (30),
	@CodigoCliente nvarchar(30)
	as 
	begin 
	Insert into VENDEDORES
	values(@CodigoVendedor, @Nombre, @Apellido, @Correo, @CodigoCliente)
	end

--
create procedure InsertProducto
    @CodigoSapPro nvarchar (30),
	@Descripcion nvarchar (30),
	@Tipo nvarchar (30),
	@Fabricante nvarchar (30)
	as 
	begin 
	Insert into PRODUCTO
	values(@CodigoSapPro, @Descripcion, @Tipo,@Fabricante)
	end
--
create procedure InsertProveedor
	@CodigoSapProve nvarchar (30) ,
	@Marca nvarchar (30),
	@Tipo_Producto nvarchar (30)
	as 
	begin 
	Insert into PROVEEDOR
	values(@CodigoSapProve, @Marca, @Tipo_Producto)
	end

--
create procedure InsertINVENTARIOSHOWROOM
	@CodigoSapInv nvarchar (30),
	@ModuloTipo nvarchar (30),
	@NombreProducto nvarchar(30)
	as 
	begin 
	Insert into INVENTARIOSHOWROOM
	values(@CodigoSapInv, @ModuloTipo, @NombreProducto)
	end

create procedure InsertBODEGACONSUMIBLES
	@CodigoSapBod nvarchar (30),
	@Fabricante nvarchar (30),
	@Tipo nvarchar (30),
	@Descripcion nvarchar (30)
	as 
	begin 
	Insert into BODEGACONSUMIBLES
	values(@CodigoSapBod, @Fabricante, @Tipo, @Descripcion)
	end


--
create procedure InsertBODEGAPRINCIPAL
	@CodigoSapBodP nvarchar (30),
	@Fabricante nvarchar (30),
	@Tipo nvarchar (30),
	@Descripcion nvarchar(30)
	as 
	begin 
	Insert into BODEGAPRINCIPAL
	values(@CodigoSapBodP, @Fabricante, @Tipo, @Descripcion)
	end

--
create procedure InsertFacturas
    @NumerodeFactura int,
	@CodigoCliente nvarchar(30),
	@Nombre_Cliente nvarchar (30),
	@CodigoVendedor nvarchar (30),
	@FechadeCompra date,
	@CodigoSap nvarchar(30)
	as 
	begin 
	Insert into Facturas
	values(@NumerodeFactura,@Nombre_Cliente, @CodigoVendedor, @FechadeCompra, @CodigoSap)
	end
	
----------------------------------------------------	
	--drop procedure InsertFacturas
	--drop database SmartMarks