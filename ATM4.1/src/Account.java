
public class Account {
	//��Ա����
		private String ID;//�˻���
		private String name;//�û���
		private double balance;//���
		private String password;//����
		
		//���幹�캯��
		Account (String ID,String name,double balance,String password){
			this.ID=ID;
			this.name=name;
			this.balance=balance;
			this.password=password;
		}
		Account(){
			
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String toString(){
			return "ID:"+this.ID+" name:"+this.name+" balance:"+this.balance;
		}
}