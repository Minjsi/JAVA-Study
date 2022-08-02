package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class OrderDAO {

	public ArrayList<OrderDTO> getlist(String status) throws NamingException, SQLException {// 구매 전체 목록 보여줌
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM orders where ostatus = ?";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, status);
			rs = pstmt.executeQuery();

			// 가져옴 
			ArrayList<OrderDTO> orders = new ArrayList<OrderDTO>();

			while (rs.next()) {
				orders.add(new OrderDTO(rs.getString("oid"), rs.getString("opid"), rs.getString("ouid"), rs.getString("opname"), rs.getString("oprice"), rs.getString("ostatus"), rs.getString("odate"), rs.getString("ograde"), rs.getString("ocomm")));
			}

			return orders;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

	// 구매 시작 매서드 status 1 고객
	public int insert() {

		return 1;
	}

	// 입금 확인 매서드 status 2 고객
	public int confrim() {

		return 1;
	}

	// 발송 매서드 status 3 판매자
	public int delivery() {

		return 1;
	}

	// 리뷰 status 4 고객
	public int review() {

		return 1;
	}

}