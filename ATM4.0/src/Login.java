import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	private ArrayList<Account> list;
	private String currentId;
	private String currentPassword;
	private Account currentAccount;
	Scanner input = new Scanner(System.in);

	Login() {
		
	}
	
	Login(ArrayList<Account> list){
		this.list=list;
	}

	public Account enter() {

		int i = 0;
		System.out.println("*****��ӭ�����ʼ����У�����ATM��С��");
		System.out.println("�����������˺�");
		currentId = input.next();
		  if((new Query().query(currentId))!=null){
			Out: for (i = 1; i <= 3; i++) {
				System.out.println("����������");
				currentPassword = input.next();
				for (Account a : list) {
					if (currentId.equals(a.getID()) && currentPassword.equals(a.getPassword())) {
						currentAccount = a;
						break Out;
					}
				}
			}
			if (i == 4)
				System.out.println("***�����������������Ŀ��ѱ�����***");
			else{
				System.out.println("hello "+this.currentAccount.getName());
				System.out.println("***��½�ɹ����ʼһ�ӭ��***");
			}
		}
			return currentAccount;
		}

	public ArrayList<Account> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}

}