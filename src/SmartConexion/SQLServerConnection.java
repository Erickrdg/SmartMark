/*
 * Licencia GPL.
 * Desarrollado por: William Sánchez
 * El software se proporciona "TAL CUAL", sin garantía de ningún tipo,
 * expresa o implícita, incluyendo pero no limitado a las garantías de
 * comerciabilidad y adecuación para un particular son rechazadas.
 * En ningún caso el autor será responsable por cualquier reclamo,
 * daño u otra responsabilidad, ya sea en una acción de contrato,
 * agravio o cualquier otro motivo, de o en relación con el software
 * o el uso u otros tratos en el software.
 * 
 */
package SmartConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.*;
/**
 *
 * @author William Sanchez
 */
public class SQLServerConnection {
    public Connection connection = null;
    private String odbcBD;
    private String serverName;
    private int portNumber;
    private String instanceName;
    private boolean integratedSecurity;
    
    private String databaseName;
    private String password;
    private String user;
    private boolean connectionFree = true;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getOdbcBD() {
        return odbcBD;
    }

    public void setOdbcBD(String odbcBD) {
        this.odbcBD = odbcBD;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public boolean isIntegratedSecurity() {
        return integratedSecurity;
    }

    public void setIntegratedSecurity(boolean integratedSecurity) {
        this.integratedSecurity = integratedSecurity;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isConnectionFree() {
        return connectionFree;
    }

    public void setConnectionFree(boolean connectionFree) {
        this.connectionFree = connectionFree;
    }

    public SQLServerConnection(String serverName, int portNumber, String databaseName, String password, String user) {
        this.serverName = serverName;
        this.portNumber = portNumber;
        this.databaseName = databaseName;
        this.password = password;
        this.user = user;
    }
    
    public SQLServerConnection() throws ClassNotFoundException{
        super();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(Exception e){
            throw e;
        }
    }
    public SQLServerConnection(String driverName) throws ClassNotFoundException{
        super();
        try{
            Class.forName(driverName);
        }catch(Exception e){
            throw e;
        }
    }
    
    public boolean Connect() throws SQLException{
        boolean ConnectionResult = false;
        try{
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setIntegratedSecurity(integratedSecurity);
            ds.setServerName(serverName);
            ds.setPortNumber(portNumber);
            ds.setDatabaseName(databaseName);
            ds.setInstanceName(instanceName);
            ds.setUser(user);
            ds.setPassword(password);
            connection = ds.getConnection();
            ConnectionResult = true;
        }
        catch(SQLException e){
            throw e;
        }
        return ConnectionResult;
    }
    
    public boolean Connect(String srvname,int port, String database,String login,String pswd)throws ClassNotFoundException, SQLException {
        boolean ConnectionResult=false;
        try {
            String ConnectionString = "jdbc:sqlserver://" + srvname + ":" + String.valueOf(port) + ";" +
                                "databaseName="+ database +";" +
                                "user="+ login + ";" +
                                "password=" + pswd;
            connection = DriverManager.getConnection(ConnectionString); 
            serverName=srvname;
            portNumber=port;
            databaseName=database;
            user=login;
            password=pswd;
            ConnectionResult=true;
        }
        catch( Exception e ) {
            throw e;
        }
        return ConnectionResult;
    }
    public boolean Connect(String srvname, String instance,int port, String database,String login,String pswd)throws ClassNotFoundException, SQLException {
        boolean ConnectionResult=false;
        try {
            String ConnectionString = "jdbc:sqlserver://" + srvname 
                                + ":" + String.valueOf(port) + ";"
                                + (instance.isEmpty()?"":"instanceName="+instance) + ";" +
                                "databaseName="+ database +";" +
                                "user="+ login + ";" +
                                "password=" + pswd;
//            System.out.println(ConnectionString);
            connection = DriverManager.getConnection(ConnectionString); 
            serverName=srvname;
            portNumber=port;
            instanceName=instance;
            databaseName=database;
            user=login;
            password=pswd;
            ConnectionResult=true;
        }
        catch( Exception e ) {
            throw e;
        }
        return ConnectionResult;
    }
    public void Open(int type_connection)throws ClassNotFoundException, SQLException {
        switch(type_connection){
            case 0:
                OpenWithUrl();
                break;
            case 1:
                OpenWithDataSource();
                break;
            default:
                OpenWithDataSource();
                break;
        }
    }
    protected void OpenWithUrl()throws ClassNotFoundException, SQLException {
       if(connection.isClosed()){
            try {
                    String ConnectionString = "jdbc:sqlserver://" + serverName 
                        + ":" + String.valueOf(portNumber) + ";"
                        + (instanceName.isEmpty()?"":"instanceName="+instanceName) + ";" +
                        "databaseName="+ databaseName +";" +
                        "user="+ user + ";" +
                        "password=" + password;
                connection = DriverManager.getConnection(ConnectionString);                
            }
            catch( Exception e ) {
                throw e;
            }
        }    
    }
    protected void OpenWithDataSource()throws ClassNotFoundException, SQLException {
       if(connection.isClosed()){
            try {
                SQLServerDataSource ds = new SQLServerDataSource();
                ds.setIntegratedSecurity(this.integratedSecurity);
                ds.setServerName(this.serverName);
                ds.setPortNumber(this.portNumber); 
                ds.setDatabaseName(this.databaseName);
                if (!this.integratedSecurity){
                    ds.setPassword(this.password);
                    ds.setUser(this.user);
                }
                connection = ds.getConnection();                                
            }
            catch( Exception e ) {
                throw e;
            }
        }    
    }

    protected synchronized void releaseConnection () {
        while (this.connectionFree == true) {
            try {
                wait ();
            }
            catch (InterruptedException e) {
            }
        }
        this.connectionFree = true;
        notify ();
    }
    public void CloseConnection() throws SQLException
    {
        try{ 
            connection.close(); 
        }
        catch(SQLException e){
                throw e;		
        }
    }
}
