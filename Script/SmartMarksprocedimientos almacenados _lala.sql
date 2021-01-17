use SmartMarks
/****************************************/
/*PROCEDIMIENTO ALMACENADO TBL_EMPLEADOS*/
/****************************************/

/************INSERTAR*****************/
 create procedure insertEmpleados 
 (
 @Nombre varchar(50),
 @Apellido varchar(50),
 @Direccion nvarchar(50)
 )
 as
 insert into Empleados(Nombre,Apellido,Direccion) 
               values (@Nombre,@Apellido,@Direccion)

 exec insertEmpleados 'Yader','Quiroz','Unidad de proposito'

 select * from Empleados


 /************Actualizar*****************/

 create procedure updateEmpleados
 
 @Nombre  varchar(50),
 @Apellido varchar(50),
 @Direccion nvarchar(50)
 as 
 begin
 UPDATE Empleados
 set  Nombre =@Nombre , Apellido = @Apellido , Direccion = @Direccion
 where Nombre= @Nombre
 end

 Exec updateEmpleados 'Diego','Manzanarez','Las Flores'

 Select * from Empleados

 /************Eliminar*****************/

 Create procedure delEmpleados
 @Nombre  varchar(50),
 @Apellido varchar(50),
 @Direccion nvarchar(50)
 as
 begin
 delete from Empleados
 where  Nombre =@Nombre
 end

 exec delEmpleados  'Juan','Beteta','Las Banderas'

 select * from Empleados

/****************************************/
/*PROCEDIMIENTO ALMACENADO TBL_ClIENTE */
/****************************************/

/************INSERTAR*****************/

 Create procedure insertCliente
 (
@Id_Empleados int,
@Nombre nvarchar(50),
@Apellido nvarchar(50),
@Direccion nvarchar (50),
@Fecha_Nacimiento date ,
@Telefono int,
@Email nvarchar(50)
)
as
insert into Cliente (Id_Empleados,Nombre,Apellido,Direccion ,Fecha_Nacimiento,Telefono,Email)
values (@Id_Empleados,@Nombre,@Apellido,@Direccion,@Fecha_Nacimiento,@Telefono,@Email)

exec insertCliente 4,'Michael','Lopez','Rama','04/06/1995',81917009,'MichaelLopez_@gmail.com'

Select * from Cliente

/************Actualizar*****************/
 create procedure updateCliente
@Id_Empleados int,
@Nombre nvarchar(50),
@Apellido nvarchar(50),
@Direccion nvarchar (50),
@Fecha_Nacimiento date ,
@Telefono int,
@Email nvarchar(50)
 as 
 begin
 UPDATE Cliente
 set  Id_Empleados =@Id_Empleados , Nombre = @Nombre ,Apellido = @Apellido ,Direccion = @Direccion,
 Fecha_Nacimiento= @Fecha_Nacimiento, Telefono = @Telefono , Email = @Email
 where Id_empleados= @Id_empleados
 end

 Exec updateCliente 2,'Jhonathan','Blandon','Costa Rica','03/02/1999',71923632,'Blandon@hotmail.com'

 Select * from Cliente


 /************Eliminar*****************/

 Create procedure delClientes
 @Id_Empleados int,
@Nombre nvarchar(50),
@Apellido nvarchar(50),
@Direccion nvarchar (50),
@Fecha_Nacimiento date ,
@Telefono int,
@Email nvarchar(50)

 as
 begin
 delete from Clientes
 where  Id_empleados =@Id_Empleados
 end

 exec delClientes 3,'Gabriel','Mendoza','Esteli','02/03/1994',56555232,'Mendoza_02@oulock.es'

 select * from Clientes


 /****************************************/
/*    PROCEDIMIENTO ALMACENADO MODO_PAGO */
/****************************************/
/************INSERTAR*****************/
 Create procedure insertMODO_PAGO
 (
 @Nombre nvarchar (50),
 @Otros_detalles varchar (50)
 )
 as
 insert into MODO_PAGO (Nombre,Otros_Detalles)
 values (@Nombre,@Otros_Detalles)

 exec insertMODO_PAGO 'Jose','Cheque'

 Select * from MODO_PAGO

 /************Actualizar*****************/

 create procedure updateMODO_PAGO
 @Nombre nvarchar (50),
 @Otros_detalles varchar (50)
 as 
 begin
 UPDATE MODO_PAGO
 set  Nombre =@Nombre , Otros_Detalles = @Otros_detalles
 where Nombre= @Nombre
 end

 Exec updateMODO_PAGO  'Gabriel','Efectivo'

 Select * from MODO_PAGO
 
 /************Eliminar*****************/

 Create procedure delMODO_PAGO
 @Nombre nvarchar(50),
 @Otros_detalles  varchar (50)
 as
 begin
 delete from MODO_PAGO
 where Nombre =@Nombre
 end

 exec delMODO_PAGO 'Jose ','Cheque'

 select * from MODO_PAGO


 /****************************************/
