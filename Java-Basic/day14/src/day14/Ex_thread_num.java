package day14;
// 실행 중인 thread 개수 확인ㅅㄱㅎ45
import day14.Ex_thread_no1;
import day14.Ex_thread_no2;

public class Ex_thread_num {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println("현재 thread name = " + curThread.getName());
		System.out.println("현재 동작 중인 쓰레드 갯수 = " + curThread.activeCount());
}
}