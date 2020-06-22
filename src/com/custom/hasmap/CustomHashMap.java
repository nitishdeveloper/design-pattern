package com.custom.hasmap;

import java.util.Arrays;

public class CustomHashMap<K , V> {
	
	private Entry<K, V>[] bucket;
	private int capacity = 4 ;
	
	static class Entry<K, V>{
		K key;
		V value;
		Entry<K, V> next;
		
		private Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}	
	}

	@SuppressWarnings("unchecked") 
	public CustomHashMap() {
		bucket = new Entry[capacity];;
	}
	
	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
	
	
	//put method
	public void put(K key , V value) {
		if(key == null)
			return;
		
		int hash = hash(key);
		System.out.println("hash code : "+hash);
		
		Entry<K, V> entry = new Entry<K , V>(key , value , null);
		
		if(bucket[hash] == null) {
			bucket[hash] = entry;
		}
		else {
			 Entry<K, V> previous = null;
			 Entry<K, V> current = bucket[hash];
			 
			 while(current != null) {
				  if(current.key.equals(key)) {
					  if(previous ==  null) {
						 entry.next = current.next;
						 bucket[hash] = entry;
						 return;
					  }else {
						  entry.next = current.next;
						  previous.next = entry;
					  }
				  }
				  previous = current;
				  current = current.next;
			 }
			 previous.next = entry;
		}
	}
	
	public V get(K key) {
		
		int hash = hash(key);
		System.out.println("get key hash : "+hash);
		
		if(bucket[hash] == null) {
			return null;
		}else {
			Entry<K, V> entrytemp = bucket[hash];
			while(entrytemp != null) {
				if(entrytemp.key.equals(key)) {
					return entrytemp.value;
				}
				entrytemp = entrytemp.next;
			}
		}
		return null;
	}
	
	public void display(){
	       
	       for(int i=0;i<capacity;i++){
	           if(bucket[i]!=null){
	                  Entry<K, V> entry=bucket[i];
	                  while(entry!=null){
	                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
	                        entry=entry.next;
	                  }
	           }
	       } 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(bucket);
		result = prime * result + capacity;
		return result;
	}
	
}	