/*    PROCEDIMIENTO ALMACENADO FACTURA  */
/****************************************/
/************INSERTAR*****************/
 Create procedure insertFactura
 (
 @Id_Cliente int,
 @Num_Pago int,
 @Fecha date
 )
 as
 insert into FACTURA (Id_Cliente, Num_Pago,Fecha)
 values (@Id_Cliente,@Num_Pago, @Fecha)

 exec insertFactura 4,4, '07/07/2020'

 Select * from FACTURA

  
 /*************Actualizar*****************/

 create procedure updateFACTURA
 @Id_Cliente int,
 @Num_Pago int,
 @Fecha date
 as 
 begin
 UPDATE FACTURA
 set  Id_Cliente = @Id_Cliente , Num_Pago  = @Num_Pago, fecha = @Fecha
 where Id_Cliente = @Id_Cliente
 end

 Exec updateFACTURA  1,1,'06/25/2022'

 Select * from FACTURA
 
  /************Eliminar*****************/

 Create procedure delFACTURA
 @Id_Cliente int,
 @Num_Pago int,
 @Fecha date
 as
 begin
 delete from FACTURA
 where Id_Cliente =@Id_Cliente
 end

 exec delFACTURA 4 ,4 ,'07/07/2020'

 select * from FACTURA
  
 /****************************************/
/* PROCEDIMIENTO ALMACENADO CATEGORIA  */
/****************************************/
/************INSERTAR*****************/
 Create procedure insertCategoria
 (
 @Nombre nvarchar (50),
 @Descripcion varchar (50)
 )
 as
 insert into Categoria(Nombre, Descripcion)
 values (@Nombre,@Descripcion)

 exec insertCategoria 'Cacao','litro'

 Select * from Categoria

 /*************Actualizar*****************/

 create procedure updateCategoria
 @Nombre nvarchar (50),
 @Descripcion varchar (50)
 as 
 begin
 UPDATE Categoria
 set  Nombre= @Nombre ,Descripcion= @Descripcion
 where Nombre = @Nombre
 end

 Exec updateCategoria 'Queso','libra'
 

 Select * from Categoria
 
 
 /************Eliminar*****************/

 Create procedure delCategoria
 @Nombre nvarchar (50),
 @Descripcion varchar (50)
 as
 begin
 delete from Categoria
 where Nombre =@Nombre
 end

 exec delCategoria 'leche','litro'

 select * from Categoria

 /****************************************/
/*   PROCEDIMIENTO ALMACENADO PRODUCTO  */
/****************************************/
/************INSERTAR*****************/
 Create procedure insertProducto
 (
 @Id_Categoria int, 
 @Nombre nvarchar (50),
 @Precio Money ,
 @Stock Integer
 )
 as
 insert into Producto(Id_Categoria,Nombre,Precio,Stock)
 values (@Id_Categoria,@Nombre,@Precio,@Stock)

 exec insertProducto 5,'Chocolate','25','100'
 Select * from Producto

 /*************Actualizar*****************/

 create procedure updateProducto
 @Id_Categoria int, 
 @Nombre nvarchar (50),
 @Precio Money ,
 @Stock Integer
 as 
 begin
 UPDATE Producto
 set  Id_Categoria= @Id_Categoria,Nombre= @Nombre ,Precio= @Precio,Stock =@Stock
 where Id_Categoria = @Id_Categoria 
 end

 Exec updateProducto 5,'Chocolate','30','120'

 Select * from Producto

 /************Eliminar*****************/

 Create procedure delProducto
 @Id_Categoria int, 
 @Nombre nvarchar (50),
 @Precio Money ,
 @Stock Integer
 as
 begin
 delete from Producto
 where Id_Categoria=@Id_Categoria 
 end

 exec delProducto 5,'Chocolate','30','120'

 select * from Producto

 /****************************************/
/*   PROCEDIMIENTO ALMACENADO DETALLE */
/****************************************/
/************INSERTAR*****************/
 Create procedure insertDetalle
 (
 @Id_factura int, 
 @Num_factura int ,
 @Id_Producto int,
 @Cantidad int ,
 @Precio Money
 )
 as
 insert into Detalle (Id_factura ,Num_factura,Id_Producto,Cantidad,Precio)
 values (@Id_factura,@Num_factura,@Id_Producto,@Cantidad,@Precio)

 exec  insertDetalle 7,7,11,20,'10'
 Select * from Detalle

 /*************Actualizar*****************/

 create procedure updateDetalle
 @Id_factura int, 
 @Num_factura int ,
 @Id_Producto int,
 @Cantidad int ,
 @Precio Money
 
 as 
 begin
 UPDATE Detalle
 set  Id_factura= @Id_factura,Num_factura= @Num_factura ,Id_Producto= @Id_Producto,Precio =@Precio
 where Id_factura = @Id_factura
 end

 Exec updateDetalle 3,2,5,50,'30'

 Select * from Detalle

 /************Eliminar*****************/

 Create procedure delDetalle
 @Id_factura int, 
 @Num_factura int ,
 @Id_Producto int,
 @Cantidad int ,
 @Precio Money
 as
 begin
 delete from Detalle
 where Id_factura=@Id_factura
 end

 exec delDetalle 7,7,11, 20,'10'

 select * from Detalle
