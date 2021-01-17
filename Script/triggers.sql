use PROYECTO5

---  Para crear un disparador que almacene los datos restados de la tabla INVENTARIO
----- creamos lo que es una tabla que lo almacene(Historial), posteriormente creamos el trigger
---- el cual indicamos que al eliminar en la tabla inventario, se almacenen los datos que nos interezan.

create table Historial
(
CodigoSapInv int identity(1,1) primary key ,
Existencias int,
Disponibilidad int,
IdProducto int FOREIGN key references PRODUCTO(CodigoSapPro)  on delete cascade on update cascade
)


create trigger BORRADOR
on INVENTARIO
for delete
as
insert into Historial(CodigoSapInv,
Existencias,
Disponibilidad,
IdProducto)
select CodigoSapInv,
Existencias,
Disponibilidad,
IdProducto
from deleted
select * from Historial
 DELETE FROM INVENTARIO WHERE CodigoSapInv = 2

 select *  from Historial
--- Un Trigger especial que al momento de insertar un cliente, se guarda en una tabla determinada.
 create table HISOTORIALCLINSER
(
	CodCliente int,
	Nombre nvarchar (40) not null,
	Apellido nvarchar (40) not null,
	NumCedula nvarchar (16),
	INSS varchar(20) not null,
	Direccion varchar(25)not null,
	Genero char(1) not null,
	EstadoCivil varchar (20) not null,
	NumTel int not null,
	Pedido nvarchar (40) not null,
	Correo nvarchar (40) not null
);

 CREATE TRIGGER INSERTAR
ON clientes
FOR insert
AS
INSERT INTO HISOTORIALCLINSER(CodCliente,Nombre,Apellido ,NumCedula ,INSS,Direccion,Genero,EstadoCivil,NumTel,Pedido,Correo)
SELECT CodCliente,Nombre,Apellido ,NumCedula ,INSS,Direccion,Genero,EstadoCivil,NumTel,Pedido,Correo
FROM inserted
select * from HISOTORIALCLINSER