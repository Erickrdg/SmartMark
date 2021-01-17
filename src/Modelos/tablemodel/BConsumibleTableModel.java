/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.tablemodel;

import Modelos.BodegaConsumibles;
import java.lang.reflect.Field;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author FireX
 */
public class BConsumibleTableModel extends AbstractTableModel{
    private Object columnNames[];
    private Object rowData[][];
    
    private void initColumnames(){
        Field fields[] = BodegaConsumibles.class.getDeclaredFields();
        columnNames = new String[fields.length];
        int c=0;
        for (Field field:fields){
            columnNames[c]=field.getName();
            c++;
        }
    }
    public BConsumibleTableModel(){
        initColumnames();
    }
    public BConsumibleTableModel(BodegaConsumibles[] bodegaconsumibles){
        initColumnames();
        rowData = new Object[bodegaconsumibles.length][columnNames.length];
        int c=0;
        for(BodegaConsumibles bodegaconsumible:bodegaconsumibles){
            rowData[c]=new Object[]{
                                    bodegaconsumible.getCodigosapbod(),
                                    bodegaconsumible.getFabricante(),
                                    bodegaconsumible.getTipo(),
                                    bodegaconsumible.getDescripcion()
                                };
            c++;
        }
        setDataModel(rowData);{
        
    }
    }
    public void setDataModel(Object[][] data){
         rowData = data;
    }
    public TableModel getModel(){
      TableModel model = new DefaultTableModel(
            rowData,
            columnNames
        );
        return model;
    }
    
    @Override
    public int getRowCount() {
        return rowData.length;
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rowData[rowIndex][columnIndex];
    }
    public void saveTableData(){
        
    }
}
