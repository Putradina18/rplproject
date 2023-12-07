package datapelanggan;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPelanggan {
    private ArrayList<pelangganbaru> ArrayData;
    private DefaultTableModel tablelist;

    public ControllerPelanggan() {
        ArrayData = new ArrayList<>();
    }

    public void InsertData(String nama, String jenis, int jumlah) {
        pelangganbaru pelanggan = new pelangganbaru(nama, jenis, jumlah);
        ArrayData.add(pelanggan);
    }

    public void deleteData(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < ArrayData.size()) {
            ArrayData.remove(rowIndex);
        }
    }

    public DefaultTableModel showData() {
        String[] kolom = {"Nama", "Jenis Sepatu", "Jumlah"};
        Object[][] objData = new Object[ArrayData.size()][3];
        int i = 0;

        for (pelangganbaru n : ArrayData) {
            Object[] arrData = {n.getNama(), n.getJenis(), n.getUkuran()};
            objData[i] = arrData;
            i++;
        }

        tablelist = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };

        return tablelist;
    }
}
