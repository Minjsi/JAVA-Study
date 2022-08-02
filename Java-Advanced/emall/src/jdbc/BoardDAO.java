package jdbc;
import jdbc.BoardDTO;
import java.sql.*;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class BoardDAO {

	public ArrayList<BoardDTO> getList() throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM board";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<BoardDTO> boards = new ArrayList<BoardDTO>();

			while (rs.next()) {
				boards.add(new BoardDTO(rs.getString("board_num"), rs.getString("user_id"), rs.getString("board_title"),
						rs.getString("board_content"), rs.getString("board_date")));
			}
			return boards;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

public BoardDTO getDetail(String board_num) throws NamingException, SQLException{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String sql = "SELECT * FROM board WHERE board_num=?";
		
		conn = ConnectionPool.get();
		pstmt = conn.prepareStatement(sql);
		pstmt.setNString(1, board_num);
		rs = pstmt.executeQuery();
		rs.next();
		
		String num = rs.getString(1);
		String user_id = rs.getString(2);
		String board_title = rs.getString(3);
		String board_content = rs.getString(4);
		String board_date = rs.getString(5);
		
		BoardDTO board = new BoardDTO(num, user_id, board_title, board_content, board_date); // 객체 생성
		
		return board;
		
	} finally {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
}

}