package jdbc_Method_divide_test;

public class DeptDTO {
		int deptno;
		String dname;
		String loc;
		public DeptDTO() {
				// TODO Auto-generated constructor stub
		}
		public DeptDTO(int deptno, String dname, String loc) {
				super();
				this.deptno = deptno;
				this.dname = dname;
				this.loc = loc;
		}
		
		public int getDeptno() {
				return deptno;
		}
		public void setDeptno(int deptno) {
				this.deptno = deptno;
		}
		public String getDname() {
				return dname;
		}
		public void setDname(String dname) {
				this.dname = dname;
		}
		public String getLoc() {
				return loc;
		}
		public void setLoc(String loc) {
				this.loc = loc;
		}
		@Override
		public String toString() {
				return "Dept: [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
		}
		
		
		
}
