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
package datalayer;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author William Sanchez
 */
public class Util {
    public static int getRowCount(ResultSet rs) throws SQLException{
        int rowcount = 0;
        if (rs.last()) {
          rowcount = rs.getRow();
          rs.beforeFirst(); 
        }
        return rowcount;
    }
}
