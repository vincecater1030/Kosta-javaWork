package ex0811.exam;

//ElecFunction 를 implements 한 구현객체
public class Audio extends Elec implements ElecFunction {

	private int volume;

	public Audio() {
	}

	public Audio(int volume) {
		this.volume = volume;

	}

	public Audio(String code, int cost, int volume) {
		super(code, cost);
		this.volume = volume;
	}

//재정의 영역
	@Override
	public void start() {
		System.out.println(getCode() + "제품" + super.getClass().getSimpleName() + "를" + volume + "으로 듣는다");
	}

	@Override
	public void stop() {
	}

	@Override
	public void display() {

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Audio [volume=");
		builder.append(volume);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}