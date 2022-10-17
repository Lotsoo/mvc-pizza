/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import view.Kasir;
import java.sql.*;
/**
 *
 * @author lotso
 */
public interface Controller {
    public void Simpan(Kasir kasir)throws SQLException;
    public void Ubah(Kasir kasir)throws SQLException;
    public void Hapus(Kasir kasir)throws SQLException;
    public void Batal(Kasir kasir)throws SQLException;
    public void KlikTable(Kasir kasir)throws SQLException;
    public void Tampil(Kasir kasir)throws SQLException;
}
