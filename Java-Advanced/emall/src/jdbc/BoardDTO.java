package jdbc;

public class BoardDTO {
	private String board_num; // 상품아이디
	private String user_id; // 상품 이름
	private String board_title; // 상품 가격
	private String board_content; // 상품 설명
	private String board_date; // 상품 제조사
	public String getBoard_num() {
		return board_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getBoard_title() {
		return board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public String getBoard_date() {
		return board_date;
	}
	public BoardDTO(String board_num, String user_id, String board_title, String board_content, String board_date) {
		super();
		this.board_num = board_num;
		this.user_id = user_id;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
	}
}
