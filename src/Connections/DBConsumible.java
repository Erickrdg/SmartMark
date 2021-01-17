/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

import Modelos.BodegaConsumibles;
import SmartConexion.SQLServerConnection;
import SmartConexion.Util;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Types;
import jdk.jfr.Category;
import util.Result;
/**
 *
 * @author FireX
 */
public class DBConsumible {
    
    private SQLServerConnection dbConn;
    private BodegaConsumibles consumible;
    public DBConsumible(){
            super();
    }
    public DBConsumible (SQLServerConnection dbConn){
        this.dbConn = dbConn;
    }
    public DBConsumible(SQLServerConnection dbConn, BodegaConsumibles consumible){
        this.dbConn = dbConn;
        this.consumible = consumible;
    }
    public SQLServerConnection getDbconn(){
        return dbConn;
    }
    public void setDbConn(SQLServerConnection dbConn){
        this.dbConn = dbConn;
    }
    public BodegaConsumibles getConsumible(){
        return consumible;
    }
    public void setConsumible(BodegaConsumibles consumible){
        this.consumible = consumible;
        
    }
    public BodegaConsumibles[] getConsumibles() throws SQLException, ClassNotFoundException{
        BodegaConsumibles[] consumibles;
        try{
            dbConn.Open(1);
            Statement Command = dbConn.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = Command.executeQuery("EXEC Production.uspGetConsumibles ");
            consumibles = new BodegaConsumibles[Util.getRowCount(rs)];
            int index = 0;
            while(rs.next()){
                
                BodegaConsumibles c = new BodegaConsumibles();
                c.setCodigosapbod(rs.getString("ProductCategoryID"));
                c.setFabricante(rs.getString("Fabricante"));
                c.setTipo(rs.getString("Tipo"));
                c.setDescripcion(rs.getString("Descripcion"));
                
                consumibles[index] = c;
                index++;
            }
            dbConn.CloseConnection();
        }
        catch(SQLException e){
            throw e;
        }
        return consumibles;
        
            
        }
        //Desde aqui copie
        
         public BodegaConsumibles getBodegaConsumibles(String Codigosapbod) throws SQLException, ClassNotFoundException{
        BodegaConsumibles c = new BodegaConsumibles();

        try{
            dbConn.Open(1);
            CallableStatement Command = dbConn.connection.prepareCall("{call Production.uspGetCategories(?)}");
            Command.setInt("ProductCategoryID", CategoryID);
            ResultSet rs = Command.executeQuery();
            if(rs.next()){
                c.setCodigosapbod(rs.getString("ProductCategoryID"));
                c.setFabricante(rs.getString("Name"));
                c.setTipo(rs.getString("rowguid"));
                c.setDescripcion(rs.getString("ModifiedDate"));
            }
            else{
                throw new SQLException("No se encontró una categoría con el ID indicado");
            }
            dbConn.CloseConnection();
        }
        catch(SQLException e){
            throw e;
        }
        return c;
    }

    public BodegaConsumibles getBodegaConsumibles(String Codigosapbod, String Fabricante) throws SQLException{
        BodegaConsumibles c = new BodegaConsumibles();
        try{
            dbConn.Connect();
            CallableStatement Command = dbConn.connection.prepareCall("{call Production.uspGetCategories(?,?)}");
            Command.setInt("ProductCategoryID", CategoryID);
            Command.setString("Name", CategoryName);
            ResultSet rs = Command.executeQuery();
            if(rs.next()){
               c.setCodigosapbod(rs.getString("ProductCategoryID"));
                c.setFabricante(rs.getString("Name"));
                c.setTipo(rs.getString("rowguid"));
                c.setDescripcion(rs.getString("ModifiedDate"));
            }
            else{
                throw new SQLException("No se encontró una categoría con los parámetros indicados indicado");
            }          
        }
        catch(SQLException e){
            throw e;
        }
        return c;
    }
    public Result insert(Category category)throws ClassNotFoundException, SQLException {
        Result r=new Result();
        try
        {  
            dbConn.Open(1);
            CallableStatement Command=dbConn.connection.prepareCall("{call Production.usp_AddProductCategory(?,?,?,?)}");
            Command.setString("Name",category.getName());
            Command.registerOutParameter("ProductCategoryID",Types.INTEGER);
            Command.registerOutParameter("RETURN",Types.TINYINT);
            Command.registerOutParameter("RETURN_MESSAGE",Types.NVARCHAR);
            Command.execute();
            r.setId(Command.getInt("ProductCategoryID"));
            r.setMessage(Command.getString("RETURN_MESSAGE"));
            r.setOutcome((Command.getInt("RETURN")==0));
        }
        catch(SQLException e)
        {  
           throw e;
        }
        return r;
    }
    public Result update(Category category)throws ClassNotFoundException, SQLException {
        Result r=new Result();
        try
        {  
            dbConn.Open(1);
            CallableStatement Command=dbConn.connection.prepareCall("{call Production.usp_UpdateProductCategory(?,?,?,?)}");
            Command.setInt("ProductCategoryID", category.getProductCategoryID());
            Command.setString("Name",category.getName());            
            Command.registerOutParameter("RETURN",Types.TINYINT);
            Command.registerOutParameter("RETURN_MESSAGE",Types.NVARCHAR);
            Command.execute();
            r.setMessage(Command.getString("RETURN_MESSAGE"));
            r.setOutcome((Command.getInt("RETURN")==0));
        }
        catch(SQLException e)
        {  
           throw e;
        }
        return r;
    }
    }


