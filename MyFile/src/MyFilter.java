import java.io.File;
import java.io.FilenameFilter;

public class MyFilter implements FilenameFilter {

	private String type;

	public MyFilter(String type) {
		this.type = type;
	}

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(type)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("dir");
		MyFilter filter = new MyFilter(".xlsx");
		String[] files = dir.list(filter);
		for (String a : files) {
			System.out.println(a);
		}

	}

}
