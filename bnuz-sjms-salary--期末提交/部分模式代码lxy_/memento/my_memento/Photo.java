package lxy_.memento.my_memento;
/*
 * ���գ�����ֱ�����ڱ���¼ģʽ��
 */
public class Photo {
	private double hight;
	private double weight;
	private double headgirth;
	public Photo() {
		
	}
	public Photo(double hight, double weight, double headgirth) {
		super();
		this.hight = hight;
		this.weight = weight;
		this.headgirth = headgirth;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeadgirth() {
		return headgirth;
	}
	public void setHeadgirth(double headgirth) {
		this.headgirth = headgirth;
	}

}
