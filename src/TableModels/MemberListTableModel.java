package TableModels;

import BaseClasses.Student;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class MemberListTableModel extends AbstractTableModel {

    //properties
    //Khai báo mảng chứa các tiêu đề của các cột trong bảng
    private String header[] = {"Mã sinh viên", "Họ tên"};
    //Khai báo mảng chứa kiểu của dữ liệu trong từng cột của bảng
    private Class classes[] = {String.class, String.class};
    //Khai báo một cấu trúc dữ liệu làm NGUỒN dữ liệu cho bảng
    private ArrayList<Student> stList = new ArrayList<>();

   //constructors
    public MemberListTableModel(ArrayList<Student> stList) {
        this.stList = stList;
    }

    @Override
    public int getRowCount() {
        return stList.size();
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
                return stList.get(rowIndex).getStID();
            case 1:
                return stList.get(rowIndex).getStName();
            default:
                return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
//return super.getColumnClass(columnIndex); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
//return super.getColumnName(column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
