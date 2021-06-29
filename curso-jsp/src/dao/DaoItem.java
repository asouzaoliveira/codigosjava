package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.BeanItem;
import connection.SingleConnection;

public class DaoItem {

	public Connection connection;

	public DaoItem() {

		connection = SingleConnection.getConnection();
	}

	public void salvarItem(BeanItem item) {
		try {
			String sql = "insert into produtos (produto,quantidade,valor) values(?, ?, ?)";

			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, item.getProduto());
			insert.setDouble(2, item.getQuantidade());
			insert.setDouble(3, item.getValor());
			insert.execute();
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public List<BeanItem> listaItens() throws SQLException {

		List<BeanItem> listaItens = new ArrayList<BeanItem>();
		String sql = "select * from produtos";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {

			BeanItem beanItem = new BeanItem();

			beanItem.setId(resultSet.getLong("id"));
			beanItem.setProduto(resultSet.getString("produto"));
			beanItem.setQuantidade(resultSet.getDouble("quantidade"));
			beanItem.setValor(resultSet.getDouble("valor"));

			listaItens.add(beanItem);
		}
		return listaItens;
	}

	public void delete(String id) {
		try {
			String sql = "delete from produtos where id = ' " + id + "'";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();

			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}
	}

	public BeanItem consultar(String id) {
		try {
			String sql = "select * from produtos where id = '" + id + "'";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				BeanItem beanItem = new BeanItem();

				beanItem.setId(resultSet.getLong("id"));
				beanItem.setProduto(resultSet.getString("produto"));
				beanItem.setQuantidade(resultSet.getDouble("quantidade"));
				beanItem.setValor(resultSet.getDouble("valor"));
				return beanItem;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	
	public void atualizarProduto(BeanItem item) {
		try {
			String sql = "update produtos set produto = ? , quantidade = ? , valor = ? where id = " + item.getId();

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item.getProduto());
			preparedStatement.setDouble(2, item.getQuantidade());
			preparedStatement.setDouble(3, item.getValor());
			preparedStatement.executeUpdate();

			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}

	}

}
