package ex0824;

/**
 *
 * 1)동기화 없이 실행 → 공유 데이터에 여러 스레드가 접근할 때 발생하는 문제 확인 2)synchronized 적용 → 한 번에 하나의
 * 스레드만 임계영역에 진입함을 확인 하지만 실행 순서는 원하는 대로 제어되지 않음을 확인 3) wait() 적용 → 자기 차례가 아니면
 * lock 을 반납하고 대기 notify() 적용 → 작업 완료 후 상대 스레드를 깨움 마지막으로 notifyAll()과 notify()
 * 차이 설명
 * 
 * synchronized 는 "동시에 못 들어오게 하는 것", wait()/notify()는 "스레드 실행 순서를 협력적으로 제어하는 것"
 * wait()/notify()는 synchronized 블럭 안에서만 쓸수 있다
 */

public class SynchronizedExam {

	public static void main(String[] args) {
		System.out.println("*** 메인시작 ****");

		Bank bank = new Bank();

		CustomerThread th1 = new CustomerThread(bank, "입금자", true); // bank 공유
		CustomerThread th2 = new CustomerThread(bank, "인출자", false);// bank 공유

		th1.start();
		th2.start();

		System.out.println("*** 메인 끝 ****");
	}

}

//----------------------------------------------
//여러 스레드가 공유할 객체
/**
 * synchronized - 한 스레드가 이 메서드를 실행하는 동안 Bank 객체의 lock 을 획득한다. - 다른 스레드는 같은 객체의
 * synchronized 영역에 동시에 들어올 수 없다. wait() - 현재 스레드를 WAITING 상태로 보내고, 가지고 있던 lock
 * 을 반납한다. notify(), notifyAll() - wait() 중인 스레드를 깨운다. - 단, 깨어난 스레드는 즉시 실행되는 것이
 * 아니라 lock 을 다시 획득한 뒤 실행된다. 주의 - wait(), notify(), notifyAll()은 반드시 해당 객체의
 * synchronized 영역 안에서 호출해야 한다.
 */

class Bank {
	int balance; // 0

	public synchronized void balanceChange(String name, boolean state) { // synchronized 추가하면 개선된다
		if (state) { // 입금
			while (balance == 1) {
				System.out.println(name + "대기중~~잔액 : " + balance);
				try {
					wait(); // synchronized 있어서 가능
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.print(name + "==>현재잔액: " + balance + " / ");
			balance++;
			System.out.println(name + "==>증가후 현재잔액 : " + balance);

		} else {// 출금
			while (balance == 0) {
				System.out.println(name + "대기중~~잔액 : " + balance);
				try {
					wait(); // synchronized 있어서 가능
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.print(name + "==>현재잔액: " + balance + " / ");
			balance--;
			System.out.println(name + "==>감소후 현재잔액 : " + balance);

		}

		notifyAll();// wait() 에 의해 대기중인 스레드를 깨운다. synchronized 있어서 가능

	} // balanceChange 메소드 끝
} // Bank 클래스끝
//--------------------------------------------------
//입금 또는 인출을 수행하는 스레드 객체

class CustomerThread extends Thread {
	Bank bank;
	String name;
	boolean state;

	public CustomerThread(Bank bank, String name, boolean state) {
		super(name);

		this.bank = bank;
		this.name = name;
		this.state = state;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			// Bank 의 balanceChange 호출한다.
			bank.balanceChange(name, state);
		}
		System.out.println(name + "스레드가 종료합니다.^^");

	}// run 메소드 끝
}// CustomerThread 클래스 끝
