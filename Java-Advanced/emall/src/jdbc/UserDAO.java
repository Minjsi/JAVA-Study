package jdbc;
import jdbc.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.naming.NamingException;

import util.ConnectionPool;

public class UserDAO {

	public ArrayList<UserDTO> getList() throws NamingException, SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM product";

			conn = ConnectionPool.get();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<UserDTO> users = new ArrayList<UserDTO>();

			while (rs.next()) {
				users.add(new UserDTO(rs.getString("uid"), rs.getString("upw"), rs.getString("uname"),
						rs.getString("ugender"), rs.getString("ubirth"), rs.getString("uemail"), rs.getString("uphone"), rs.getString("uadrr"), rs.getString("uregiday")));
			}
			return users;

		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}

	}

public int insert(String uid, String upw, String uname, String ugender, String ubirth, String uemail,String uphone, String uaddr) throws NamingException, SQLException {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		String sql = "INSERT INTO user VALUES (?,?,?,?,?,?,?,?,?)";
		conn = ConnectionPool.get();
		pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			pstmt.setString(2, upw);
			pstmt.setString(3, uname);
			pstmt.setString(4, ugender);
			pstmt.setString(5, ubirth);
			pstmt.setString(6, uemail);
			pstmt.setString(7, uphone);
			pstmt.setString(8, uaddr);
			pstmt.setString(9, LocalDate.now().toString());
		int result = pstmt.executeUpdate();
		return result;
	}finally {
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
}
public UserDTO getDetail(String pid) throws NamingException, SQLException{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String sql = "SELECT * FROM user WHERE uid=?";
		
		conn = ConnectionPool.get();
		pstmt = conn.prepareStatement(sql);
		pstmt.setNString(1, pid);
		rs = pstmt.executeQuery();
		rs.next();
		
		String uid= rs.getString(1);
		String upw= rs.getString(2);
		String uname = rs.getString(3);
		String ugender = rs.getString(4);
		String ubirth = rs.getString(5);
		String uemail = rs.getString(6);
		String uphone = rs.getString(7);
		String uaddr = rs.getString(8);
		String uregiday = rs.getString(9);
		
		UserDTO user = new UserDTO(uid, upw, uname, ugender, ubirth, uemail, uphone, uaddr, uregiday); // 객체 생성
		
		return user;
	} finally {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}

}
public int login(String uid, String upw)
		   throws NamingException, SQLException {   
		      
		      Connection conn = null;
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		   
		      try {
		         String sql = "SELECT uid, upw FROM user where uid = ?";
		         
		         conn = ConnectionPool.get();
		         pstmt = conn.prepareStatement(sql);
		               pstmt.setString(1,uid);
		         rs = pstmt.executeQuery();
		         
		         if (!rs.next()) return 1;                        //회원이 아닌 경우
		         if (!upw.equals(rs.getString("upw"))) return 2;  //암호 틀린 경우
		         
		         return 0;
		      } finally {
		         if(rs != null) rs.close();
		         if(pstmt != null) pstmt.close();
		         if(conn != null) conn.close();
}
}
}