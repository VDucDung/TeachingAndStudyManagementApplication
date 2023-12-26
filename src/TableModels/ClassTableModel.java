package TableModels;

import BaseClasses.SubjectClass;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ClassTableModel extends AbstractTableModel {

    //properties
    //Khai báo mảng chứa các tiêu đề của các cột trong bảng
    private String header[] = {"STT","Mã lớp", "Tên lớp", "Địa điểm", "Thời gian"};
    //Khai báo mảng chứa kiểu của dữ liệu trong từng cột của bảng
    private Class classes[] = {Integer.class, String.class, String.class, String.class, String.class};
    //Khai báo một cấu trúc dữ liệu làm NGUỒN dữ liệu cho bảng
    private ArrayList<SubjectClass> clList = new ArrayList<>();

    //constructors
    public ClassTableModel(ArrayList<SubjectClass> clList) {
        this.clList = clList;
    }

    @Override
    public int getRowCount() {
        return clList.size();
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
                return clList.get(rowIndex).getClID();
            case 2:
                return clList.get(rowIndex).getClName();
            case 3:
                return clList.get(rowIndex).getClPlace();
            case 4:
                return clList.get(rowIndex).getClTime();
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
