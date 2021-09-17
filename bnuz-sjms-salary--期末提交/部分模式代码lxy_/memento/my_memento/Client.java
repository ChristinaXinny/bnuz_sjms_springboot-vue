package lxy_.memento.my_memento;

public class Client {
	public static void main(String[] args) {
		NiuNiu nn = new NiuNiu();
		System.out.println(nn);
		IMemento mphoto = nn.takeMPhoto("��һ��");		
		
		
		PhotoAlbum album = new PhotoAlbum();
		album.putMPhoto("2020-01-01",mphoto);
		nn.growUp();//״̬�ı�
		IMemento mphoto1 = nn.takeMPhoto("�ڶ���");	
		album.putMPhoto("2020-01-02",mphoto1);
		nn.growUp();//״̬�ı�
		IMemento mphoto2 = nn.takeMPhoto("������");	
		album.putMPhoto("2020-01-03",mphoto2);
		
		nn.growUp();//״̬�ı�
		IMemento mphoto3 = nn.takeMPhoto("������");	
		album.putMPhoto("2020-01-04",mphoto3);
		IMemento reMPhoto = album.getMPhoto("2020-01-04");
		nn.restoreMPhoto(reMPhoto);
		System.out.println("restoreMPhoto===="+nn);
		reMPhoto = album.getMPhoto("2020-01-01");
		nn.restoreMPhoto(reMPhoto);
		System.out.println("restoreMPhoto===="+nn);
		Photo photo = nn.takePhoto("��һ��");
		album.put("2020-01-01",photo);	
		nn.growUp();//״̬�ı�
		System.out.println(nn);
		Photo photo1 = nn.takePhoto("�ڶ���");
		photo1.setHight(19999999);
		album.put("2020-01-02",photo1);
		nn.growUp();//״̬�ı�
		System.out.println(nn);
		Photo photo2 = nn.takePhoto("������");
		photo2.setHeadgirth(2000000);
		album.put("2020-01-031",photo2);
		nn.growUp();//״̬�ı�
		System.out.println(nn);
		Photo photo3 = nn.takePhoto("������");
		album.put("2020-01-04",photo3);
		Photo rephoto = album.getPhoto("2020-01-02");
		nn.restore(rephoto);
		System.out.println(nn);
		rephoto.setHeadgirth(1000);
		nn.restore(rephoto);
		System.out.println("=========");
		System.out.println(nn);
		rephoto = album.getPhoto("2020-01-01");
		nn.restore(rephoto);
		System.out.println(nn);
		rephoto = album.getPhoto("2020-01-04");
		nn.restore(rephoto);
		System.out.println(nn);
	}

}
