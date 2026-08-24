package ex0824;

public class InterruptedExam01 {

	public static void main(String[] args) {
		System.out.println("****메인 시작합니다.****");

		Thread th1 = new Thread(() -> {
			try {
				while (true) {
					System.out.println("곧 집에간다~~~~");
					Thread.sleep(1000); // 0.001초
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		th1.start();
//------------------위의 상황까지는...while 문 안에서 계속 돈다
//------------------그래서 멈추게 하고 싶다면 아래 처럼 코드를 준다.		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3초 후에 th1스레드 멈추게하고 싶다!!!
		th1.interrupt(); // InterruptedException 발생하려면 잠시라도 일시정지상태가 되어야 한다.
		// 바로 종료 되는게 아니라 한번이라도 멈추게 하는상황이 있어야 감지하고 멈춘다.
		// 예제 2번으로 가보자
		System.out.println("****메인 종료합니다.****");

	}

}
