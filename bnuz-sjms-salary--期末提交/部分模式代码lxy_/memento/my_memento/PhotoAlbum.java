package lxy_.memento.my_memento;

import java.util.HashMap;
import java.util.Map;

public class PhotoAlbum {
	//���޹�����Ƭ�ļ���
	private Map<String,Photo> photos = new HashMap<>();
//�Ź��ܵ���Ƭ����
	private Map<String,IMemento> mphotos = new HashMap<>();
	
	public void put(String key, Photo photo) {
		photos.put(key, photo);
		
	}

	public Photo getPhoto(String key) {
		
		return photos.get(key);
	}
//������Ƭ�Ĵ���ȡ
	public void putMPhoto(String key, IMemento mphoto) {
		mphotos.put(key, mphoto);		
	}
    public IMemento getMPhoto(String key) {		
		return mphotos.get(key);
	}

}
