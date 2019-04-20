package com.dac.GenericDemo;
	
	public class DataStore<T> {
		T element;
		public void setElement(T t){
			this.element = t;
		}
		
		public T getElement(){
			return element;
		}
	}


