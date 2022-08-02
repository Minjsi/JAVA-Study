package jdbc;

public class MemoDTO {
	private String mid;
	private String uid;
	private String memo;
	private String done;
	private String mdate;
	public String getMid() {
		return mid;
	}
	public String getUid() {
		return uid;
	}
	public String getMemo() {
		return memo;
	}
	public String getDone() {
		return done;
	}
	public String getMdate() {
		return mdate;
	}
	public MemoDTO(String mid, String uid, String memo, String done, String mdate) {
		super();
		this.mid = mid;
		this.uid = uid;
		this.memo = memo;
		this.done = done;
		this.mdate = mdate;
	}
}
