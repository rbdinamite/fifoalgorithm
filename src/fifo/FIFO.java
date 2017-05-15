/**
 * @author ROBERTO ABREU BENTO
 * @author FELIPE OLIVEIRA
 * 
 * @date 13/05/2017
 * @description FIFO CLASS
 * 
 */
package fifo;

import java.util.ArrayList;

public class FIFO {
	int sizeElement;
	int start;
	int size;
	ArrayList<Integer> vet;
	int end;
	
	public FIFO(){
		start = end = -1;
		size = 10;
		vet = new ArrayList<Integer>();
		sizeElement =0;
		add(1);
		add(4);
		add(2);
		add(7);
		add(3);
		add(5);
		add(6);
		add(4);	
	}
	public boolean empty(){
		if(sizeElement == 0){
			return true;
		}
		return false;
	}
	public boolean full(){
		if(sizeElement == size){
			return true;
		}
		return false;
	}
	
	public void add(int value ){
		if(!full()){
			if(start == -1){
				start = 0;
			}
			end++;
			vet.add(value);
			sizeElement++;
		}
	}
	public void remove(){ 
		if(!empty()){
			end--;
			sizeElement--;
			vet.remove(start);
		}
	}
	public void show(){
		String element = "";
		String traco = "";
		for(int i = start; i<=end; i++){
			element +=traco + vet.get(i);
			traco = " - ";
		}
		System.out.println(element);
	}
}
