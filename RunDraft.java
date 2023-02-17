import java.util.ArrayList;
import java.util.List;

import mypack.Student;

public class RunDraft {
	public static void main(String[] args) {
		Student studentA = new Student();
		studentA.setId("70DCHT21049");
		studentA.setName("Dao Xuan Manh");
		studentA.setAge(23);
		studentA.setHeight(1.7f);

		Student studentB = new Student();
		studentB.setId("70DCHT21032");
		studentB.setName("Dao Xuan Nam");
		studentB.setAge(19);
		studentB.setHeight(1.7f);

		Student studentC = new Student();
		studentC.setId("70DCHT210234");
		studentC.setName("Dao Xuan ZZZ");
		studentC.setAge(89);
		studentC.setHeight(1.7f);

		// Set friend
		List<Student> listFriendOfStudentA = new ArrayList<>();
		listFriendOfStudentA.add(studentB);
		studentA.setFriends(listFriendOfStudentA);

		List<Student> listFriendOfStudentB = new ArrayList<>();
		listFriendOfStudentB.add(studentA);
		studentB.setFriends(listFriendOfStudentB);

		List<Student> listFriendOfStudentC = new ArrayList<>();
		listFriendOfStudentC.add(studentA);
		listFriendOfStudentC.add(studentB);
		studentC.setFriends(listFriendOfStudentC);

		studentC.getInfo();
		studentC.walk("Hanoi");

		// // Get friend cach 1
		// System.out.println("-----Thong tin ban be------");
		// for (Student student : studentC.getFriends()) {
		// System.out.println("ID friend: " + student.getId() + ", ");
		// System.out.println("Name friend: " + student.getName() + ", ");
		// System.out.println("Age friend: " + student.getAge() + ", ");
		// System.out.println("Height friend: " + student.getHeight() + "|");
		// }

		ArrayList<String> arrayListIdFriend=new ArrayList<>();
		// Get friend cach 2
		System.out.println("-----Thong tin ban be------");
		for (int i = 0; i < studentC.getFriends().size(); i++) {
			System.out.println("STT: " + i);
			studentC.getFriends().get(i).getInfo();
			arrayListIdFriend.add(i, studentC.getFriends().get(i).getId());
		}

		// Set array id friend
		studentC.setArrayIdFriend(arrayListIdFriend);
		// show array id friend
		System.out.println("All id friend");
		for (String item : studentC.getArrayIdFriend()) {
			System.out.print(item + ',');
		}
		System.out.println();

		System.out.println("-----So sinh vien hien tai------");
		System.out.println("University (from class): " + Student.universityName);
		System.out.println("University (from instance): " + studentC.universityName);
		System.out.println("Total student (from class): " + Student.total);
		Student.getInfoUniversity();
	}
}