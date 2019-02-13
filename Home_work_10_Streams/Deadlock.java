package Home_work_10_Streams;

// Cause a deadlock.
// Organize the expectations of ending a thread in main(),
// and make the end of the method main() in this thread.

public class Deadlock {

	static Integer a = 2;
	static Integer b = 4;

	public static Integer getA() {
		return a;
	}

	public static void setA(Integer a) {
		Deadlock.a = a;
	}

	public static Integer getB() {
		return b;
	}

	public static void setB(Integer b) {
		Deadlock.b = b;
	}

	public static void main(String[] args) {

		Thread lock = new Thread(new ThreadLock());
		// ��� ����, ��� �� ����� ����� ����� �����, ��� ����� �������� ����
		// Thread � ��� ��-������, � � ������ �� ������� ��� ���� ThreadLock, ����
		// ������������
		// ��������� �������
		lock.start();

		System.out.println("hello");

		synchronized (Deadlock.getB()) {
			Thread.yield();
			try {
				Thread.sleep(100);
				// ��� ����, ��� ������ ���� ������� ��������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Deadlock.getA()) {
				Thread.yield();
			}
		}
		System.out.println("hello1");
		System.out.println("Hello2");
	}
}
