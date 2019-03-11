/**
* Author: Ettien Martinez
* Class ID: 476 
* Assignment: Assignment 3
* Description: This OrderedIntList will receive values and insert them into an
* array. The program will check for duplicate values, will sort the values in
* order, will return the size and length of the array and will also delete an item
* from the array. It will then check the array and adjust it so there is no overflow
* or make it smaller if it is more than 50% empty. After all this is done, the values
* in the array will be returned.
*/


package cse360assign3;

public class OrderedIntList 
{
	private int[] array; // initialize array
	private int counter; // initialize counter
	
	//default constructor
	OrderedIntList() {
		array = new int[10]; //set size of array
		//counter =0;
	}
	
	//Overloaded constructor
	OrderedIntList(int size){
		array = new int[size];
		//counter = 0;
	}
	
	/**  
	* Insert the values into the array, sort,
	* check for duplicates and increase capacity 
	* of the array if it is full by 50%.
	* 
	* @param value Int variable inserted into the array.  
	*/  
	public void insert (int value) {
		int secondIndex = 0; 
		boolean duplicate = false;
		
		//remove duplicates entered
		for (int index = 0; index < counter && value >= array[index]; index++, secondIndex++) {
			if(value == array[index]) {
				duplicate = true;
				}
		}
		
		//flip the boolean back to false
		if(duplicate == true) {
			return;
		}
		
		//check to see if array is full
		//increase capacity by 50% if it is full
		if(length() == size())
		{
			int[] secondArray = new int[((int)(1.5*array.length))];
			
			for(int index=0; index<array.length; index++){
				secondArray[index] = array[index];
			}
			array = secondArray;
		}
		
		//move the element's index
		int index = counter;
		while (index > secondIndex) {
			array[index] = array[--index];
		}
		array[secondIndex] = value;
		counter = counter + 1;
	}
	
	/**  
	* Initialize the variable size to the size of the array
	* (not the number of elements stored)
	* 
	* return size
	*/
	public int size(){
		int size = array.length;
		return size;
	}
	
	/**  
	* Initialize the variable length to the number of the elements
	* stored in the array (not the size of the array)
	* 
	* return length
	*/
	public int length(){
		int length = counter;
		return length;
	}
	
	/**  
	* Identify item to be deleted check to see 
	* if the item is in the array, if found, remove it
	* and move up all other numbers, maintain ascending order
	* If array changes after deletion of item; make sure not more 
	* than 50% empty, if so reduce capacity by 50%
	* 
	* @param key Int variable to identify number to be deleted.  
	*/
	public void delete (int key){
		int index;
		int secondIndex;
		
		//check if item is in array
		for(index = 0; index < counter; index++){
			if(key == array[index]){
				for(secondIndex = index + 1; secondIndex < counter; secondIndex++){
					array[secondIndex - 1] = array[secondIndex];
				}
				counter = counter - 1;
				
				if(size()-length() > (int)(size()/2)){
					int secondArray[] = new int[(int)(size()-size()/2)];
					for(index = 0; index < counter; index++){
						secondArray[index] = array[index];
					}
					array = secondArray;
				}
			}
		}
	}
	
	/**  
	* Return the elements in the array separated by space
	* 
	* Integers side by side; no space after the last integer
	*/
	public String toString(){
		if(length() == 0){
			return "";
		}
		else{
			String stringIntList = "";
			for(int index = 0; index < length()-1; index++){
				stringIntList = stringIntList + array[index] + " ";
			}
			stringIntList = stringIntList + array[length() - 1];
			
			return stringIntList;
		}
	}
}
