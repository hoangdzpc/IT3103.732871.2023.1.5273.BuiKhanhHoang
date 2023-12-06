//Bui Khanh Hoang 20215273
package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemInStore; // lưu trữ các mặt hàng bằng danh sách liên kết
			
	public Store() {
		itemInStore = new ArrayList<Media>();
	}
	public void addDVD(Media media) {
		itemInStore.add(media);
		System.out.println("Đĩa "+media.getTitle()+" được thêm thành công!");
	}

	public void addMedia(Media... medias) {
		for (Media media : medias) {
			itemInStore.add(media);
			System.out.println("Đĩa "+media.getTitle()+" được thêm thành công!");
		}
	}

	public void removeMedia(Media media){
		itemInStore.remove(media);
		System.out.println("Đã xóa đĩa "+media.getTitle());
	}
	
	public void removeMedia(Media... medias){
		for(Media media: medias){
			itemInStore.remove(media);
			System.out.println("Đã xóa đĩa "+media.getTitle());
		}
	}
	  public Media searchStore(String title){
	        for (Media disc: itemInStore){
	            if(disc.getTitle() == title){
	                System.out.println(disc.toString());
	                return disc;
	            }
	        }
	        System.out.println("Not found!");
			return null;	      
	    }
	public void printStore(){
		System.out.println("*******************************Store*******************************");
		for(Media media:itemInStore){
			System.out.println(media.toString());
		}
		System.out.println("*******************************************************************");
	}
}