package prob4;

import java.util.ArrayList;

public class MyStack implements Stack {
	private int stacksize;
	ArrayList<String> list;

	// 생성자
	public MyStack(int stacksize) {
		if(stacksize < 0)
		{
			System.out.println("스택사이즈를 잘못입력하셨습니다.");
			return;
		}
		this.stacksize = stacksize;
		list = new ArrayList<String>();
	}
	
	// getter & setter
	public int getStacksize() {
		return stacksize;
	}
	public void setStacksize(int stacksize) {
		this.stacksize = stacksize;
	}


	// 인터페이스 구현부분
	@Override
	public void push(String str) throws RuntimeException {
		if(list.size() < stacksize)
			list.add(str);
	}

	@Override
	public String pop() throws RuntimeException {
		String str = list.get(list.size()-1);
		if(list.size() > 0)
			list.remove(list.size()-1);
		return str;
	}

	@Override
	public boolean isEmpty() {
		if(list.size() == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		return list.size();
	}
	
//	public void print() {
//		System.out.println(list);
//	}
}
