package ex0811.exam;

public class Tv extends Elec implements ElecFunction {
	private int channel;

	public Tv() {
	}

	public Tv(int channel) {
		this.channel = channel;

	}

	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}

	@Override
	public void start() {
		System.out.println(getCode() + "제품" + super.getClass().getSimpleName() + "를" + channel + "으로 듣는다");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tv [channel=");
		builder.append(channel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
