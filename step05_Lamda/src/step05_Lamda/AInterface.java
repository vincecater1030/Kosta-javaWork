package step05_Lamda;

/**
 * @FunctionalInterface는 메소드가 한개일때 선언한다 단,기능이 있는 default, static 이 있는경우에도 쓸수있다
 */
@FunctionalInterface
public interface AInterface {
	void aa();

	default void ff() {
	}
}
