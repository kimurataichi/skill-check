package q005;
/**
 * 作業時間管理クラス
 * 自由に修正してかまいません
 */
public class WorkData {
    /** 作業時間(分) */
    private int workTime;
	private String number;
	private String department;
	private String position;
	private String pCode;

    public WorkData(String number, String department, String position, String pCode, int workTime) {
    	this.number = number;
    	this.department = department;
    	this.position = position;
    	this.pCode = pCode;
    	this.workTime = workTime;
    }

	public String getNumber() {
		return number;
	}

	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public String getpCode() {
		return pCode;
	}

	public int getWorkTime() {
		return workTime;
	}

}
