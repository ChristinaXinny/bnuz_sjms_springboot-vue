package lxy_.memento.my_memento;

public class NiuNiu {
	private double hight=50;
	private double weight=5;
	private double headgirth=20;
	/*
	 * ������Ƭ
	 */
	private class MPhoto implements IMemento{
		private double hight;
		private double weight;
		private double headgirth;
		public MPhoto() {
			
		}
		public MPhoto(double hight, double weight, double headgirth) {
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
	/*
	 * ����¼�е����ձ���
	 */
	public IMemento takeMPhoto(String string) {
		MPhoto p = new MPhoto(hight, weight, headgirth);		
		return p;
	}
	
	/*
	 * ԭ�е����ձ���
	 */
	public Photo takePhoto(String string) {
		Photo p = new Photo(hight, weight, headgirth);		
		return p;
	}

	public void growUp() {
		hight+=3; 
		weight+=5; 
		headgirth+=2;		
	}
	//�޹�����Ƭ��״̬�ָ�����
	public void restore(Photo rephoto) {
		hight = rephoto.getHight(); 
		weight =  rephoto.getWeight(); 
		headgirth = rephoto.getHeadgirth();
	}
	//������Ƭ��״̬�ָ�����
	public void restoreMPhoto(IMemento reMPhoto) {
		// TODO Auto-generated method stub
		MPhoto mp = (MPhoto)reMPhoto;
		hight = mp.getHight(); 
		weight =  mp.getWeight(); 
		headgirth = mp.getHeadgirth();		
	}
	
	
	@Override
	public String toString() {
		return "NiuNiu [hight=" + hight + ", weight=" + weight + ", headgirth=" + headgirth + "]";
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
