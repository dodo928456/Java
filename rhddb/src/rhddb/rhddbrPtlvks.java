package rhddb;
import java.awt.*;
import javax.swing.*;

public class rhddbrPtlvks {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae",board);
		Thread th2 = new StudentThread("hyosoo",board);
		th1.start();
		th2.start();
	}
}

class SharedBoard{
	private int sum = 0;//집계합
	synchronized public void add(){
		int n = sum;
		Thread.yield();//현제실행중인 스레드 양보
		n += 10;//10증가
		sum = n;
		System.out.println(Thread.currentThread().getName() + ";" + sum);
	}
	public int getSum(){return sum;}
}
class StudentThread extends Thread{
	private SharedBoard board;//집게 주소
	public StudentThread(String name, SharedBoard board){
		super(name);
		this.board = board;
	}
	public void run(){
		for(int i=0; i<10; i++){
			board.add();
		}
	}
}

