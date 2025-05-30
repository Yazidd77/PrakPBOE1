/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 *
 * @author shopi
 */

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
      // Membuat objek mahasiswa dari ResultSet
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setName(rs.getString("name"));
        return mhs;
    }

    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO person (id, name) VALUES (?, ?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nim=?, nama=?, prodi=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    // Delete data mahasiswa
    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    // Ambil mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }
        return list;
    }
}