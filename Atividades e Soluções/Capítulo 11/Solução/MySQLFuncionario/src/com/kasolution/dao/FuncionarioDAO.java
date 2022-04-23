/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kasolution.domain.Funcionario;
import com.kasolution.util.Parametrizador;

/**
 *
 * @author 130955800299
 */
public class FuncionarioDAO implements DAO<Funcionario> {

	private static final String SQL_INSERT = "INSERT INTO FUNCIONARIO (NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO)"
			+ " VALUES (?,?,?,?,?,?)";
	private static final String SQL_UPDATE = "UPDATE FUNCIONARIO SET " + " NOME = ?, " + " SEXO = ?, " + " IDADE = ?, "
			+ " CIDADE = ?, " + " ESTADO = ?, " + " SALARIO = ? " + " WHERE CODIGO = ? ";
	private static final String SQL_DELETE = "DELETE FROM FUNCIONARIO WHERE CODIGO = ?";
	private static final String SQL_QUERY_ALL = "SELECT CODIGO, NOME, SEXO, IDADE, CIDADE,"
			+ " ESTADO, SALARIO FROM FUNCIONARIO";
	private static final String SQL_QUERY_ONE = "SELECT CODIGO, NOME, SEXO, IDADE, CIDADE,"
			+ " ESTADO, SALARIO FROM FUNCIONARIO WHERE CODIGO = ?";

	private Connection con;

	public FuncionarioDAO() throws DAOException {
		Parametrizador p = Parametrizador.getInstance();
		String url = p.getProp("url");
		String username = p.getProp("usuario");
		String password = p.getProp("senha");

		//abrir conexão com o BD
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			throw new DAOException("Impossível obter conexão com o BD: " + e.getMessage());
		}
		
	}// fim metodo

	@Override
	public void salvar(Funcionario f) throws DAOException {
		//NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO
		try (PreparedStatement stmt = con.prepareStatement(SQL_INSERT)) {
			stmt.setString(1, f.getNome());
			stmt.setString(2, String.valueOf(f.getSexo()));
			stmt.setInt(3, f.getIdade());
			stmt.setString(4, f.getCidade());
			stmt.setString(5, f.getEstado());
			stmt.setDouble(6, f.getSalario());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Erro ao inserir funcionário: " + e.getMessage());
		}
	}// fim salvar

	@Override
	public void atualizar(Funcionario f) throws DAOException {
		//NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO, CODIGO
		try (PreparedStatement stmt = con.prepareStatement(SQL_UPDATE)) {
			stmt.setString(1, f.getNome());
			stmt.setString(2, String.valueOf(f.getSexo()));
			stmt.setInt(3, f.getIdade());
			stmt.setString(4, f.getCidade());
			stmt.setString(5, f.getEstado());
			stmt.setDouble(6, f.getSalario());
			stmt.setInt(7, f.getCodigo());
			if (stmt.executeUpdate() != 1) {
				throw new DAOException("Erro ao atualizar! Resultado diferente de 1.");
			}
		} catch (SQLException e) {
			throw new DAOException("Erro ao atualizar funcionario: " + e.getMessage());
		}
	}// fim atualizar

	@Override
	public void excluir(Funcionario f) throws DAOException {
		//CODIGO
		try (PreparedStatement stmt = con.prepareStatement(SQL_DELETE)) {
			stmt.setInt(1, f.getCodigo());
			if (stmt.executeUpdate() != 1) {
				throw new DAOException("Erro ao excluir! Resultado diferente de 1.");
			}
		} catch (SQLException e) {
			throw new DAOException("Erro ao excluir funcionario: " + e.getMessage());
		}
	}// fim excluir

	@Override
	public Funcionario buscarId(int id) throws DAOException {
		//CODIGO
		Funcionario funcionario = null;
		try (PreparedStatement stmt = con.prepareStatement(SQL_QUERY_ONE)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					funcionario = ormFuncionario(rs);
				}
			}
		} catch (SQLException e) {
			throw new DAOException("Erro ao burcar funcionario por ID: " + e.getMessage());
		}
		return funcionario;
	}// fim buscarId

	@Override
	public List<Funcionario> buscarTodos() throws DAOException {
		List<Funcionario> funcionarios = new ArrayList<>();
		try (PreparedStatement stmt = con.prepareStatement(SQL_QUERY_ALL)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					funcionarios.add(ormFuncionario(rs));
				}
			}
		} catch (SQLException e) {
			throw new DAOException("Erro ao burcar funcionario por ID: " + e.getMessage());
		}
		return funcionarios;
	}// fim buscarTodos

	@Override
	public void close() throws DAOException {
		//fechar conexão com o BD
		try {
			con.close();
		} catch (SQLException e) {
			throw new DAOException("Erro ao fechar conexão: " + e.getMessage());
		}
	}

	private Funcionario ormFuncionario(ResultSet rs) throws SQLException {
		return new Funcionario.Builder()
				.codigo(rs.getInt("CODIGO"))
				.nome(rs.getString("NOME"))
				.sexo(rs.getString("SEXO").charAt(0))
				.idade(rs.getInt("IDADE"))
				.cidade(rs.getString("CIDADE"))
				.estado(rs.getString("ESTADO"))
				.salario(rs.getDouble("SALARIO")).build();
	}
}
