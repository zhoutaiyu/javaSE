import java.util.Scanner;

//ͨ��ATM����ϵ���ݿ���Ӱ���˻���Ϣ
public class ATMServer {
	private Account CurrentAccount = null;
	private Scanner input = new Scanner(System.in);
	private String choice = "Y";
	private Login l;
	private Database database = new Database();

	// �����û���Ϣ
	public ATMServer() {

	}

	public void work() {
		while(true){
		login();
		meue();
		}
	}

	public void login() {
		while (true) {
			l = new Login(database.getList());
			CurrentAccount = l.enter();
			if (CurrentAccount != null)
				break;
		}
	}

	public void meue() {
		while (choice.equals("Y")) {
			Clear.clear();
			prepromot();
			switch (input.nextInt()) {
			// ��ѯ������Ϣ
			case 1:
				System.out.println(CurrentAccount.toString());
				break;
			// ���
			case 2:
				new Deposit(this.CurrentAccount).deposit();
				break;
			// ȡ��
			case 3:
				new WithDraw(this.CurrentAccount).withDraw();
				break;
			// �����޸�
			case 4:
				new ModPassword(this.CurrentAccount).modify();
				break;
			// ת��
			case 5:
				new AtoB(this.CurrentAccount).aTOb();
				// System.out.println(this.CurrentAccount);��֤�Ƿ��������
				// System.out.println(a);
				break;
			case 6:
				System.out.println("лл����ʹ�ã��ټ�");
				choice="0";
				break;
			}
			if(choice.equals("0")){
				Clear.clear();
				break;
			}
			else
			promot();
		}
	}

	public void prepromot(){
		System.out.println("***1.��ѯ������Ϣ   ***");
		System.out.println("***2.   ���          ***");
		System.out.println("***3.   ȡ��          ***");
		System.out.println("***4.  �޸�����     ***");
		System.out.println("***5.   ת��          ***");
		System.out.println("***6.   �˳�          ***");
		System.out.println("������������в������");
	}
	// ������ʾ
	public void promot() {
		System.out.println("�Ƿ�������й��ܲ�����");
		System.out.println("�ǵĻ��밴Y,if not,�˳��밴������");
		String t = input.next();
		if (t.equals("Y") != true) {
			this.choice = "";
			System.out.println("�ټ���������������С��");
			Clear.clear();
		}
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

}