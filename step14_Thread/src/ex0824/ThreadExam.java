package ex0824;

import java.util.Random;

public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("*** 메인시작 ****");
		NumberThread th1 = new NumberThread("첫번째 Thread");
		NumberThread th2 = new NumberThread("두번째 Thread");

		AlphaThread alpha = new AlphaThread();
		Thread th3 = new Thread(alpha, "세번째 Thread");

		// th1.run();
		// th2.run();
		// th3.run();

		// run()을 직접 호출하면 싱글메인스레드로 순차적으로 동작한다
		// 그래서 각 Thread 의 start를 호출해서 실행준비 상태로 만든다
		// 실행준비상태에 있는 스레드 중에 가장 우선순위가 높은
		// 스레드가 running 상태가 되어 일을 한다 (서로 번갈아 가면서...)
		th1.start();
		th2.start();
		th3.start();

		// th1 스레드가 마무리할떄까지 현재스레드(메인) 정지상태가 된다
		/*
		 * try { th1.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 */

		System.out.println("총합=" + th1.sum);

		System.out.println("*** 메인 끝 ****");

	}
}

///////////////////////////////////////////////////////////
/**
 * 1~100까지 출력하는 스레드 -상속
 */
class NumberThread extends Thread {
	int sum;

	public NumberThread(String name) {
		super(name);
	}

	// Thread 로 작업할 기능 작성 - 반드시 run() 메소드 재정의
	@Override
	public void run() {
		Random r = new Random();// 랜덤한 변수 넣어줄수 있다(sleep 테스트)

		for (int i = 0; i <= 100; i++) {
			System.out.println(super.getName() + "=>" + i);
			sum += i;

			// sleep 테스트 ///////////////////////

//			 int no = r.nextInt(100); // 0~99
//			 try { 
//			 	Thread.sleep(no); // no초 대기 
//			 } catch (InterruptedException e) {
//			 	e.printStackTrace();
//			 }

			// 양보하는것으로 현재 스레드가 Runnable 상태로 간다.
			Thread.yield();

		}
		System.out.println(super.getName() + "END~~~");
	}
}

/**
 * A~Z 출력하는 스레드 -구현
 */
class AlphaThread implements Runnable {
	@Override
	public void run() {
		Thread th = Thread.currentThread();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(th.getName() + "==>" + ch);
//			try {
//				Thread.sleep(10);// 0.01초 대기
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			Thread.yield();

		}
		System.out.println(th.getName() + "End~~~~~~~~~~~~~");
	}

}
