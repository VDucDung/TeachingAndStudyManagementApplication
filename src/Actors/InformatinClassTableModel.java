package Actors;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DUC DUNG
 */
public class InformatinClassTableModel extends AbstractTableModel {

    //properties
    //Khai báo mảng chứa các tiêu đề của các cột trong bảng
    private String header[] = {"STT","Mã sinh viên", "Tên sinh viên", "Giới tính", "Ngành học", "Địa chỉ", "Số điện thoại"};
    //Khai báo mảng chứa kiểu của dữ liệu trong từng cột của bảng
    private Class infoClasses[] = {Integer.class,String.class, String.class, String.class, String.class, String.class, String.class};
    //Khai báo một cấu trúc dữ liệu làm NGUỒN dữ liệu cho bảng
    private ArrayList<Student> infoClList = new ArrayList<>();

    //constructors
    public InformatinClassTableModel(ArrayList<Student> infoClList) {
        this.infoClList = infoClList;
    }

    @Override
    public int getRowCount() {
        return infoClList.size();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return header.length;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
             case 0:
                return rowIndex + 1;
            case 1:
                return infoClList.get(rowIndex).getStID();
            case 2:
                return infoClList.get(rowIndex).getStName();
            case 3:
                return infoClList.get(rowIndex).getStGender();
            case 4:
                return infoClList.get(rowIndex).getStDepartment();
            case 5:
                return infoClList.get(rowIndex).getStAddress();
            case 6:
                return infoClList.get(rowIndex).getStPhoneNumber();
            default:
                return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return infoClasses[columnIndex];
//return super.getColumnClass(columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
//return super.getColumnName(column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
