package com.dac.GenericDemo;

	public class NumberDataStore<T extends Number> {

		private T number;

		public T getNumber() {
			return number;
		}

		public void setNumber(T number) {
			this.number = number;
		}
		
		
		
	}


