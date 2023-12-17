package Actors;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class GroupTableModel extends AbstractTableModel {

    //properties
    //Khai báo và khởi tạo mảng chứa tiêu đề các cột của bảng
    private String header[] = {"Tên nhóm", "Số vị trí trong nhóm", "Đánh giá của giảng viên"};
    //Khai báo và khởi tạo mảng chứa kiểu của dữ liệu trong từng cột tương ứng
    private Class classes[] = {String.class, Integer.class, String.class};
    //Khai báo và khởi tạo NGUỒN dữ liệu cho bảng
    private ArrayList<Group> grList = new ArrayList<>();

    //constructors
    public GroupTableModel(ArrayList<Group> grList) {
        this.grList = grList;
    }

    @Override
    public int getRowCount() {
        return grList.size();
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
                return grList.get(rowIndex).getGrID();
            case 1:
                return grList.get(rowIndex).getGrSlotNumber();
            case 2:
                return grList.get(rowIndex).getGrEvaluation();
        }

        return null;
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
