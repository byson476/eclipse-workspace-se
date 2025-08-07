package chap09;

public class Sample07 {
	public static void main(String[] args) {
		Database db1 = new OracleDatabase();
		db1.getConnection();
		System.out.println(db1.getDbInfo());
		
		Database db2 = new MsDatabase();
		db2.getConnection();
		System.out.println(db2.getDbInfo());
	}
}
interface Database{
	public void getConnection();
	public String getDbInfo();
}
class OracleDatabase implements Database{
	boolean conn = false;
	public void getConnection() {
		this.conn = true;
	}
	public String getDbInfo(){
		String ret = "";
		if(conn) 
			ret = "오라클에 접속되었습니다";
		else
			ret = "오라클에 접속되지 않았습니다";
		return ret;
	}
}

class MsDatabase implements Database{
	boolean conn = false;
	public void getConnection() {
		this.conn = false;
	}
	public String getDbInfo(){
		String ret = "";
		if(conn) 
			ret = "MS-SQL에 접속되었습니다";
		else
			ret = "MS-SQL에 접속되지 않았습니다";
		return ret;
	}
}
